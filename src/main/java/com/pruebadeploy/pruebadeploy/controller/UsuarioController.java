package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Usuario;
import com.pruebadeploy.pruebadeploy.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioservice;
	
	@GetMapping
	public List<Usuario> listar(){
		return usuarioservice.listar();
	}
	
	@PostMapping
	public Usuario insertar(@RequestBody Usuario usuario) {
		return usuarioservice.insertar(usuario);
	}
	
	@PutMapping
	public Usuario actualizar(@RequestBody Usuario usuario) {
		return usuarioservice.actualizar(usuario);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody Usuario usuario) {
		usuarioservice.eliminar(usuario);
	}
}
