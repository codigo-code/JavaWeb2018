package com.utn.modelo;

public class Pedido {

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nombre=" + nombre + ", monto=" + monto + ", descuento=" + descuento
				+ "]";
	}
	private int idPedido;
	private String nombre;
	private int monto;
	private int descuento;
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public Pedido(int idPedido, String nombre, int monto, int descuento) {
		super();
		this.idPedido = idPedido;
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}
	
	
	public Pedido(String nombre, int monto, int descuento) {
		super();
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
}
