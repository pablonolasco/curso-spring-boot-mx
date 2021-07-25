package com.udemy.spring.web.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import com.udemy.spring.web.app.models.Usuario;

@Controller
@RequestMapping(value = "/app")
public class HomeController {
	
	@Value("");
	private String textIndex;
	private String textPerfil;
	private String textoListar;
	
	
	
	@GetMapping(value="/principal")
	public String index(Model model) {
	//public String index(ModelMap model){
	//public String index(Map<String, Object> model){
	//@GetMapping({"principal","/","home"})
	//public ModelAndView index(ModelAndView mv){
		model.addAttribute("titulo", "Hola index");
		//mv.addObject("titulo", "Hola mundo");
		//mv.setViewName("index");
		return "index";
		//return mv;
	}
	
	@GetMapping({"/perfil"})
	public String perfil(Model model) {
		Usuario usuario= new Usuario();
		usuario.setNombre("pablo");
		usuario.setApellido("nolasco");
		usuario.setEmail("example@live.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Hola perfil");

		return "perfil";
	}
	
	@GetMapping({"/listar"})
	public String listar(Model model) {
		List<Usuario> usuarios= Arrays.asList(new Usuario("pablo", "nolasco", "")
				, new Usuario("vianca", "lopez", ""));
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Hola listar");

		return "listar";
	}
	
	/*
	 * se puede utilizar en cualquier metodo el atributo usuarios
	 */
	@ModelAttribute("usuarios")
	public List<Usuario>poblarUsuarios(){
		List<Usuario>usuarios= Arrays.asList(
				new Usuario("pablo","",""),
				new Usuario("vianca", "", ""));
		
		return usuarios;
	}
	
	

}
