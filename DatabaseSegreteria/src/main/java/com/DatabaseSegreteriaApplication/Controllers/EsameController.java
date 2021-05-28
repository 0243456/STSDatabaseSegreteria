package com.DatabaseSegreteriaApplication.Controllers;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import com.DatabaseSegreteriaApplication.DBmodel.Esame;
//import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
//import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
//import com.DatabaseSegreteriaApplication.Repository.DocenteRepository;
import com.DatabaseSegreteriaApplication.Repository.EsameRepository;
//import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.EsameRequest;
import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.EsameService;
import com.DatabaseSegreteriaApplication.services.StudenteService;

import static org.springframework.http.HttpStatus.OK;

@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")


public class EsameController {
	@Autowired
	private StudenteRepository studenteRepository;
	
//	private SegreteriaRepository segreteriaRepository;
//	private CorsoRepository	corsoRepository;
//	private BancaRepository bancaRepository;
//	private DocenteRepository docenteRepository;
	@Autowired
	private EsameRepository esameRepository;
	
//	@Autowired 
//	private StudenteRequest studenteRequest;
//	
//	@Autowired
//	private StudenteService	studenteService;
//	
	
	@GetMapping("/esami")
	public ResponseEntity<List<Esame>> allUser(){
		List<Esame>  E=  esameRepository.findAll();
		return ResponseEntity.status(OK).body(E);
		}
	
	@PostMapping("/inserisciEsame")
	public ResponseEntity<Void> esamiEffetuati(@RequestBody EsameRequest esameRequest){
//		studenteRepository.save(studenteRequest);
//		studenteService.create(studenteRequest);
		Esame esame = new Esame();
	
//		studente.setMatricola(studenteRequest.getMatricola());
//		esame.setCodEsame(esameRequest.getCodEsame());
		esame.setNome( esameRequest.getNome());
		esame.setCfu(esameRequest.getCfu());
		esame.setDataEsame(esameRequest.getDataEsame());
		esame.setVoto(esameRequest.getVoto());
	
		Optional<Studente> studOptional = studenteRepository.findById(esameRequest.getMatricola());
		Studente studente =  studOptional.get();
		esame.setStudente(studente);
		
		
		esameRepository.save(esame);
		System.out.println(esame.toString());
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
}