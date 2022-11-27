package com.pruebadeploy.pruebadeploy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebadeploy.pruebadeploy.entity.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant, Integer>{

}
