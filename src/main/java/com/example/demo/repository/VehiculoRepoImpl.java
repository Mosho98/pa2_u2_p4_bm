package com.example.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

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
public class VehiculoRepoImpl implements IVehiculoRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Vehiculo seleccionarVehiculoDinamico(String color, String marca, BigDecimal precio) {
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Vehiculo> myCriteriaQuery = myBuilder.createQuery(Vehiculo.class);
		Root<Vehiculo> miTablaFrom = myCriteriaQuery.from(Vehiculo.class);

		// 3.Construye condiciones
		// peso >100 e.nombre = ? AND e.apellido = ?
		// peso <=100 e.nombre = ? OR e.apellido = ?
		Predicate pColor = myBuilder.equal(miTablaFrom.get("color"), color);

		Predicate pMarca = myBuilder.equal(miTablaFrom.get("marca"), marca);

		Predicate predicadoFinal = null;
		if (precio.compareTo(new BigDecimal(5000))%2 == 0) {
			predicadoFinal = myBuilder.or(pColor, pMarca);

		} else {
			predicadoFinal = myBuilder.and(pColor, pMarca);
		}

		// 4. Armamos mi SQL final
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);

		// 5. La ejecucion del query lo realizamos con TypedQuery
		TypedQuery<Vehiculo> myQueryFinal = this.entityManager.createQuery(myCriteriaQuery);

		return myQueryFinal.getSingleResult();
	}


	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
	this.entityManager.persist(vehiculo);
		
	}


	@Override
	public int eliminarPorPlaca(String placa) {
		Query myQuery = this.entityManager.createQuery("DELETE FROM Vehiculo e WHERE e.placa = :datoPlaca");
		myQuery.setParameter("datoPlaca", placa);
		myQuery.executeUpdate();
		return myQuery.executeUpdate();
		
	}


	@Override
	public int actualizarPorAnio(String modelo, String anio) {
		Query myQuery = this.entityManager.createQuery("UPDATE Vehicula e SET e.modelo = :datoModelo WHERE e.anio = :datoAnio");
		myQuery.setParameter("datoModelo", modelo);
		myQuery.setParameter("datoAnio", anio);
		
		return myQuery.executeUpdate();
	}
	
	
	

}
