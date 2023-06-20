package com.example.demo.service;

import com.example.demo.modelo.Empleado;

public interface EmpleadoService {
	
	public void registrar(Empleado empleado);
	public void guardar(Empleado empleado);
    public Empleado buscar(Integer id);
	public void borrar(Integer id);
}
