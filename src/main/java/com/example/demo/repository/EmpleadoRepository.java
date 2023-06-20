package com.example.demo.repository;

import com.example.demo.modelo.Empleado;

public interface EmpleadoRepository {

	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
    public Empleado seleccionar(Integer id);
	public void eliminar(Integer id);
}
