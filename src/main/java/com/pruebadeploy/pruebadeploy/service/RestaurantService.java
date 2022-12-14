package com.pruebadeploy.pruebadeploy.service;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.PriorityQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebadeploy.pruebadeploy.controller.DireccionController;
import com.pruebadeploy.pruebadeploy.dto.RestaurantDistanceDTO;
import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.entity.Restaurant;
import com.pruebadeploy.pruebadeploy.recurso.getDistanceMatrixAPI;
import com.pruebadeploy.pruebadeploy.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo restaurantrepo;
	
	@Autowired
	private DireccionService direccionservice;
	
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

	public List<RestaurantDistanceDTO> listarRestorantsCercanos(String ubicacion) throws IOException, InterruptedException {
		List<Restaurant> AllRestList = restaurantrepo.findAll();
		PriorityQueue<Map.Entry<Restaurant,Integer>> queue = new PriorityQueue<>(Map.Entry.comparingByValue());
		Optional<Direccion> direccionaux;
		List<RestaurantDistanceDTO> resultado = new ArrayList<RestaurantDistanceDTO>();
		
		/* carga cola prioridad con todos los restaurants + distancia utilizando map*/
		for(Restaurant r: AllRestList) {
			direccionaux = direccionservice.consultaDireccion(r.getId_direccion());
			String latitud=direccionaux.get().getLatitud();
			String longitud=direccionaux.get().getLongitud();
			int distancia=getDistanceMatrixAPI.getData(latitud+","+longitud,ubicacion);
			queue.offer(new AbstractMap.SimpleEntry<>(r,distancia));
		}
		
		int cantidad=0;
		/*carga lista de restaurantes con los primeros 10 de menor distancia*/
		while((!queue.isEmpty()) && (cantidad<10)) {
			Map.Entry<Restaurant, Integer> a = queue.poll();
			int dist = a.getValue();
			Restaurant rt = a.getKey();
			RestaurantDistanceDTO rd = new RestaurantDistanceDTO(rt.getId_restaurante(), rt.getId_propietario(), rt.getNombre(), rt.getId_horario(), rt.getId_direccion(), rt.getFotos(), rt.getDescripcion(), rt.getEspecialidad(), rt.getRangos_precios(), dist);
			resultado.add(rd);
			cantidad=cantidad+1;
		}
		
		return resultado;
	}
}
