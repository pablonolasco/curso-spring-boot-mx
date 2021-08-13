package com.udemy.spring.from.data.app.models.domain;

import javax.validation.constraints.NotEmpty;

public class Usuario {
    @NotEmpty
    private String nombre;

    @NotEmpty
    private String password;

    @NotEmpty
    private String email;

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
}
