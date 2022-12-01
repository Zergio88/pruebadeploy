package com.pruebadeploy.pruebadeploy;

import java.io.IOException;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.pruebadeploy.pruebadeploy.recurso.getDistanceMatrixAPI;

@RestController
@SpringBootApplication
public class PruebadeployApplication {

	@GetMapping("/")
	public String mensaje() throws IOException, InterruptedException {
	
	//String resultado = getDistanceMatrixAPI.getData("-34.61679872494791,-58.52067584629976", "-34.6173505163973,-58.38178810357908");
	String resultado = "";
	
	return "{ Welcome to MorfandoInc-API }" + resultado;
	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebadeployApplication.class, args);
	}

}
