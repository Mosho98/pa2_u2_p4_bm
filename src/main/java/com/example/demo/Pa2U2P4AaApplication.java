package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{
	
	
@Autowired
private IEstudianteService estudianteService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Autowired
	private IVehiculoService iVehiculoService;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Estudiante e1 = new Estudiante();
		e1.setNombre("Maria");
		e1.setApellido("Palma");
		e1.setCedula("1234567");
		e1.setPeso(70.00);
		
		//this.estudianteService.agregar(e1);
		
		Estudiante peso = this.estudianteService.seleccionarEstudinteDinamico("Maria", "Palma", 70.00);
		
		System.out.println("////////////////////////////ESTUDIANTE PESO////////////////////////////");
		System.out.println(peso);
		
		
		System.out.println("////////////////////////////ELIMINAR DINAMICO////////////////////////////");
		int eliminarNombre = this.estudianteService.eliminarPorNombre("Eduardo");
		System.out.println(eliminarNombre);
		
		System.out.println("\n////////////////////////////ACTUALIZAR DINAMICO////////////////////////////");
		int actualizar = this.estudianteService.actualizarPorApellido("Juan", "Palma");
		System.out.println(actualizar);*/
	
	
		Vehiculo v1 = new Vehiculo();
		v1.setModelo("Sail");
		v1.setMarca("Chevrolet");
		v1.setPlaca("LBB7250");
		v1.setColor("Rojo");
		v1.setAnio("2015");
		v1.setPrecio(new BigDecimal(8000));
		//this.iVehiculoService.insertarVehiculo(v1);
		
		System.out.println("////////////////////////////VEHICULO////////////////////////////");
		Vehiculo vehi = this.iVehiculoService.seleccionarVehiculoDinamico("Rojo", "Mazda", new BigDecimal(14000));
		System.out.println(vehi);
	
		System.out.println("////////////////////////////ELIMINAR DINAMICO////////////////////////////");
		int eliminarPorPlaca = this.iVehiculoService.eliminarPorPlaca("LBB7250");
		System.out.println("Se eliminaron: " + eliminarPorPlaca);
		
		System.out.println("\n////////////////////////////ACTUALIZAR DINAMICO////////////////////////////");
		int actualizar = this.iVehiculoService.actualizarPorAnio("BT50123", "2014");
		System.out.println("Se actualizaron: " + actualizar);
		
		
		
		

		

	}

}
