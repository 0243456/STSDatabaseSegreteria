package com.DatabaseSegreteriaApplication.Controllers;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;
import com.DatabaseSegreteriaApplication.DBmodel.Docente;
import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocenteRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.EsameRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;

import com.DatabaseSegreteriaApplication.dto.CorsoRequest;
import com.DatabaseSegreteriaApplication.DBmodel.Studente;
//import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.StudenteService;
import com.DatabaseSegreteriaApplication.services.CorsoService;
//import com.DatabaseSegreteriaApplication.services.CorsoService;
import com.DatabaseSegreteriaApplication.services.EsameService;



import static org.springframework.http.HttpStatus.OK;

@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")

public class CorsoController{
	
//	private SegreteriaRepository segreteriaRepository;
//	private BancaRepository bancaRepository;
//	private EsameRepository esameRepository;
//	private SegreteriaRepository segreteriaRepository;
//	private CorsoRepository	corspoRepository;
//	private BancaRepository bancaRepository;
//	private DocenteRepository docenteRepository;
	
	@Autowired
	private CorsoRepository	corsoRepository;

//	@Autowired
//	private CorsoService corsoService;
	@Autowired
	private EsameRepository esameRepository;
	
	@Autowired
	private EsameService esameService;
	
	@Autowired 
	private DocenteRepository docenteRepository;
	
	@Autowired
	private StudenteRepository studenteRepository;

	@Autowired
	StudenteService studenteService;
	
	
	@GetMapping("/corsi")
	public ResponseEntity<List<Corso>> allUser(){
		List <Corso> C = corsoRepository.findAll();
		return ResponseEntity.status(OK).body(C);
	}
	
	@Transactional
	@PostMapping("/aggiungiCorso")
	public ResponseEntity<Void> aggiungiCorso(@RequestBody CorsoRequest corsoRequest){
		Corso corso = new Corso();
		
		Optional<Docente> OptionalDoc = docenteRepository.findById(corsoRequest.getCodDocente());
		Docente docente = OptionalDoc.get();
		corso.setDocente(docente);
		

//		corsoRepository.save(corsoRequest);
//		corsoService.create(corsoRequest);
//		
		
		
		
		Optional<Studente> OptionalM = studenteRepository.findById(corsoRequest.getMatricola());
		Studente studente = OptionalM.get();
		corso.setStudente(studente);
		
		corso.setDurata(corsoRequest.getDurata());
		corso.setNome(corsoRequest.getNome());
		
		corsoRepository.save(corso);
		System.out.println(corso.toString());
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}

	public void create(CorsoRequest corsoRequest) {
		// TODO Auto-generated method stub
		
	}
}
