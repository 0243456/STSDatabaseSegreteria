package com.DatabaseSegreteriaApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages= {"com.DatabaseSegreteriaApplication.DBmodel"})
public class DatabaseSegreteriaApplication {

//	
//	@GetMapping("/test")
//	public String test() {
//		Studente std = new Studente();
//		studenteRepository.save(std);
//		
//		return studenteRepository.findAll().stream().findFirst().toString();
//	}
//	
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseSegreteriaApplication.class, args);
		
		System.out.println("SPERIAMO CHE VADA TUTTO BENE");
	}

}
