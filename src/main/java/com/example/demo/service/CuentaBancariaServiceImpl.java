package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	
	@Autowired
	private ICuentaBancariaRepo bancariaRepo;

	@Override
	public void apertura(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		
		LocalDateTime fechaApe=LocalDateTime.now();
		cuentaBancaria.setFechaApertura(fechaApe);
		int diaMes=fechaApe.getDayOfMonth();
		if(diaMes%2==0) {
			BigDecimal saldoAper=cuentaBancaria.getSaldo();
			BigDecimal saldoPromocion=cuentaBancaria.getSaldo().multiply(new BigDecimal(0.05));
			BigDecimal saldoFinal=saldoAper.add(saldoPromocion);
			cuentaBancaria.setSaldo(saldoFinal);
		}
		this.bancariaRepo.insertar(cuentaBancaria);
	}

	@Override
	public void modificar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.actualizar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepo.buscar(id);
	}

}
