package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Usuario;
import com.pruebadeploy.pruebadeploy.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioservice;
	
	@RequestMapping(value="api/usuarios", method=RequestMethod.GET)
	public List<Usuario> listar(){
		return usuarioservice.listar();
	}
	
	@RequestMapping(value="api/UserRegistry", method=RequestMethod.POST)
	public Usuario insertar(@RequestBody Usuario usuario) {
		return usuarioservice.insertar(usuario);
	}
	
	@RequestMapping(value="api/UserUpdate", method=RequestMethod.PUT)
	public Usuario actualizar(@RequestBody Usuario usuario) {
		return usuarioservice.actualizar(usuario);
	}
	
	@RequestMapping(value="api/UserDelete", method=RequestMethod.DELETE)
	public void eliminar(@RequestBody Usuario usuario) {
		usuarioservice.eliminar(usuario);
	}
	
	@RequestMapping(value="api/login", method=RequestMethod.POST)
	public List<Usuario> login(@RequestBody Usuario usuario) {
		return usuarioservice.verificarCredenciales(usuario);
	}
}
