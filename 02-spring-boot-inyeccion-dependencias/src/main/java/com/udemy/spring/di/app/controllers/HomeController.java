package com.udemy.spring.di.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.udemy.spring.di.app.service.MiServicio;

@Controller
public class HomeController {
	
	private MiServicio miServicio= new MiServicio();
	@GetMapping({"/","index",""})
	public String index(Model model) {
		model.addAttribute("metodo", miServicio.operacion());
		return "index";
	}
	
}
