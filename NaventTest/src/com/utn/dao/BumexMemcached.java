package com.utn.dao;

import java.util.ArrayList;
import java.util.List;

/*
 * IMAGINAR QUE ESTA ES LA BASE DE DATOS!!!
 */

public class BumexMemcached {

	private static BumexMemcached bumex;
	//GUARDAN EN UNA LISTA - MAPA- VECTOR- Collection - los datos
	private List<Object> lista;
	
	
	public static BumexMemcached newInstance(){
		if(bumex == null){
			bumex = new BumexMemcached();
			return bumex;
			
		}
		return bumex;
	}
	
	
	private BumexMemcached() {
		lista = new ArrayList<>();

	}
	
	public  <T>void insert(T tobject){
		lista.add(tobject);
	}
	
	public Object get(int id){
		return this.lista.get(id);
	}
	
	public <T>void delete(T tobject){
		this.lista.remove(tobject);
	}
}
