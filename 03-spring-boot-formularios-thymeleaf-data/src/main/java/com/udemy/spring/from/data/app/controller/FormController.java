package com.udemy.spring.from.data.app.controller;

import com.udemy.spring.from.data.app.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/forms")
public class FormController {

    @GetMapping("/data")
    public String index(Model model) {
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("user",new Usuario());
        return "form";
    }

    /**
     * Metodo obteniendo el request
     * @param model
     * @param nombre
     * @param password
     * @param email
     * @return
     */
  /*  @PostMapping("/frmProcesar")
    public String form(Model model, @RequestParam("user") String nombre, @RequestParam String password,
                       @RequestParam String email) {
        Usuario usuario= new Usuario();
        usuario.setNombre(nombre);
        usuario.setPassword(password);
        usuario.setEmail(email);
        model.addAttribute("titulo","Datos enviados");
        //model.addAttribute("user",nombre);
        //model.addAttribute("password",password);
        //model.addAttribute("email",email);
        model.addAttribute("usuario",usuario);
        return "index";
    }*/

    /**
     * Metodo Mapeando los campos del formulario al objeto model
     * los parametros deben ir en ese orden cuando se utiliza la validacion
     * @param usuario
     * @param result
     * @param model
     * @return
     */
    @PostMapping("/frmProcesar")
    public String form(@Valid @ModelAttribute("user") Usuario usuario, BindingResult result, Model model){
        model.addAttribute("titulo","Datos enviados");
        if (result.hasErrors()) {

            Map<String,String> mapErrors= new HashMap<>();
            result.getFieldErrors().forEach(error->{
                mapErrors.put(error.getField(), "El campo ".concat(error.getField()).concat(" ").concat(error.getDefaultMessage()));
            });
            model.addAttribute("error",mapErrors);
            return "form";
        }
        model.addAttribute("usuario",usuario);
        return "index";
    }
}
