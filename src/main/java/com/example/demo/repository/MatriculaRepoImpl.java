package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> seleccionarTodosDto() {
		// TODO Auto-generated method stub
		TypedQuery<MatriculaDTO> myQuery=this.entityManager.createQuery("select new com.example.demo.modelo.dto.MatriculaDTO(m.alumno.nombre,m.materia.nombre) FROM Matricula m", MatriculaDTO.class);
		return myQuery.getResultList();
	}
	
	
	

}
