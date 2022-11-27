package com.pruebadeploy.pruebadeploy;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PruebadeployApplication {

	@GetMapping("/")
	public String mensaje() {
		return "*** Welcome to MorfandoInc-API ***";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebadeployApplication.class, args);
	}

}
