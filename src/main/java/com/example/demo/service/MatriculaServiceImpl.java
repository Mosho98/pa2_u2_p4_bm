package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.insertar(matricula);
	}

}
