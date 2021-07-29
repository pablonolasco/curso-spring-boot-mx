package com.udemy.spring.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.udemy.spring.di.app.service.IService;
import com.udemy.spring.di.app.service.MiServicio;

@Controller
public class HomeController {
	
	//private MiServicio miServicio= new MiServicio();
	// Inyecta la dependencia
	@Autowired
	private IService miServicio;
	@GetMapping({"/","index",""})
	public String index(Model model) {
		model.addAttribute("metodo", miServicio.operacion());
		return "index";
	}
	
}
