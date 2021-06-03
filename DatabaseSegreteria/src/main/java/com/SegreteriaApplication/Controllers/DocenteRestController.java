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

import com.DatabaseSegreteriaApplication.DBmodel.Docente;
import com.DatabaseSegreteriaApplication.Repository.DocenteRepository;

@RestController
public class DocenteRestController {
	
	@Autowired
	private DocenteRepository docenteRepository;
	
	@GetMapping("/listaDocenti")
	public ArrayList<Docente> getDocente(){
		return (ArrayList<Docente>) docenteRepository.findAll();
	}
	
	//CRUD sui singoli Docenti
	
	@PutMapping("/docente/{codDocente}")
	public void updateDocente(@PathVariable long codDocente, @RequestBody Docente docente) {
		docente.setCodDocente(codDocente);
		Docente docenteOut = docenteRepository.save(docente);
	}
	
	
	//READ
	@GetMapping("/docente/{codDocente}")
	public ResponseEntity<Docente> getDocente(@PathVariable Long codDocente){
		Optional<Docente> docenteOpt = docenteRepository.findById(codDocente);
		return new ResponseEntity<Docente>(docenteOpt.get(), HttpStatus.NOT_FOUND);
	}
	
	
	//CREATE
	@PostMapping("docente/add")
	public void createDocente(@RequestBody Docente docente) {
		docenteRepository.save(docente);
	}
	//DELETE
	@DeleteMapping("/docente/{codDocente}")
	public void deleteDocente(@PathVariable Long codDocente) {
		Optional<Docente> docenteOpt = docenteRepository.findById(codDocente);
		docenteRepository.delete(docenteOpt.get());
	}
}
