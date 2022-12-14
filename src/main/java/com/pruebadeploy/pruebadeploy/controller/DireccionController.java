package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.entity.Usuario;
import com.pruebadeploy.pruebadeploy.service.DireccionService;


@RestController
public class DireccionController {

	@Autowired
	private DireccionService direccionservice;
	
	@RequestMapping(value="api/direction", method=RequestMethod.GET)
	public List<Direccion> listar(){
		return direccionservice.listar();
	}
	
	@RequestMapping(value="api/DirectionRegistry", method=RequestMethod.POST)
	public Direccion insertar(@RequestBody Direccion direccion) {
		return direccionservice.insertar(direccion);
	}
	
	@RequestMapping(value="api/DirectionUpdate", method=RequestMethod.PUT)
	public Direccion actualizar(@RequestBody Direccion direccion) {
		return direccionservice.actualizar(direccion);
	}
	
	@RequestMapping(value="api/DirectionDelete", method=RequestMethod.DELETE)
	public void eliminar(@RequestBody Direccion direccion) {
		direccionservice.eliminar(direccion);
	}
	
	@RequestMapping(value="api/DirectionById", method=RequestMethod.GET)
	public Optional<Direccion> direccionById(@RequestBody Direccion direccion) {
		return direccionservice.consultaDireccion(direccion.getId_direccion());
	}
		
}
