package com.udemy.spring.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.spring.di.app.models.domain.Factura;
@RequestMapping("/facturas")
@Controller
public class FacturaController {


	private final Factura factura;

	public FacturaController(Factura factura) {
		this.factura = factura;
	}

	@GetMapping("/detalle")
	public String index(Model model) {
		model.addAttribute("titulo", "Ejemplo factura");
		model.addAttribute("factura", factura);
		return "facturas/ver";
	}
}
