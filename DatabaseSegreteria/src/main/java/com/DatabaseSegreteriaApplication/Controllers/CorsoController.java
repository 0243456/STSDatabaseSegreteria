package com.DatabaseSegreteriaApplication.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;
import com.DatabaseSegreteriaApplication.DBmodel.Docente;
import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocenteRepository;
import com.DatabaseSegreteriaApplication.Repository.EsameRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.CorsoRequest;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.CorsoService;
import com.DatabaseSegreteriaApplication.services.EsamiService;


import static org.springframework.http.HttpStatus.OK;

@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")

public class CorsoController {
	private StudenteRepository studenteRepository;
	private SegreteriaRepository segreteriaRepository;
	private BancaRepository bancaRepository;
	private DocenteRepository docenteRepository;
	
	
	@Autowired
	private CorsoRepository	corsoRepository;
	@Autowired 
	private CorsoService corsoService;
	
	@Autowired
	private EsameRepository esameRepository;
	
	@Autowired
	private EsameService esameService;
	
	
	
	@GetMapping("/corsi")
	public ResponseEntity<List<Corso>> allUser(){
		List <Corso> C = corsoRepository.findAll();
		return ResponseEntity.status(OK).body(C);
	}
	
	@PostMapping("/aggiungiCorso")
	public ResponseEntity<Void> aggiungiCorso(@RequestBody CorsoRequest corsoRequest){
		Corso corso = new Corso();
		
		Optional<Docente> OptionalDoc = docenteRepository.findById(corsoRequest.getCodDocente());
		Docente docente = OptionalDoc.get();
		corso.setDocente(docente);
		
		Optional<Studente> OptionalM = studenteRepository.findById(corsoRequest.getMatricola());
		Studente studente = OptionalM.get();
		corso.setStudente(studente);
		
		corso.setDurata(corsoRequest.getDurata());
		corso.setNome(corsoRequest.getNome());
		
		corsoRepository.save(corso);
		System.out.println(corso.toString());
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
}
