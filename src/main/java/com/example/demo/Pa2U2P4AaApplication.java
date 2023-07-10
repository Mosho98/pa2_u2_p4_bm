package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.modelo.dto.MatriculaDTO;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IMatriculaService;

@SpringBootApplication
public class Pa2U2P4AaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4AaApplication.class, args);
	}

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IHotelService hotelService;
	
	
	@Override
	public void run(String... args) throws Exception {
	
List<EstudianteDTO> estudiantes=this.estudianteService.seleccionarTodosDto();
		
		System.out.println("////////////////Lista de estudiantes con consulta DTO/////////////////////");
		
		for(EstudianteDTO e:estudiantes) {
			System.out.println(e);
		}
		
		List<MatriculaDTO> matriculas=this.iMatriculaService.seleccionarTodosDto();
		System.out.println("/////////////////Lista de matriculas con consulta DTO///////////////////////");
		
		for(MatriculaDTO m:matriculas) {
			System.out.println(m);
		}
		
		
		
		List <Hotel> lazy= this.hotelService.buscarHotel(new BigDecimal(100));

		System.out.println("LISTA CON INNER JOIN");
		for(Hotel var: lazy) {
			System.out.println(var.getNombre());
			for(Habitacion ha: var.getHabitaciones()) {
				System.out.println("Las habitaciones de: " + var.getNombre());
			}
			System.out.println(var.getHabitaciones());

		}
		System.out.println("--------------------------------------------------");
		
		

		

	}

}
