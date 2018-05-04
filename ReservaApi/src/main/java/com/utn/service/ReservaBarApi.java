package com.utn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.utn.model.respositories.ReservaBar;

@RestController
public class ReservaBarApi {

	@Autowired
	private ReservaBar reservaBar;
	
	@Autowired
	private Gson gson;
	
	@GetMapping(value="getBar")
	public String getBar() {
		
	 return gson.toJson(reservaBar.findById(1));
	}
}
