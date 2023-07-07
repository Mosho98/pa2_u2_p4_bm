package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public Vehiculo seleccionarVehiculoDinamico(String color, String marca, BigDecimal precio) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.seleccionarVehiculoDinamico(color, marca, precio);
	}

	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertarVehiculo(vehiculo);
	}

	@Override
	public int eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.eliminarPorPlaca(placa);
	}

	@Override
	public int actualizarPorAnio(String modelo, String anio) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.actualizarPorAnio(modelo, anio);
	}
	
	

}
