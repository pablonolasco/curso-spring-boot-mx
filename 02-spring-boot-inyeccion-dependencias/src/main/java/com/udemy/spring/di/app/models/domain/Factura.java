package com.udemy.spring.di.app.models.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;

	@Autowired
	//@Qualifier("misItemsFactura")
	private List<ItemFactura> items;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

	// Ciclo de vida de un componente

	/**
	 * Metodo que se ejecuta despues de que se crea el componente @PostConstruct
	 * Parecido a un constructor pero se deja a spring el control
	 */
	@PostConstruct
	public void init(){
		this.cliente.setNombre(cliente.getNombre().concat(" ").concat(" Castro"));
		this.descripcion=descripcion.concat(" del cliente");
	}

	/**
	 * Metodo que se ejecuta despues de destruir el componente
	 */
	@PreDestroy
	public void destroy(){
		System.out.println("factura destruida ".concat(descripcion));
	}

}
