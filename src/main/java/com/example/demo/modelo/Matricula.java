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

@Table(name = "matricula")
@Entity
public class Matricula {
	
	@Id
	@SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
	@GeneratedValue(generator = "seq_matricula", strategy = GenerationType.SEQUENCE)
	@Column(name = "mtra_id")
	private Integer id;
	
	@Column(name = "mtra_fecha_Matricula")
	private LocalDateTime fechaMatricula;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "matr_id_materia")
	private Materia materia;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "matr_id_alumno")
	private Alumno alumno;

	
	
	//GET Y SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	


	
	
	
	
	
}
