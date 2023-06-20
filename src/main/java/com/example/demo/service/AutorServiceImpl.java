package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Autor;
import com.example.demo.repository.IAutorRepository;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepository autorRepository;
	@Override
	public void crear(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepository.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepository.actualizar(autor);
	}

	@Override
	public Autor buscarAutor(Integer id) {
		// TODO Auto-generated method stub
		return this.autorRepository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.autorRepository.eliminar(id);
	}

}
