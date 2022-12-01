package com.pruebadeploy.pruebadeploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
