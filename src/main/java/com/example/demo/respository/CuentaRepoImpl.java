package com.example.demo.respository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CtaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaRepoImpl implements ICuentaRepository{
	
	
@PersistenceContext
	private EntityManager entityManager;


	@Override
	public void insertar(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);
	}

	@Override
	public CtaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CtaBancaria.class, id);
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
	}

}
