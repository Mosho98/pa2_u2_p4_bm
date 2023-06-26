package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Pelicula;

public interface IPeliculaService {

	public void crear(Pelicula pelicula);
	public Pelicula buscarPorNombre(String nombre);
	public List<Pelicula> buscarPorGenero(String genero);
}
