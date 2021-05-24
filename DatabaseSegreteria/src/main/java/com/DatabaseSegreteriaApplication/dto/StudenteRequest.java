package com.DatabaseSegreteriaApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import com.DatabaseSegreteriaApplication.DBmodel.Studente;
import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.StudenteService;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class StudenteRequest {
	
//		private String matricola;
		private String nome;
		private String cognome;
		private String codFiscale;
		private String email;
		}
