package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.CtaBancaria;

public interface ICuentaService {

	public void aperturar(CtaBancaria bancaria);
	public CtaBancaria seleccionar(Integer id);
	public void calculo(BigDecimal saldo);
	public void actualizar(CtaBancaria bancaria);
}
