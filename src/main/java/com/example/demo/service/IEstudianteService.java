package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	
	public void modificar(Estudiante estudiante);
	
	public Estudiante buscarPorId(Integer id);
	
	public void borrar(Integer id);
	
	public Estudiante buscarPorApellido(String apellido);
	
	public List<Estudiante> reporteEstudiantes(String apellido);
	
	public Estudiante reportePorApellidoyNombre(String apellido, String nombre);
	
	public Estudiante reportePorApellidoTyped(String apellido);
}
