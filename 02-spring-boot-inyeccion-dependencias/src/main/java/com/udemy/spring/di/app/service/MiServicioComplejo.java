package com.udemy.spring.di.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
// es un calificador por si hay mas de una implementacion
//@Component("miServicioComplejo")

public class MiServicioComplejo implements IService{

	@Override
	public String operacion() {
		// TODO Auto-generated method stub
		return "ejecutando operacion compleja....";
	}
	
	

}
