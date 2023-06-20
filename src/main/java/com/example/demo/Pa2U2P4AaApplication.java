package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Empleado;
import com.example.demo.service.CiudadanoService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	
	@Autowired
	private IHotelService hotelService;
	
	
	@Autowired
	private CiudadanoService ciudadanoService;
	
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Empleado e1 = new Empleado();
		
		Ciudadano c1 = new Ciudadano();
		c1.setNombre("Bryan");
		c1.setApellido("Mullo");
		c1.setCedula("1753054285");
		
		
		e1.setSueldo(new BigDecimal(900));
		e1.setCargo("Coordinador");
		e1.setCiudadano(c1);
		c1.setEmpleado(e1);
		
		this.ciudadanoService.registrar(c1);
		
		Ciudadano buscar = this.ciudadanoService.buscar(10);
		System.out.println("///////////////////BUSCAR//////////////");
		System.out.println(buscar);
		
		buscar.setApellido("Loor");
		this.ciudadanoService.guardar(buscar);
		System.out.println("///////////////////ACTUALZIAR//////////////");
		System.out.println(buscar);
	
		this.ciudadanoService.borrar(12);
		
		
		
	
		
		
		
		

		

	}

}
