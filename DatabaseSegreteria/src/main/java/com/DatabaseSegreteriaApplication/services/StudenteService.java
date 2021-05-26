package com.DatabaseSegreteriaApplication.services;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;

import lombok.*;

@AutoConfigureAfter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Data

public class StudenteService {
//	@Autowired
//	StudenteRepository studenteRepository;
	
//	@Autowired 
//	StudenteRequest studenteRequest;
	




	public void create(StudenteRequest studenteRequest) {
		Studente studente = new Studente(studenteRequest.getNome(), studenteRequest.getCognome(),
				studenteRequest.getCodFiscale(), studenteRequest.getEmail());
		CrudRepository<Studente, Long> studenteRepository = null;
		studenteRepository.save(studente);
		System.out.println(studente.toString());
	}

}
