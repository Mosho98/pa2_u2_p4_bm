package com.example.demo.modelo.dto;

public class EstudianteDTO {

	private String nombre;
	
	private String apellido;
	
	//La buena practica dice que cuando pongo un constructor diferente 
	//al por defecto se debe poner el constructor por defecto explicitamente
	
	public EstudianteDTO() {
	}

	//Generado con el IDE con el generate construct using field
	public EstudianteDTO(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}


	//SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

}
