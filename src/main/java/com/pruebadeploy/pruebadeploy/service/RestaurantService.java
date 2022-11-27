package com.pruebadeploy.pruebadeploy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebadeploy.pruebadeploy.entity.Restaurant;
import com.pruebadeploy.pruebadeploy.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo restaurantrepo;
	
	public Restaurant insertar(Restaurant restaurant) {
		return restaurantrepo.save(restaurant);
	}
	
	public Restaurant actualizar(Restaurant restaurant) {
		return restaurantrepo.save(restaurant);
	}

	public List<Restaurant> listar(){
		return restaurantrepo.findAll();
	}
	
	public void eliminar(Restaurant restaurant) {
		restaurantrepo.delete(restaurant);
	}
}
