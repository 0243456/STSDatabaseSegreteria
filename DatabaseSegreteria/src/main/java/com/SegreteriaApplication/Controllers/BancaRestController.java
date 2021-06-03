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

import com.SegreteriaApplication.DBmodel.Banca;
import com.SegreteriaApplication.Repository.BancaRepository;
@RestController

public class BancaRestController {
	
	@Autowired
	private BancaRepository bancaRepository;
	
	@GetMapping("listaBanca")
	public ArrayList<Banca> getBanca(){
		return (ArrayList<Banca>) bancaRepository.findAll();
	}
	
	//CRUD SULLA BANCA
	
	@PutMapping("/banca/{codBanca}")
	public void updateBanca(@PathVariable long codBanca, @RequestBody Banca banca) {
		banca.setCodBanca(codBanca);
		Banca bancaOut = bancaRepository.save(banca);
	}
	
	//READ
	@GetMapping("/banca/{codBanca}")
	public ResponseEntity<Banca> getBanca(@PathVariable Long codBanca){
		Optional<Banca> bancaOpt = bancaRepository.findById(codBanca);
		return new ResponseEntity<Banca>(bancaOpt.get(), HttpStatus.NOT_FOUND);
	}
	
	//Create
	@PostMapping("/banca/add")
	public void createBanca(@RequestBody Banca banca) {
		bancaRepository.save(banca);
	}
	
	//DELETE
	@DeleteMapping("/banca/{codBanca}")
	public void deleteBanca(@PathVariable Long codBanca) {
		Optional<Banca> bancaOpt = bancaRepository.findById(codBanca);
		bancaRepository.delete(bancaOpt.get());
	}
	

}
