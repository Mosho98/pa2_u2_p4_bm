package com.example.demo.modelo.dto;

public class MatriculaDTO {
	
	private String nombreEstudiante;
	private String nombreMatricula;
	
	public MatriculaDTO() {

	}
	public MatriculaDTO(String nombreEstudiante, String nombreMatricula) {
		super();
		this.nombreEstudiante = nombreEstudiante;
		this.nombreMatricula = nombreMatricula;
	}
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public String getNombreMatricula() {
		return nombreMatricula;
	}
	public void setNombreMatricula(String nombreMatricula) {
		this.nombreMatricula = nombreMatricula;
	}
	@Override
	public String toString() {
		return "MatriculaDTO [nombreEstudiante=" + nombreEstudiante + ", nombreMatricula=" + nombreMatricula + "]";
	}
	
	
	

}
