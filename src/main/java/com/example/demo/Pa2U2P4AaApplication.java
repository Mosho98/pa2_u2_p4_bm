package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
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
		
		List<Habitacion> habitaciones = new ArrayList<>();
		Hotel h1 = new Hotel();
		h1.setNombre("COCO BEACH");
		h1.setDireccion("PEDERNALES");
		
		Habitacion hab1 = new Habitacion();
		hab1.setNumero("A3");
		hab1.setValor(new BigDecimal(100));
		hab1.setHotel(h1);
		
		Habitacion hab2 = new Habitacion();
		hab2.setNumero("A4");
		hab2.setValor(new BigDecimal(130));
		hab2.setHotel(h1);
		
		habitaciones.add(hab1);
		habitaciones.add(hab2);
		
		h1.setHabitaciones(habitaciones);
		this.hotelService.crear(h1);
		
		
		Hotel buscar = this.hotelService.seleccionar(2);
		System.out.println("////////////////////////////////////////////////////");
		System.out.println(buscar);
		
		
		buscar.setNombre("ARENA Y MAR");
		this.hotelService.actualizar(buscar);
		
		System.out.println("/////////////////////ACTUALIZAR/////////////////");
		System.out.println(buscar);
		
		this.hotelService.eliminar(5);
		
		
		
	
		
		
		
		

		

	}

}
