package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Estudiante estu = this.buscar(id);
		this.entityManager.remove(estu);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {

		// SELECT * FROM estudiante e WHERE e.estu_apellido =
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido =
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		Query myQuery = this.entityManager
				.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscaPorApellidoNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT *FROM estudiante WHERE estu_apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellidoNative",
				Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNamedQuery(String nombre) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		// 1. Especificar el tipo de retorno que tiene mi query
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// 2. Empezamos a crear el SQL
		// 2.1 Definimos el FROM (Root)
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class); // FROM Estudiante

		// 3. Construir las condiciones de mi SQL
		// Condiciones se conocen como predicados
		// e.apellido = :datoApellido
		Predicate condicionApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		// 4. Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(condicionApellido);

		// 5. La ejecucion del query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);

		return myQueryFinal.getSingleResult();

	}

	@Override
	public Estudiante seleccionarEstudinteDinamico(String nombre, String apellido, Double peso) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class);

		// 3.Construye condiciones
		// peso >100 e.nombre = ? AND e.apellido = ?
		// peso <=100 e.nombre = ? OR e.apellido = ?
		Predicate pNombre = myBuilder.equal(miTablaFrom.get("nombre"), nombre);

		Predicate pApellido = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		Predicate predicadoFinal = null;
		if (peso.compareTo(Double.valueOf(100)) <= 0) {
			predicadoFinal = myBuilder.or(pNombre, pApellido);

		} else {
			predicadoFinal = myBuilder.and(pNombre, pApellido);
		}

		// 4. Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);

		// 5. La ejecucion del query lo realizamos con TypedQuery
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);

		return myQueryFinal.getSingleResult();
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		//DELETE FROM estudiante WHERE estu.nombre = ?
		//DELETE FROM Estudiante e WHERE e.nombre = :datoNombre;
		
		Query myQuery = this.entityManager.createQuery("DELETE FROM Estudiante e WHERE e.nombre = :datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.executeUpdate();
		return myQuery.executeUpdate();
		
	}

	@Override
	public int actualizarPorApellido(String nombre, String apellido) {
		//SQL
		//UPDATE estudiante SET estu_apellido = ? WHERE estu_apellido = ?
		//JPQL
		//UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido
		Query myQuery = this.entityManager.createQuery("UPDATE Estudiante e SET e.nombre = :datoNombre WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoApellido", apellido);
		
		return myQuery.executeUpdate();
		
	}

	@Override
	public List<EstudianteDTO> seleccionarTodosDto() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteDTO> myQuery=this.entityManager.createQuery("SELECT NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre, e.apellido) FROM Estudiante e ",EstudianteDTO.class);
		return myQuery.getResultList();
	}

}
