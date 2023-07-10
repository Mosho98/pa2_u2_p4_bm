package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.dto.MatriculaDTO;

public interface IMatriculaService {

	public void crear(Matricula matricula);
	
	public List<MatriculaDTO> seleccionarTodosDto();
}
