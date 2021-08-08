package com.udemy.spring.di.app.models.domain;

import java.math.BigDecimal;

public class ItemFactura {
	
	private Producto producto;
	private Integer cantidad;

	public ItemFactura(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal calcularTotal(){
		return this.producto.getPrecio().multiply(new BigDecimal(this.cantidad));
	}
}
