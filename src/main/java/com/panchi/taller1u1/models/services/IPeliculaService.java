package com.panchi.taller1u1.models.services;

import java.util.List;

import com.panchi.taller1u1.models.entities.Pelicula;



public interface IPeliculaService {
	public void save(Pelicula p);
	public Pelicula findById(Integer id);
	public void delete(Integer id);
	public List<Pelicula> findAll();
}
