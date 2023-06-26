package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Pelicula;

public interface IPeliculaRepository {

	public void insertar(Pelicula pelicula);
	public Pelicula buscarPorNombre(String nombre);
	public List<Pelicula> buscarPorGenero(String genero);
	
	public Pelicula seleccionarPorNombreTyped(String nombre);
	public List<Pelicula> buscarPorGeneroTYPED(String genero);
	
	
}
