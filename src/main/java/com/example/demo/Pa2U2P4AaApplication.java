package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Alumno;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.service.IMatriculaService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	
@Autowired
private IMatriculaService iMatriculaService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	
		Alumno a1 = new Alumno();
		a1.setNombre("Bryan");
		
		Materia m1 = new Materia();
		m1.setNombre("Programacion Avanzada");
		
		Matricula mat1 =  new Matricula();
		mat1.setAlumno(a1);
		mat1.setMateria(m1);
		mat1.setFechaMatricula(LocalDateTime.now());
		
	
		this.iMatriculaService.crear(mat1);
		
		
		
		

		

	}

}
