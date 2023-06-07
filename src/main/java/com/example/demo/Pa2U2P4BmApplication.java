package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4BmApplication.class, args);
	}
	@Autowired
	private IEstudianteService estudianteService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante estu = new Estudiante();
		estu.setNombre("Bryan");
		estu.setApellido("Mullo");
		estu.setCedula("1753054285");
		this.estudianteService.insertar(estu);
		
	}

}
