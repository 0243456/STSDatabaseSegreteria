package com.DatabaseSegreteria.DatabaseSegreteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteria.DatabaseSegreteria.Repository.SegreteriaRepository;
import com.DatabaseSegreteria.DatabaseSegreteria.services.SegreteriaService;
@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")
public class SegreteriaController {
	
	@GetMapping("/admin")
	public String allUser(){
		return "SegreteriaAdmin";
	}
}
