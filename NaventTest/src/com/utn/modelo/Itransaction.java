package com.utn.modelo;

public interface Itransaction<T> {

	public void insert(T object);
	
	public void select(int id);
	
	public void delete(T tobject);
	
}
