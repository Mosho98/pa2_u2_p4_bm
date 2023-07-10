package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

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
	
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	
	public Estudiante seleccionarPorNombreNamedQuery(String nombre); 
	
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
	
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);
	
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido);
	
	public Estudiante seleccionarEstudinteDinamico(String nombre, String apellido, Double peso);
	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre, String apellido);
	
	public List<EstudianteDTO> seleccionarTodosDto();
	
	
	

}
