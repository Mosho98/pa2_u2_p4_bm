package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public Vehiculo seleccionarVehiculoDinamico(String color, String marca, BigDecimal precio);
	public void insertarVehiculo(Vehiculo vehiculo);
	public int eliminarPorPlaca(String placa);
	public int actualizarPorAnio(String modelo, String anio);
}
