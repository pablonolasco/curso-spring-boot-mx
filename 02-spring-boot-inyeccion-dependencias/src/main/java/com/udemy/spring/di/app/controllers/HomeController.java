package com.udemy.spring.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.udemy.spring.di.app.service.IService;
import com.udemy.spring.di.app.service.MiServicio;

@Controller
public class HomeController {
	
	//private MiServicio miServicio= new MiServicio();
	//== Inyecta la dependencia
	@Autowired
	//== Indicas la implementacion que quieres que inyecte
	@Qualifier("miServicioComplejo")
	private IService miServicio;
	
	//== Inyectar dependencia en constructor, aunque no se coloque la palabra reservada @Autowired, 
	//== el core de spring lo reeconoce en automatico
	/*public HomeController(IService iService) {
		this.miServicio=iService;
	}*/
	
	@GetMapping({"/","index",""})
	public String index(Model model) {
		model.addAttribute("metodo", miServicio.operacion());
		return "index";
	}

	//== Inyectar dependencia en metodo
	/*@Autowired
	public void setMiServicio(IService miServicio) {
		this.miServicio = miServicio;
	}*/
	
	
	
	
}
