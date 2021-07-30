package com.udemy.spring.di.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//== Es un calificador por si hay mas de una implementacion
@Component("miServicio")
//== Se utiliza para colocar por prdeterminada esta implementacion si existe mas de una clase que implmente la misma interfaz
@Primary
public class MiServicio implements IService{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "ejecutando operacion simple....";
	}
	
	

}
