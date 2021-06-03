package com.SegreteriaApplication.Controllers;

import java.util.*;

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

import com.SegreteriaApplication.DBmodel.Segreteria;
import com.SegreteriaApplication.Repository.SegreteriaRepository;



@RestController
public class SegreteriaController {
	
	@Autowired
	SegreteriaRepository segreteriaRepository;
	
	@GetMapping("/listaAdmin")
	public ArrayList<Segreteria> getAdmin(){
		return (ArrayList<Segreteria>) segreteriaRepository.findAll();
	}
	//CRUD SUI SINGOLI ELEMENTI
	
	//UPDATE
	
	@PutMapping("/segreteria/{codSegreteria}")
	public void updateAdmin(@PathVariable long codSegreteria, @RequestBody Segreteria segreteria) {
		segreteria.setCodSegreteria(codSegreteria);
		Segreteria segreteriaOut = segreteriaRepository.save(segreteria);
	}
	
	//READ
	@GetMapping("/segreteria{codSegreteria}")
	public ResponseEntity<Segreteria> getAdmin(@PathVariable Long codSegreteria){
		Optional<Segreteria> segreteriaOpt = segreteriaRepository.findById(codSegreteria);
		return new ResponseEntity<Segreteria>(segreteriaOpt.get(), HttpStatus.NOT_FOUND);
	}
	
	
	//CREATE
	@PostMapping("/segreteria/add")
	public void createAdmin(@RequestBody Segreteria segreteria) {
		segreteriaRepository.save(segreteria);
	}
	
	//DELETE
	@DeleteMapping("/segreteria/{codSegreteria}")
	public void deleteAdmin(@PathVariable Long codSegreteria) {
		Optional<Segreteria> segreteriaOpt = segreteriaRepository.findById(codSegreteria);
		segreteriaRepository.delete(segreteriaOpt.get());
	}
	
}
