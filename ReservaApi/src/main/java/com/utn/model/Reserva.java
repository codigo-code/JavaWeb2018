package com.utn.model;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Reserva<T> extends JpaRepository<T, Integer> {

	//BAR 
	public boolean reservarT(T tobj);
	
	//Bar 
	public T consultaReserva(Integer id);
	
	public T consultaReserva(String dni,Date fechaDesde, Date fechaHasta);
	
	public boolean modificar(T tobj);
	
	public void removerReserva(Integer id);
	
	
}
