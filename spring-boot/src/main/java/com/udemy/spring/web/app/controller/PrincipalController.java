package com.udemy.spring.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/")
	public String home() {
		//return "redirect:/app/perfil";
		//==Se usa para redirecciones a rutas externas 
		//return "redirect:https://www.google.com";
		
		//==No coloca la ruta en el navegador y se usan en spring para redireccionar
		return "forward:/app/perfil";
	}
}
