package com.panchi.taller1u1.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_pelicula")
	private Integer idpelicula;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="año_estreno")
	private Integer anioEstreno;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="duracion")
	private Integer duracion;

	public Pelicula() {
		super();
	}

	public Pelicula(Integer id) {
		super();
		this.idpelicula = id;
	}

	public Integer getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(Integer idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(Integer anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + "]";
	}
	
	
	
}
