package com.udemy.spring.di.app;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.udemy.spring.di.app.models.domain.ItemFactura;
import com.udemy.spring.di.app.models.domain.Producto;
import com.udemy.spring.di.app.service.IService;
import com.udemy.spring.di.app.service.MiServicio;
import com.udemy.spring.di.app.service.MiServicioComplejo;
import java.util.*;
import java.math.BigDecimal;

@Configuration
public class AppConfig {

	// == Se registran los beans
	@Bean("miServicioSimple")
	@Primary
	public IService registrarServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	public IService registrarServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("misItemsFactura")
	public List<ItemFactura> registrarItems() {
		List<ItemFactura> itemsFacturas = Arrays.asList(
				new ItemFactura(new Producto("pc", new BigDecimal(100.00)), 2),
				new ItemFactura(new Producto("monitor", new BigDecimal(200)), 4));
		return itemsFacturas;
	}

	@Bean("itemsTienda")
	@Primary
	public List<ItemFactura>registrarOficina(){
		return Arrays.asList(
				new ItemFactura(new Producto("sabritas",new BigDecimal(40)),4),
				new ItemFactura(new Producto("papas", new BigDecimal(4.50)),2)
		);
	}
}
