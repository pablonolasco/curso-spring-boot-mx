package com.udemy.spring.di.app.service;

import org.springframework.stereotype.Component;
// es un calificador por si hay mas de una implementacion
@Component("miServicio")
public class MiServicio implements IService{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "ejecutando operacion....";
	}
	
	

}
