package com.pruebadeploy.pruebadeploy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebadeploy.pruebadeploy.entity.Usuario;
import com.pruebadeploy.pruebadeploy.repo.UsuarioRepo;



@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepo usuariorepo;
	
	public Usuario insertar(Usuario usuario) {
		return usuariorepo.save(usuario); // devuelve el codigo con el que fue insertado en la bd
	}
	
	public Usuario actualizar(Usuario usuario) { /* Requiere pasar ID de usuario en el json*/
		return usuariorepo.save(usuario); /* y tambien todos los campos, ya que pisa todo el objeto*/
	}
	
	public List<Usuario> listar(){
		return usuariorepo.findAll();
	}
	
	public void eliminar(Usuario usuario) { /* Requiere pasar el Id de usuario en el Json*/
		usuariorepo.delete(usuario);
	}

	public List<Usuario> verificarCredenciales(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuariorepo.findByMailAndPassword(usuario);
		
	}
}
