package com.DatabaseSegreteria.DatabaseSegreteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteria.DatabaseSegreteria.Repository.DocentiRepository;
import com.DatabaseSegreteria.DatabaseSegreteria.services.DocentiService;
@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")

public class DocentiController {
	@GetMapping("/docenti")
	public String allUser(){
		return "DOCENTI";
	}
}
