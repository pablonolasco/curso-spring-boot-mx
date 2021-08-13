package com.udemy.spring.from.data.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/forms")
public class FormController {

    @GetMapping("/data")
    public String index(Model model) {
        model.addAttribute("titulo", "Formulario");
        return "form";
    }

    @PostMapping("/frmProcesar")
    public String form(Model model, @RequestParam("user") String nombre, @RequestParam String password,
                       @RequestParam String email) {
        model.addAttribute("titulo","Datos enviados");
        model.addAttribute("user",nombre);
        model.addAttribute("password",password);
        model.addAttribute("email",email);
        return "index";
    }
}
