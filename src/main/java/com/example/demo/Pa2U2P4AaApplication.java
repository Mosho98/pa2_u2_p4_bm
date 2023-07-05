package com.example.demo;

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
		e1.setNombre("Maria");
		e1.setApellido("Palma");
		e1.setCedula("1234567");
		e1.setPeso(70.00);
		
		//this.estudianteService.agregar(e1);
		
		Estudiante peso = this.estudianteService.seleccionarEstudinteDinamico("Maria", "Palma", 70.00);
		
		System.out.println("////////////////////////////ESTUDIANTE PESO////////////////////////////");
		System.out.println(peso);
		
		
		System.out.println("////////////////////////////ELIMINAR DINAMICO////////////////////////////");
		int eliminarNombre = this.estudianteService.eliminarPorNombre("Eduardo");
		System.out.println(eliminarNombre);
		
		System.out.println("\n////////////////////////////ACTUALIZAR DINAMICO////////////////////////////");
		int actualizar = this.estudianteService.actualizarPorApellido("Juan", "Palma");
		System.out.println(actualizar);
	
	
		
	
		
		
		
		
		

		

	}

}
