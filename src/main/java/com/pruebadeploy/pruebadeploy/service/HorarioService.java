package com.pruebadeploy.pruebadeploy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebadeploy.pruebadeploy.entity.Horario;
import com.pruebadeploy.pruebadeploy.repo.HorarioRepo;


@Service
public class HorarioService {
	
	@Autowired
	private HorarioRepo horariorepo;
	
	public Horario insertar(Horario horario) {
		return horariorepo.save(horario); // devuelve el codigo con el que fue insertado en la bd
	}
	
	public Horario actualizar(Horario horario) { /* Requiere pasar ID de usuario en el json*/
		return horariorepo.save(horario); /* y tambien todos los campos, ya que pisa todo el objeto*/
	}
	
	public List<Horario> listar(){
		return horariorepo.findAll();
	}
	
	public void eliminar(Horario horario) { /* Requiere pasar el Id de usuario en el Json*/
		horariorepo.delete(horario);
	}

}
