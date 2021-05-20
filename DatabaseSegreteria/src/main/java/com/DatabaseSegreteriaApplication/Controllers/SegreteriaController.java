package com.DatabaseSegreteriaApplication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocentiRepository;
import com.DatabaseSegreteriaApplication.Repository.EsamiRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.services.SegreteriaService;

import static org.springframework.http.HttpStatus.OK;


@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")
public class SegreteriaController {
	
	private StudenteRepository studenteRepository;
	private SegreteriaRepository segreteriaRepository;
	private CorsoRepository	corsiRepository;
	private BancaRepository bancaRepository;
	private DocentiRepository docentiRepository;
	private EsamiRepository esamiRepository;
	
	@GetMapping("/admin")
	public String allUser(){
		return "SegreteriaAdmin";
	}
	
	@GetMapping("/allStudents")
	public ResponseEntity<List> findAllStudents(){
		List<Studente> listaStudenti=studenteRepository.findAll();
		System.out.println("QUESTI SONO GLI STUDENTI");
		return ResponseEntity.status(OK).body(listaStudenti);
	}
	
	
}
