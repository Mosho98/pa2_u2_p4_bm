package com.example.demo.service;

import com.example.demo.modelo.Autor;

public interface IAutorService {

	public void crear(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscarAutor(Integer id);
	public void eliminar(Integer id);
}
