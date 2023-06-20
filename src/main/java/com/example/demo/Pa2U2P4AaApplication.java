package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Autor;
import com.example.demo.modelo.Libro;
import com.example.demo.service.IAutorService;
import com.example.demo.service.ILibroService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	
	@Autowired
	private IAutorService autorService;
	@Autowired
	private ILibroService iLibroService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor();
		autor.setNombre("Bryan");
		autor.setApellido("Mullo");
		
		Libro libro = new Libro();
		
		 Set<Libro> libros = new HashSet<Libro>();
		 libros.add(libro);		 
		 Set<Autor> autores = new HashSet<Autor>();
		 autores.add(autor);
		 
		 autor.setLibros(libros);
		 libro.setAutores(autores);
		 
		 

		 this.autorService.crear(autor);
		
		

		

	}

}
