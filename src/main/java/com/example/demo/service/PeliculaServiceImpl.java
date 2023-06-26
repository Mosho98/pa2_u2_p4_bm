package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Pelicula;
import com.example.demo.repository.IPeliculaRepository;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	private IPeliculaRepository iPeliculaRepository;
	
	
	@Override
	public void crear(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.iPeliculaRepository.insertar(pelicula);
	}

	@Override
	public Pelicula buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iPeliculaRepository.buscarPorNombre(nombre);
	}

	@Override
	public List<Pelicula> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.iPeliculaRepository.buscarPorGenero(genero);
	}

}
