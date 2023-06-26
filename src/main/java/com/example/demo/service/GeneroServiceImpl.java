package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Genero;
import com.example.demo.repository.IGeneroRepository;

@Service
public class GeneroServiceImpl implements IGeneroService{

	@Autowired
	private IGeneroRepository generoRepository;
	
	@Override
	public void guardar(Genero genero) {
		// TODO Auto-generated method stub
		this.generoRepository.insertar(genero);
	}
	
	

}
