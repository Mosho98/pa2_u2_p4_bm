package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Genero;
import com.example.demo.modelo.Pelicula;
import com.example.demo.service.IPeliculaService;

@SpringBootApplication
public class Tarea72Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Tarea72Application.class, args);
	}
	@Autowired
	private IPeliculaService iPeliculaService;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Pelicula> peliculas = new ArrayList<>();
		Pelicula p1 = new Pelicula();
		p1.setNombre("Spiderman 1");
		p1.setFechaLanzamiento(LocalDateTime.now());
		
		
		Pelicula p2 = new Pelicula();
		p2.setNombre("Spiderverse");
		p2.setFechaLanzamiento(LocalDateTime.now());
		
		peliculas.add(p1);
		peliculas.add(p2);
		
		Genero ficcion = new Genero();
		ficcion.setNombreGenero("Ficcion");
		ficcion.setPeliculas(peliculas);
		
		p1.setGenero(ficcion);
		p2.setGenero(ficcion);
		
		//this.iPeliculaService.crear(p1);
		Pelicula consulta = this.iPeliculaService.buscarPorNombre("Spiderman 1");
		System.out.println("////////////////CONSULTA CON QUERY SINGLE RESULT/////////////////");
		System.out.println(consulta);
		
		List<Pelicula> genero = this.iPeliculaService.buscarPorGenero("Ficcion");
		System.out.println("////////////////CONSULTA CON QUERY RESULT LIST/////////////////");
		for(Pelicula pelicula: genero) {
			System.out.println(pelicula);
		}
		
		
		
		
		Pelicula consultaTyped = this.iPeliculaService.buscarPorNombre("Spiderman 1");
		System.out.println("////////////////CONSULTA CON TYPED QUERY SINGLE RESULT/////////////////");
		System.out.println(consultaTyped);
		
		List<Pelicula> generoS = this.iPeliculaService.buscarPorGenero("Ficcion");
		System.out.println("////////////////CONSULTA CON TYPED QUERY RESULT LIST/////////////////");
		for(Pelicula pelicula: generoS) {
			System.out.println(pelicula);
		}
		
		
	}

}
