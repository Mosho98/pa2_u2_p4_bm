package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")

@NamedQueries({
		@NamedQuery(name = "Estudiante.buscaPorApellido", query = "SELECT  e FROM Estudiante e WHERE e.apellido = :datoApellido"),
		@NamedQuery(name = "Estudiante.buscaPorNombre", query = "SELECT  e FROM Estudiante e WHERE e.nombre = :datoNombre") 
		})

@NamedNativeQueries({
		@NamedNativeQuery(name = "Estudiante.buscaPorApellidoNative", query = "SELECT  *FROM estudiante  WHERE estu_apellido = :datoApellido", resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscaPorNombreNative", query = "SELECT  *FROM estudiante  WHERE estu_nombre = :datoNombre", resultClass = Estudiante.class) 
		})

public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estudiante")
	@SequenceGenerator(name = "seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;

	@Column(name = "estu_cedula")
	private String cedula;
	
	@Column(name = "estu_peso")
	private Double peso;
	

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	// SET Y GET
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

}
