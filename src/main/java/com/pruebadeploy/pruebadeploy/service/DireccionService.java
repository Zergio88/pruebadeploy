package com.pruebadeploy.pruebadeploy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.entity.Usuario;
import com.pruebadeploy.pruebadeploy.repo.DireccionRepo;

@Service
public class DireccionService {

	@Autowired
	private DireccionRepo direccionrepo;

	public Direccion insertar(Direccion direccion) {
		return direccionrepo.save(direccion);
	}

	public Direccion actualizar(Direccion direccion) {
		return direccionrepo.save(direccion);
	}

	public List<Direccion> listar(){
		return direccionrepo.findAll();
	}

	public void eliminar(Direccion direccion) {
		direccionrepo.delete(direccion);
	}
	
	public Optional<Direccion> consultaDireccion(int direccion) {
		// TODO Auto-generated method stub
		return direccionrepo.findById(direccion);
		
	}
}
