package com.DatabaseSegreteriaApplication.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CorsoRequest {
	
		private Long codCorso;
		private String nome;
		private String durata;
		private String codDocente;
		private String matricola;
		
}
