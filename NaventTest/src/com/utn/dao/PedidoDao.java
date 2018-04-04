package com.utn.dao;

import com.utn.modelo.Itransaction;
import com.utn.modelo.Pedido;

public class PedidoDao implements Itransaction<Pedido>{

	
	
	@Override
	public void insert(Pedido object) {
	
		BumexMemcached.newInstance().insert(object);
	}

	@Override
	public void select(int id) {
		System.out.println("EL VALOR ES: ---> " + BumexMemcached.newInstance().get(id));
	}

	@Override
	public void delete(Pedido tobject) {
		BumexMemcached.newInstance().delete(tobject);		
	}

}
