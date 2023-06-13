package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CtaBancaria;
import com.example.demo.modelo.Estudiante;
import com.example.demo.respository.ICuentaRepository;
import com.example.demo.service.ICuentaService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P4BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4BmApplication.class, args);
	}
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICuentaService cuentaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		CtaBancaria cta = new CtaBancaria();
		cta.setNumero("1234");
		cta.setTipo("A");
		cta.setFechaApertura(LocalDateTime.now());
		cta.setSaldo(new BigDecimal(100));
		cta.setCedulaPropietario("1753054285");
		this.cuentaService.aperturar(cta);
		
		CtaBancaria ac = this.cuentaService.seleccionar(1);
		ac.setSaldo(new BigDecimal(200));
		this.cuentaService.actualizar(cta);
		System.out.println("/////////////////////////CONSULTA/////////////////////////////////////////");
		System.out.println("CEDULA:" + ac.getCedulaPropietario() + "     Saldo: " + ac.getSaldo());
		
	
		
	
		
		
		
		
	}

}
