package com.udemy.spring.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // con component spring crea un objeto singleton que significa que se crea solo una vez
@RequestScope // el componente dura en lo que esta la peticion http request y se crea cada vez que se actualiza el navegador
//@SessionScope // se crea una sesion en el navegador http y se debe implementar la clase serializable, No se ejecuta destroy
//@ApplicationScope // se ejecuta en el aplicacion context
public class Factura implements Serializable {

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
		this.descripcion=descripcion.concat(" del cliente".concat(" ").concat(this.cliente.getNombre()));
	}

	/**
	 * Metodo que se ejecuta despues de destruir el componente
	 */
	@PreDestroy
	public void destroy(){
		System.out.println("factura destruida ".concat(descripcion));
	}

}
