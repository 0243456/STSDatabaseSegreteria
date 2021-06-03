package com.SegreteriaApplication.Controllers;

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

import com.SegreteriaApplication.DBmodel.Esame;
import com.SegreteriaApplication.Repository.EsameRepository;


@RestController
public class EsameRestController {

	@Autowired
	private EsameRepository esameRepository;

	@GetMapping("/listaEsami")
	public ArrayList<Esame> getEsame() {
		return (ArrayList<Esame>) esameRepository.findAll();
	}

	// CRUD sui Singoli Studenti
	// UPDATE

	@PutMapping("/esame/{codEsane}")
	public void updateEsame(@PathVariable long codEsame, @RequestBody Esame esame) {
		esame.setCodEsame(codEsame);
		Esame esameOut = esameRepository.save(esame);
	}

	// READ
	@GetMapping("/esame/{codEsame}")
	public ResponseEntity<Esame> getEsame(@PathVariable Long codEsame) {
		Optional<Esame> esameOpt = esameRepository.findById(codEsame);
		return new ResponseEntity<Esame>(esameOpt.get(), HttpStatus.NOT_FOUND);
	}
	
	
	//CREATE
	@PostMapping("/esame/add")
	public void createEsame(@RequestBody Esame esame) {
		esameRepository.save(esame);
	}

	

	//DELETE
	@DeleteMapping("/esame/{codEsame}")
	public void deleteEsame(@PathVariable Long esame) {
		Optional<Esame> esameOpt = esameRepository.findById(esame);
		esameRepository.delete(esameOpt.get());
	}
}