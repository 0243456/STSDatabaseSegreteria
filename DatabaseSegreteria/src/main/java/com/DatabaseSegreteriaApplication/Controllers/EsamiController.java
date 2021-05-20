package com.DatabaseSegreteriaApplication.Controllers;

import static org.springframework.http.HttpStatus.OK;

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

import com.DatabaseSegreteriaApplication.DBmodel.Esami;
import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocentiRepository;
import com.DatabaseSegreteriaApplication.Repository.EsamiRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.EsameRequest;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.EsamiService;
import static org.springframework.http.HttpStatus.OK;

@RestController
@Configuration
@AutoConfigureAfter
@RequestMapping("/home")


public class EsamiController {
	@Autowired
	private StudenteRepository studenteRepository;
	private SegreteriaRepository segreteriaRepository;
	private CorsoRepository	corsiRepository;
	private BancaRepository bancaRepository;
	private DocentiRepository docentiRepository;
	@Autowired
	private EsamiRepository esamiRepository;
	
	@GetMapping("/esami")
	public ResponseEntity<List<Esami>> allUser(){
		List<Esami>  E= esamiRepository.findAll();
		return ResponseEntity.status(OK).body(E);
		}
	
	@PostMapping("/inserisciEsame")
	public ResponseEntity<Void> esamiEffetuati(@RequestBody EsameRequest esameRequest){
//		studenteRepository.save(studenteRequest);
//		studenteService.create(studenteRequest);
		Esami esame = new Esami();
	
//		studente.setMatricola(studenteRequest.getMatricola());
//		esame.setCodEsame(esameRequest.getCodEsame());
		esame.setNome( esameRequest.getNome());
		esame.setCfu(esameRequest.getCfu());
		esame.setDataEsame(esameRequest.getDataEsame());
		esame.setVoto(esameRequest.getVoto());
		
		Optional<Studente> studOptional = studenteRepository.findById(esameRequest.getMatricola());
		Studente studente =  studOptional.get();
		esame.setStudente(studente);
		
		
		esamiRepository.save(esame);
		System.out.println(esame.toString());
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
}