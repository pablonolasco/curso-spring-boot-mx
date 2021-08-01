package com.udemy.spring.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.udemy.spring.di.app.service.IService;
import com.udemy.spring.di.app.service.MiServicio;
import com.udemy.spring.di.app.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	//== Se registran los beans
	@Bean("miServicioSimple")
	@Primary
	public IService registrarServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IService registrarServicioComplejo() {
		return new MiServicioComplejo();
	}
}
