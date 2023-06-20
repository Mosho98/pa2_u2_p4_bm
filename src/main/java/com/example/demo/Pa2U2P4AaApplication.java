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

	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Set<Libro> libros = new HashSet<Libro> (); 
		Set<Autor> autores = new HashSet<Autor>();
		Autor au1 = new Autor();
		au1.setNombre("Hernando");
		au1.setApellido("Loor");
		
		Libro l1 = new Libro();
		l1.setTitulo("SISTEMAS");
		l1.setEditorial("Mullo");
		
		Libro l2 = new Libro();
		l2.setTitulo("SOFTWARE");
		l2.setEditorial("Mullo");
		
		libros.add(l1);
		libros.add(l2);
		
		autores.add(au1);
		
		l1.setAutores(autores);
		l2.setAutores(autores);
		
		au1.setLibros(libros);
		
		this.autorService.crear(au1);

		Autor autor = this.autorService.buscarAutor(11);
		System.out.println("/////////////////////////BUSCAR///////////////////");
		System.out.println(autor);
		
		autor.setApellido("PAUCAR");
		this.autorService.actualizar(autor);
		System.out.println("/////////////////////////ACTUALIZAR///////////////////");
		System.out.println(autor);
		
		this.autorService.eliminar(9);
		
		
	
		
		
		
		

		

	}

}
