package com.DatabaseSegreteria.DatabaseSegreteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteria.DatabaseSegreteria.Repository.StudenteRepository;
import com.DatabaseSegreteria.DatabaseSegreteria.services.StudenteService;
@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")
public class StudenteController {
//	@Autowired
//	private StudenteRepository studenteRepository;
	
	@GetMapping("/alluser")
	public String allUser(){
		return "tutti gli studenti";
	}
	
}
