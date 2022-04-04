package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {
	
	// GetMapping("/index")
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String mostratIndex(Model model) {
		return "categorias/listCategorias";
	}

	// GetMapping("/create")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear(Model model) {
		return "categorias/formCategoria";
	}
	
	// GetMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion) {
		System.out.print("Categoría: " +  nombre + "descripción: " +  descripcion);
		return "categorias/listCategorias";
	}
}
