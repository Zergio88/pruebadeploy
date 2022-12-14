package com.pruebadeploy.pruebadeploy;

import java.io.IOException;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebadeploy.pruebadeploy.recurso.getDistanceMatrixAPI;

@RestController
@SpringBootApplication
public class PruebadeployApplication {

	@GetMapping("/")
	public String mensaje() throws IOException, InterruptedException {
		String msj = "MorfandoInc API: ON";	
		
		return msj;	
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebadeployApplication.class, args);
	}

}
