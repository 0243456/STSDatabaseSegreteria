package com.DatabaseSegreteria.DatabaseSegreteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteria.DatabaseSegreteria.Repository.BancaRepository;
import com.DatabaseSegreteria.DatabaseSegreteria.services.BancaService;
@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")
public class BancaController {
	@GetMapping("/banca")
	public String allUser(){
		return "Banca Unicredit";
	}
}
