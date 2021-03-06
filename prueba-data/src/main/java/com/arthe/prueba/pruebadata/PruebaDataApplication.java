package com.arthe.prueba.pruebadata;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaDataApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam( value = "name" , defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}

	public List<Boolean> dato(){
		List<Boolean> datos = Arrays.asList(true, false); 
		return datos;
	}
}
