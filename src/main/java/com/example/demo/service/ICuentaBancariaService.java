package com.example.demo.service;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void apertura(CuentaBancaria cuentaBancaria);
	
	public void modificar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria consultar(Integer id);

}
