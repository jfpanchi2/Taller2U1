package com.panchi.taller1u1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")  
public class MainController {
@GetMapping(value= {"/","/index.html"})
	
	public String index(Model model) { // se retorna sin la extension
		return "index";
	}
		
	@GetMapping(value="/tables.html")
	public String tables(Model model) {						
		return "tables";
	}
	
	@GetMapping(value="/register.html")
	public String register(Model model) {						
		return "register";
	}
}
