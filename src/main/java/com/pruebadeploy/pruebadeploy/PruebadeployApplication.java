package com.pruebadeploy.pruebadeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebadeployApplication {

	@GetMapping("/mensaje")
	public String mensaje() {
		return "Welcome to my API";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebadeployApplication.class, args);
	}

}
