package com.DatabaseSegreteriaApplication.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AutoConfigureAfter
@Service
//@AllArgsConstructor
//@NoArgsConstructor
@Transactional
@Data
public class StudenteService {
//	@Autowired
//	StudenteRepository studenteRepository;



	public void create(StudenteRequest studenteRequest) {
//		Studente studente = new Studente(studenteRequest.getNome(), studenteRequest.getCognome(),
//				studenteRequest.getCod_fiscale(), studenteRequest.getEmail());
//		studenteRepository.save(studente);
//		System.out.println(studente.toString());
	}

}
