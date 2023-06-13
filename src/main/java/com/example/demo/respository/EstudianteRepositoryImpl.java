package com.example.demo.respository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}
	
	
	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method st
		
		this.entityManager.merge(estudiante);
	}
	
	
	@Override
	public Estudiante buscar(String cedula) {
		
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estudiante = this.buscar(cedula);
		this.entityManager.remove(estudiante);
	}

}
