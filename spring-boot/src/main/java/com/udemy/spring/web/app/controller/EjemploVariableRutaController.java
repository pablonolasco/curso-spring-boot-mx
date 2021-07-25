package com.udemy.spring.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/variables")
@Controller
public class EjemploVariableRutaController {

	@GetMapping("/path-variable/{nombre}")
	// public String data(@PathVariable(name = "nombre")String otro,Model model) {
	public String data(@PathVariable String nombre, Model model) {
		model.addAttribute("respuesta", nombre);
		return "variables/ver";
	}

	@GetMapping("/path-variable/datos/{nombre}/{edad}")
	public String datos(@PathVariable String nombre,@PathVariable Integer edad, Model model) {
		model.addAttribute("respuesta", "nombre: "+nombre+" edad:"+edad);
		return "variables/ver";
	}
	
	@GetMapping("/principal")
	public String index() {
		return "variables/index";
	}
}
