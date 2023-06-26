package com.example.demo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "pelicula")
@Entity
public class Pelicula {
	
	@Id
	@SequenceGenerator(name = "seq_pelicula", sequenceName = "seq_pelicula", allocationSize = 1)
	@GeneratedValue(generator = "seq_pelicula", strategy = GenerationType.SEQUENCE)
	@Column(name = "peli_id")
	private Integer id;
	
	@Column(name = "peli_nombre")
	private String nombre;
	
	@Column(name = "peli_fecha_lanzamiento")
	private LocalDateTime fechaLanzamiento;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "peli_id_genero")
	private Genero genero;

	
	//GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	//TO STRING

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", genero="
				+  "]";
	}
	
	
	
	
	

}
