package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante);
	
	public Estudiante buscar(Integer id);
	
	public void eliminar(Integer id);
	
	public Estudiante seleccionarPorApellido(String apellido);
	
	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre);
	
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	
	public Estudiante buscaPorApellidoNamed(String apellido);
	
	

}
