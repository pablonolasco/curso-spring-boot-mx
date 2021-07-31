package com.udemy.spring.di.app;

import org.springframework.context.annotation.Configuration;

import com.udemy.spring.di.app.service.IService;
import com.udemy.spring.di.app.service.MiServicio;

@Configuration
public class AppConfig {

	public IService registrarServicio() {
		return new MiServicio();
	}
}
