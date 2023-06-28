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
		e1.setNombre("Maoly");
		e1.setApellido("Paucar");
		e1.setCedula("12345");
		
		//this.estudianteService.agregar(e1);
	
	
		
		System.out.println("\n///////////////BUSQUEDA POR APELLIDO NAMED////////////////");
		Estudiante named = this.estudianteService.buscaPorApellidoNamed("Mullo");
		System.out.println(named);

		System.out.println("\n///////////////BUSQUEDA POR APELLIDO TYPED NAMED QUERY////////////////");
		Estudiante namedTyped = this.estudianteService.seleccionarPorApellidoNamedQuery("Mullo");
		System.out.println(namedTyped);
		
		System.out.println("\n///////////////BUSQUEDA POR NOMBRE TYPED NAMED QUERY////////////////");
		Estudiante namedTypedNombre = this.estudianteService.seleccionarPorNombreNamedQuery("Bryan");
		System.out.println(namedTypedNombre);
		
		
		System.out.println("\n///////////////BUSQUEDA POR APELLIDO TYPED NATIVE QUERY////////////////");
		Estudiante nativeQuery = this.estudianteService.seleccionarPorApellidoNativeQuery("Mullo");
		System.out.println(nativeQuery);
		
		System.out.println("\n///////////////BUSQUEDA POR APELLIDO TYPED NAMED NATIVE QUERY////////////////");
		Estudiante nativeNamed = this.estudianteService.seleccionarPorApellidoNativeQueryNamed("Mullo");
		System.out.println(nativeNamed);
		
		System.out.println("\n///////////////BUSQUEDA POR NOMBRE TYPED NAMED NATIVE QUERY////////////////");
		Estudiante nativeNamedNombre = this.estudianteService.seleccionarPorNombreNativeQueryNamed("Fernando");
		System.out.println(nativeNamedNombre);
		
		System.out.println("\n///////////////BUSQUEDA POR APELLIDO CRITERIA API QUERY QUERY////////////////");
		//Estudiante ncriteriaApiQuery = this.estudianteService.se
		//System.out.println(ncriteriaApiQuery);
		
		
		

		

	}

}
