package com.utn.model.respositories.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.utn.model.Reserva;
import com.utn.model.respositories.ReservaRepository;

@Component
public class ReservaDao {

	@Autowired
	private ReservaRepository reserva;
	
	public Reserva getAllPersonasReserva(Integer id){
		
		return reserva.findById(id).get();
	}
}
