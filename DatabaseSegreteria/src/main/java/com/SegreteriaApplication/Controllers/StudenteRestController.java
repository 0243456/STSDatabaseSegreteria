package com.DatabaseSegreteriaApplication.Controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;




@RestController
//@RequestMapping("/studente")
//@CrossOrigin(origins = "*")
public class StudenteRestController {

	@Autowired
	StudenteRepository studenteRepository;
	
	

	@GetMapping("/listastudenti")
	public ArrayList<Studente> getStudenti(){
		return (ArrayList<Studente>) studenteRepository.findAll();
	}//CRUD SUI SINGOLI STUDENTI
	
	
	//UPDATE
	@PutMapping("/studente{matricola}")
	public void updateStudente(@PathVariable long matricola, @RequestBody Studente studente) {
		studente.setMatricola(matricola);
		Studente studenteOut = studenteRepository.save(studente);
	}
	//READ
	@GetMapping("/studente/{matricola}")
	public ResponseEntity<Studente> getStudente (@PathVariable Long matricola){
		Optional<Studente> studenteOpt = studenteRepository.findById(matricola);
		return new ResponseEntity<Studente>(studenteOpt.get(), HttpStatus.NOT_FOUND);
	}
	//CREATE
	@PostMapping("studente/add")
	public void createStudente(@RequestBody Studente studente) {
		studenteRepository.save(studente);
	}
	
	//DELETE
	@DeleteMapping("/studente/{matricola}")
	public void deleteStudente(@PathVariable Long matricola) {
		Optional<Studente> studenteOpt = studenteRepository.findById(matricola);	
		studenteRepository.delete(studenteOpt.get());
	}
	
}
