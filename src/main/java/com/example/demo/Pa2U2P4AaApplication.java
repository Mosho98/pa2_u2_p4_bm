package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	
@Autowired
private IEstudianteService estudianteService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Maoly");
		e1.setApellido("Paucar");
		e1.setCedula("12345");
		
		//this.estudianteService.agregar(e1);
	
		System.out.println("///////////////BUSQUEDA POR APELLIDO////////////////");
		Estudiante estu = this.estudianteService.buscarPorApellido("Mullo");		
		System.out.println(estu);
		
		
		System.out.println("////////////////BUSCAR LISTA DE ESTUDIANTES///////////////");
		List<Estudiante> estudiantes = this.estudianteService.reporteEstudiantes("Paucar");
		
		for(Estudiante esdt : estudiantes) {
			System.out.println(esdt);
		}
		
		
		System.out.println("///////////////////BUSCAR POR APELLIDO Y NOMBRE////////");
		Estudiante estu1 = this.estudianteService.reportePorApellidoyNombre("Paucar", "Maoly");
		System.out.println(estu1);
		
		
		System.out.println("///////////////BUSQUEDA POR APELLIDO TYPED////////////////");
		Estudiante typed = this.estudianteService.reportePorApellidoTyped("Mullo");
		System.out.println(typed);
		

		

	}

}
