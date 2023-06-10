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
		
		/*Estudiante estu = new Estudiante();
		estu.setNombre("Maoly");
		estu.setApellido("Loor");
		estu.setCedula("12345678");
		this.estudianteService.crear(estu);*/
		
		Estudiante actu = this.estudianteService.buscar("1753054285");		
		System.out.println(actu);
		System.out.println("//////////////////////////////////////////////////");
		actu.setApellido("Paucar");
		//this.estudianteService.actualizar(actu);
		
		this.estudianteService.borrar("12345678");
		
		
		
		
		
	}

}
