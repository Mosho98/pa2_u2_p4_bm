package com.example.demo.repository;

import com.example.demo.modelo.Autor;

public interface IAutorRepository {

	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void eliminar(Integer id);
}
