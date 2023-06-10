package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {


	public void crear(Estudiante estudiante);
	public Estudiante buscar(String cedula);
	public void actualizar(Estudiante estudiante);
	public void borrar(String cedula);
}
