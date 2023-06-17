package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	@Autowired
	private CiudadanoService ciudadanoService;
	
	@Autowired
	private EmpleadoService empleadoService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Empleado empleado = new Empleado();
		Ciudadano ciudadano = new Ciudadano();

		ciudadano.setApellido("Andrango");
		ciudadano.setNombre("Alex");
		ciudadano.setCedula("1724693740");
	
		empleado.setCargo("Coordinador");
		empleado.setSueldo(new BigDecimal(400));
		
		ciudadano.setEmpleado(empleado);
	    empleado.setCiudadano(ciudadano);
	    
	    this.ciudadanoService.registrar(ciudadano);
	    //this.empleadoService.registrar(empleado);

	}

}
