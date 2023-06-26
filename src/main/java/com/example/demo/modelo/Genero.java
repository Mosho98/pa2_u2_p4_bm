package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "genero")
@Entity
public class Genero {

	@Id
	@SequenceGenerator(name = "seq_genero", sequenceName = "seq_genero", allocationSize = 1)
	@GeneratedValue(generator = "seq_genero", strategy = GenerationType.SEQUENCE)
	@Column(name = "gene_id")
	private Integer id;
	
	@Column(name = "gene_nombre")
	private String nombreGenero;
	
	@OneToMany(mappedBy = "genero")
	List<Pelicula> peliculas;

	
	//GET Y SET
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreGenero() {
		return nombreGenero;
	}

	public void setNombreGenero(String nombreGenero) {
		this.nombreGenero = nombreGenero;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Genero [id=" + id + ", nombreGenero=" + nombreGenero + ", peliculas=" +  "]";
	}
	
	
	
	
}
