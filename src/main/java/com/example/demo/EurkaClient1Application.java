package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurkaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurkaClient1Application.class, args);
	}
	
	   @RequestMapping(value = "/")
	   public String home() {
	      return "Eureka Client application";
	   }
	   
	   @GetMapping("/addition/{num1}/{num2}")
	   public int addition(@PathVariable int num1,@PathVariable int num2 )
	   {
		   return num1+num2;
	   }
}



