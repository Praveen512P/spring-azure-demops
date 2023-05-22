package com.maypraveen.azure.demop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemopApplication {
	
	@GetMapping("message")
	public String message() {
		return "Praveen created web app";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemopApplication.class, args);
	}

}

