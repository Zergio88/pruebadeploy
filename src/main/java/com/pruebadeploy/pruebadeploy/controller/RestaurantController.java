package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.entity.Restaurant;
import com.pruebadeploy.pruebadeploy.entity.Usuario;
import com.pruebadeploy.pruebadeploy.service.DireccionService;
import com.pruebadeploy.pruebadeploy.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private DireccionService direccionservice;
	
	@Autowired
	private RestaurantService restaurantservice;
	
	/*baseurl/restaurants?lat=00.000&&lon=0000*/
	
	/*
	 * @RequestMapping(value="api/restaurant?", method=RequestMethod.GET) public
	 * List<Restaurant> listar(){ return restaurantservice.listar(); }
	 */
	
	@RequestMapping(value="/api/RestaurantRegistry", method=RequestMethod.POST)
	public Restaurant insertar(@RequestBody Restaurant restaurant) {
		return restaurantservice.insertar(restaurant);
	}
	
	@RequestMapping(value="api/restaurantList", method=RequestMethod.GET)
	public List<Restaurant> listar(){
		return restaurantservice.listar();
	}
	
	@RequestMapping(value="api/RestaurantUpdate", method=RequestMethod.PUT)
	public Restaurant actualizar(@RequestBody Restaurant restaurant) {
		return restaurantservice.actualizar(restaurant);
	}
	
	@RequestMapping(value="api/RestaurantDelete", method=RequestMethod.DELETE)
	public void eliminar(@RequestBody Restaurant restaurant) {
		restaurantservice.eliminar(restaurant);
	}
	
}
