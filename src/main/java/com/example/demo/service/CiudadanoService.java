package com.example.demo.service;

import com.example.demo.modelo.Ciudadano;

public interface CiudadanoService {

	public void registrar(Ciudadano ciudadano);
	public void guardar(Ciudadano ciudadano);
    public Ciudadano buscar(Integer id);
	public void borrar(Integer id);
}
