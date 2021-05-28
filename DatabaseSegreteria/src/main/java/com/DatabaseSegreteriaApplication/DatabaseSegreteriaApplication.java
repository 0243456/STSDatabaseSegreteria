package com.DatabaseSegreteriaApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages= {"com.DatabaseSegreteriaApplication.DBmodel"})
@Configuration
@Repository
@ComponentScan({"com.DatabaseSegreteriaApplication.Controllers"})
@ComponentScan({"com.DatabaseSegreteriaApplication.DBmodel"})
@ComponentScan({"com.DatabaseSegreteriaApplication.dto"})
@ComponentScan({"com.DatabaseSegreteriaApplication.Repository"})
@ComponentScan({"com.DatabaseSegreteriaApplication.services"})


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
