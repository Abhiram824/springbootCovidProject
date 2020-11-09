package com.example.covid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class CovidApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CovidApplication.class, args);
	}

}
