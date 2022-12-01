package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.service.DireccionService;


@RestController
public class DireccionController {

	@Autowired
	private DireccionService direccionservice;
	
	@RequestMapping(value="api/direction", method=RequestMethod.POST)
	public List<Direccion> listar(){
		return direccionservice.listar();
	}
	
}
