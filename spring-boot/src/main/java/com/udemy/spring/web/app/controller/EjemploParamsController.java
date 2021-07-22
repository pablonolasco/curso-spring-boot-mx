package com.udemy.spring.web.app.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/params")
@Controller
public class EjemploParamsController {
	
	@GetMapping("/string")
	public String param(@RequestParam(name="texto") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es:"+texto);
		return "params/ver";
	}
	
	@GetMapping("/no-requerido")
	public String required(@RequestParam(name = "dato", required = false)String dato, Model model) {
		model.addAttribute("resultado", "Dato:"+dato);
		return "params/ver";
	}
	
	@GetMapping("/por-defecto")
	public String porDefecto(@RequestParam(name = "dato", defaultValue = "sin dato" )
	String dato, Model model) { 
		model.addAttribute("resultado", "dato:"+dato);
		return "params/ver";
	}
	
	@GetMapping("/datos")
	public String datos(@RequestParam String nombre, @RequestParam Integer edad, @RequestParam BigDecimal sueldo,Model model) {
		model.addAttribute("resultado", "Nombre:"+nombre+" edad:"+edad+" sueldo:"+sueldo);
		return "params/ver";
	}
	
	@GetMapping("/datos-request")
	public String datosRequest(HttpServletRequest request, Model model){
		String nombre=request.getParameter("nombre");
		Integer edad=Integer.parseInt(request.getParameter("edad"));
		BigDecimal sueldo=BigDecimal.valueOf(Double.valueOf(request.getParameter("sueldo")));
		model.addAttribute("resultado", "Nombre:"+nombre+" edad:"+edad+" sueldo:"+sueldo);
		return "params/ver";
	}
	
	@GetMapping("/principal")
	public String getParameters() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "params/index";
	}
	
	

}
