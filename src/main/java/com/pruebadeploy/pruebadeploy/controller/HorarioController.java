package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pruebadeploy.pruebadeploy.entity.Direccion;
import com.pruebadeploy.pruebadeploy.entity.Horario;
import com.pruebadeploy.pruebadeploy.service.HorarioService;


@RestController
public class HorarioController {

	@Autowired
	private HorarioService horarioservice;
	
	@RequestMapping(value="api/horario", method=RequestMethod.GET)
	public List<Horario> listar() {
		return horarioservice.listar();
	}
	
	@RequestMapping(value="api/HorarioRegistry", method=RequestMethod.POST)
	public Horario insertar(@RequestBody Horario horario) {
		return horarioservice.insertar(horario);
	}
	
	@RequestMapping(value="api/HorarioUpdate", method=RequestMethod.PUT)
	public Horario actualizar(@RequestBody Horario horario) {
		return horarioservice.actualizar(horario);
	}
	
	@RequestMapping(value="api/HorarioDelete", method=RequestMethod.DELETE)
	public void eliminar(@RequestBody Horario horario) {
		horarioservice.eliminar(horario);
	}
	
}
