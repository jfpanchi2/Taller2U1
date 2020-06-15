package com.panchi.taller1u1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.panchi.taller1u1.models.entities.Pelicula;
import com.panchi.taller1u1.models.services.IPeliculaService;

@Controller
@RequestMapping(value="/pelicula")
public class PeliculaController {
	@Autowired 
	private IPeliculaService srvPelicula;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Pelicula pelicula = new Pelicula();
		model.addAttribute("title","Registre la nueva pelicula");
		model.addAttribute("pelicula",pelicula); 
		return "pelicula/form"; 
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id,Model model) {
		Pelicula pelicula =srvPelicula.findById(id);
		model.addAttribute("pelicula",pelicula);
		return "pelicula/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id,Model model) {
		Pelicula pelicula =srvPelicula.findById(id);
		model.addAttribute("pelicula",pelicula);
		model.addAttribute("title","Actualizando el registro"+pelicula);
		return "pelicula/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id,Model model) {
		srvPelicula.delete(id);
		return "redirect:/pelicula/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Pelicula> peliculas = srvPelicula.findAll();
		model.addAttribute("peliculas",peliculas);
		model.addAttribute("title","Listado de peliculas");
		return "pelicula/list";
		
	}
	
	@PostMapping(value="/save")
	public String save(Pelicula pelicula,Model model) {
		this.srvPelicula.save(pelicula);
		return "redirect:/pelicula/list";
	}
	
	
	
}
