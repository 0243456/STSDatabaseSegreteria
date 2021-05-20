package com.DatabaseSegreteriaApplication.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocentiRepository;
import com.DatabaseSegreteriaApplication.Repository.EsamiRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.services.BancaService;
@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")
public class BancaController {
	private StudenteRepository studenteRepository;
	private SegreteriaRepository segreteriaRepository;
	private CorsoRepository	corsiRepository;
	private BancaRepository bancaRepository;
	private DocentiRepository docentiRepository;
	private EsamiRepository esamiRepository;
	
	@GetMapping("/banca")
	public String allUser(){
		return "Banca Unicredit";
	}
}
