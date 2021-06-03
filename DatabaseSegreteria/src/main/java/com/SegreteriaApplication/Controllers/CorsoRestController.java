package com.DatabaseSegreteriaApplication.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;


@RestController
public class CorsoRestController{
	
	@Autowired
	private CorsoRepository	corsoRepository;
	
	
	@GetMapping("/listaCorsi")
	public ArrayList<Corso> getCorso(){
		return (ArrayList<Corso>) corsoRepository.findAll();
	}
	
	//CRUD SUI SINGOLI CORSI
	
	@PutMapping("/corso/{codCorso}")
	public void updateCorso(@PathVariable long codCorso, @RequestBody Corso corso) {
		corso.setCodCorso(codCorso);
		Corso corsoOut = corsoRepository.save(corso);
	}
	
	//READ
	@GetMapping("/corso/{codCorso}")
	public ResponseEntity<Corso> getCorso(@PathVariable Long codCorso){
		Optional<Corso> corsoOpt = corsoRepository.findById(codCorso);
		return new ResponseEntity<Corso>(corsoOpt.get(), HttpStatus.NOT_FOUND);
	}
	
	//CREATE
	@PostMapping("/corso/add")
	public void createCorso(@RequestBody Corso corso) {
		corsoRepository.save(corso);
	}
	
	
	//DELETE
	@DeleteMapping("/corso/{codCorso}")
	public void deleteCorso(@PathVariable Long codCorso) {
		Optional<Corso> corsoOpt = corsoRepository.findById(codCorso);
		corsoRepository.delete(corsoOpt.get());
	}
	
}
