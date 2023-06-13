package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CtaBancaria;
import com.example.demo.respository.ICuentaRepository;

@Service
public class CuentaServiceImpl implements ICuentaService{

	@Autowired
	private ICuentaRepository cuentaRepository;
	
	
	@Override
	public void aperturar(CtaBancaria bancaria) {
		// TODO Auto-generated method 

		int fecha = bancaria.getFechaApertura().getDayOfMonth();
		if(fecha %2 == 0) {
			BigDecimal saldo =  bancaria.getSaldo();
			BigDecimal nuevo = bancaria.getSaldo().multiply(new BigDecimal(0.5));
			bancaria.setSaldo(saldo.add(nuevo));
		}
		this.cuentaRepository.insertar(bancaria);
	}

	@Override
	public CtaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaRepository.buscar(id);
	}

	@Override
	public void calculo(BigDecimal saldo) {
		
		
		
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.cuentaRepository.actualizar(bancaria);
	}

}
