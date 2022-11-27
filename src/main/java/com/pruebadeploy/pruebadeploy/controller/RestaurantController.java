package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.entity.Restaurant;
import com.pruebadeploy.pruebadeploy.service.DireccionService;
import com.pruebadeploy.pruebadeploy.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private DireccionService direccionservice;
	
	@Autowired RestaurantService restaurantservice;
	
	/*@RequestMapping("/mostrarDirecciones")
	public List<Direccion> listar(){
		return direccionservice.listar();
	}*/
	
	@RequestMapping("/insertarRestaurant")
	@PostMapping
	public Restaurant insertar(@RequestBody Restaurant restaurant) {
		return restaurantservice.insertar(restaurant);
	}
}
