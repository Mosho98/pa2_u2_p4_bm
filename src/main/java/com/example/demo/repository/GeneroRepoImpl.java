package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Genero;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class GeneroRepoImpl implements IGeneroRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Genero genero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(genero);
	}

}
