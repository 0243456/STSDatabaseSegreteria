package com.DatabaseSegreteriaApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
