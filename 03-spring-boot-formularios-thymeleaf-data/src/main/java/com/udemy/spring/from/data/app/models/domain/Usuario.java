package com.udemy.spring.from.data.app.models.domain;

import org.springframework.beans.factory.annotation.Value;

import com.udemy.spring.from.data.app.validation.IdentificadorRegex;
import com.udemy.spring.from.data.app.validation.Requerido;

import javax.validation.constraints.*;

public class Usuario {

    //@NotEmpty
   // @Pattern(regexp = "[0-9]{2}[.][\\d]{3}[-][A-Z]{1}",message = "Debe coincidir con 12.123-A")
	@IdentificadorRegex //anotacion personalizada
    private String id;

    //@NotEmpty(message = "El nombre es obligatorio")
    @Requerido
	private String nombre;

    @NotBlank
    @Size(min = 3,max = 8)
    private String password;

    @NotEmpty
    @Email
    private String email;

    //@NotEmpty
    @Requerido
    private String telefono;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
