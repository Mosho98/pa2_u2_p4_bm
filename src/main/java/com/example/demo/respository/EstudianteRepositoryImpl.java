package com.example.demo.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository{

	List<Estudiante> estudiantes = new ArrayList<>();
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudiantes.add(estudiante);
	}

}
