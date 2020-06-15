package com.panchi.taller1u1.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.panchi.taller1u1.models.dao.IPelicula;
import com.panchi.taller1u1.models.entities.Pelicula;

@Service
public class PeliculaService implements IPeliculaService{

	@Autowired 
	private IPelicula dao;
	
	@Override
	public void save(Pelicula p) {
		dao.save(p);
	}

	@Override
	@Transactional
	public Pelicula findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Pelicula> findAll() {
		return (List<Pelicula>) dao.findAll();
	}

}
