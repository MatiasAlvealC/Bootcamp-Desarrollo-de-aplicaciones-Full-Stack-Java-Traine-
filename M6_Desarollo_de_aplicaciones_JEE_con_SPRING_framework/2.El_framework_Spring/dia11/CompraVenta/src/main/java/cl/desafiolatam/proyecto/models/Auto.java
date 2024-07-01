package cl.desafiolatam.proyecto.models;

import java.sql.Date;

import org.springframework.data.annotation.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	private Float velocidad;
	private String color;
	private Float valor;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	public Auto() {
		super();
	}

	public Auto(String marca, String modelo, Float velocidad, String color, Float valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.color = color;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}