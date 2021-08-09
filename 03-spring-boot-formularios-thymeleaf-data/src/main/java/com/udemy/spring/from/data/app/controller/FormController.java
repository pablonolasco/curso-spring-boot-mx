package com.udemy.spring.from.data.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/forms")
public class FormController {

    @GetMapping("/data")
    public String index(Model model){
        model.addAttribute("titulo","Formulario");
        return "index";
    }

    @PostMapping("/frmProcesar")
    public String form(){
        return "";
    }
}
