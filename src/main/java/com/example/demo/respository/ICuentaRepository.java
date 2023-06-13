package com.example.demo.respository;

import com.example.demo.modelo.CtaBancaria;

public interface ICuentaRepository {

	public void insertar(CtaBancaria bancaria);
	public CtaBancaria buscar(Integer id);
	public void actualizar(CtaBancaria bancaria);
	
}
