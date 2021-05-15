package com.DatabaseSegreteria.DatabaseSegreteria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteria.DatabaseSegreteria.DBmodel.Studente;
import com.DatabaseSegreteria.DatabaseSegreteria.DBmodel.Segreteria;

import com.DatabaseSegreteria.DatabaseSegreteria.Repository.StudenteRepository;
import com.DatabaseSegreteria.DatabaseSegreteria.Repository.SegreteriaRepository;

@Configuration
//@Configuration
//@ConditionalOnClass
//@ConditionalOnMissingBean

@AutoConfigureAfter
@ComponentScan
@EnableJpaRepositories("com.delivery.repository")
@SpringBootApplication
//@ComponentScan("com.myapp.repositories")
public class DatabaseSegreteriaApplication {

//	@Autowired
//	StudenteRepository studenteRepository;
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
