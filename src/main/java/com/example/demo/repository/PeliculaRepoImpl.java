package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PeliculaRepoImpl implements IPeliculaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pelicula);
	}

	@Override
	public Pelicula buscarPorNombre(String nombre) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p WHERE p.nombre = :datoNombre");
		myQuery.setParameter("datoNombre", nombre);		
		return (Pelicula) myQuery.getSingleResult();
	}

	@Override
	public List<Pelicula> buscarPorGenero(String genero) {
		Query myQuery = this.entityManager.createQuery("SELECT p FROM Pelicula p WHERE p.genero.getNombreGenero() = :datoGenero");
		myQuery.setParameter("datoGenero", genero);		
		return myQuery.getResultList();

	}

	@Override
	public Pelicula seleccionarPorNombreTyped(String nombre) {
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT  e FROM Pelicula e WHERE e.nombre = :datoNombre", Pelicula.class);
		myQuery.setParameter("datoNombre", nombre);	
		return myQuery.getSingleResult();
	}

	@Override
	public List<Pelicula> buscarPorGeneroTYPED(String genero) {
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT  e FROM Pelicula e WHERE e.genero.getNombre() = :datoGenero", Pelicula.class);
		myQuery.setParameter("datoGenero", genero);	
		return myQuery.getResultList();
	}

}
