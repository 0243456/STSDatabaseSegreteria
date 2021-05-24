package com.DatabaseSegreteriaApplication.Controllers;

import java.util.List;

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

import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.Repository.CorsoRepository;
import com.DatabaseSegreteriaApplication.Repository.DocenteRepository;
import com.DatabaseSegreteriaApplication.Repository.EsameRepository;
import com.DatabaseSegreteriaApplication.Repository.SegreteriaRepository;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.StudenteService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Data
@RequestMapping("/home")
public class StudenteController {
	private SegreteriaRepository segreteriaRepository;
	private CorsoRepository	corsiRepository;
	private BancaRepository bancaRepository;
	private DocenteRepository docenteRepository;
	private EsameRepository esameRepository;
	
	@Autowired
	StudenteService studenteService;

	@Autowired
	private StudenteRepository studenteRepository;
	
	@GetMapping("/studenti")
	public ResponseEntity<List<Studente>> allUser(){
		List<Studente>  S= studenteRepository.findAll();
		return ResponseEntity.status(OK).body(S);
		
	}
	
	@PostMapping("/iscrizioni")
	public ResponseEntity<Void> iscrizioni(@RequestBody StudenteRequest studenteRequest) {
		studenteRepository.save(studenteRequest);
		studenteService.create(studenteRequest);
		Studente studente = new Studente();
	
		studente.setMatricola(studenteRequest.getMatricola());
		studente.setCod_fiscale(studenteRequest.getCod_fiscale());
		studente.setCognome( studenteRequest.getCognome());
		studente.setEmail(studenteRequest.getEmail());
		studente.setNome(studenteRequest.getNome());
		
		studenteRepository.save(studente);
		System.out.println(studente.toString());
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
}
