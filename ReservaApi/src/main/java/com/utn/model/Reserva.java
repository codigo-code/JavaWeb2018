package com.utn.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	@OneToMany(fetch=FetchType.EAGER)
	private List<Cliente> listCliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Cliente> getListCliente() {
		return listCliente;
	}

	public void setListCliente(List<Cliente> listCliente) {
		this.listCliente = listCliente;
	}

	
	
//	@Column
//	@OneToOne
//	private Bar bar;
//	
//	@Column
//	@OneToOne
//	private Motel motel;
//	
//	@Column
//	@OneToOne
//	private Remis remis;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public List<Persona> getListPersona() {
//		return listPersona;
//	}
//
//	public void setListPersona(List<Persona> listPersona) {
//		this.listPersona = listPersona;
//	}
//
//	public Bar getBar() {
//		return bar;
//	}
//
//	public void setBar(Bar bar) {
//		this.bar = bar;
//	}
//
//	public Motel getMotel() {
//		return motel;
//	}
//
//	public void setMotel(Motel motel) {
//		this.motel = motel;
//	}
//
//	public Remis getRemis() {
//		return remis;
//	}
//
//	public void setRemis(Remis remis) {
//		this.remis = remis;
//	}
	
	
	
}
