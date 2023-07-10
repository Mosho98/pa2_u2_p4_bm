package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.dto.MatriculaDTO;
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
	
	@Override
	public List<MatriculaDTO> seleccionarTodosDto() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.seleccionarTodosDto();
	}

}
