package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cuentaBancaria")
public class CuentaBancaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_cuentaBancaria")
	@SequenceGenerator(name = "seq_cuentaBancaria",sequenceName = "seq_cuentaBancaria", allocationSize = 1)
	@Column(name="cuen_id")
	private Integer id;
	
	@Column(name="cuen_numero")
	private String numero;
	
	@Column(name="cuen_tipo")
	private String tipo;
	
	@Column(name="cuen_fechaApertura")
	private LocalDateTime fechaApertura;
	
	@Column(name="cuen_saldo")
	private BigDecimal saldo;
	
	@Column(name="cuen_cedulaPropietario")
	private String cedulaPropietario;

	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(LocalDateTime fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura
				+ ", saldo=" + saldo + ", cedulaPropietario=" + cedulaPropietario + "]";
	}
	
	
	

}
