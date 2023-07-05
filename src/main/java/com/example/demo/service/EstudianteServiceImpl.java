package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void modificar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepo.eliminar(id);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		
		return this.estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> reporteEstudiantes(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante reportePorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Estudiante reportePorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante buscaPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscaPorApellidoNamed(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNativeQuery(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNativeQueryNamed(apellido);
	}

	@Override
	public Estudiante seleccionarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorNombreNamedQuery(nombre);
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorNombreNativeQueryNamed(nombre);
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoCriteriaApiQuery(apellido);
	}

	@Override
	public Estudiante seleccionarEstudinteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarEstudinteDinamico(nombre, apellido, peso);
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.eliminarPorNombre(nombre);
	}

	@Override
	public int actualizarPorApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.actualizarPorApellido(nombre, apellido);
	}

}
