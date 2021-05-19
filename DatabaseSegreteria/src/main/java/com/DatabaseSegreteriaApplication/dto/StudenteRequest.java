package com.DatabaseSegreteriaApplication.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class StudenteRequest {
	
//		private String matricola;
		private String nome;
		private String cognome;
		private String cod_fiscale;
		private String email;
		}
