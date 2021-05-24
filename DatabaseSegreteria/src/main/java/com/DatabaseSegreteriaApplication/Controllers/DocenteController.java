package com.DatabaseSegreteriaApplication.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocenteRepository;
import com.DatabaseSegreteriaApplication.Repository.EsameRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.services.DocentiService;
@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")

public class DocenteController {
	private StudenteRepository studenteRepository;
	private SegreteriaRepository segreteriaRepository;
	private CorsoRepository	corsoRepository;
	private BancaRepository bancaRepository;
	private DocenteRepository docenteRepository;
	private EsameRepository esameRepository;
	
	@GetMapping("/docenti")
	public String allUser(){
		return "DOCENTE";
	}
}
