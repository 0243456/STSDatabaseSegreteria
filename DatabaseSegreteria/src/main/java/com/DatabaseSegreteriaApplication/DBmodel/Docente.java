package com.DatabaseSegreteriaApplication.DBmodel;

import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import lombok.*;

//@Configuration
//@Entity
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString
//
//@Table(name="DOCENTI")
public class Docente {
	@Id
	 @Column(name="codDocente")
		private String codDocente;
	 @Column(name="nome")
		private String nome;
	 
	 @Column(name="cognome")
		private String cognome;
	 
	 @Column(name="materia")
		private String materia;

	 
//	 @OneToOne(targetEntity = Corso.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
//	 private List<Docente> codDocente;
	 
	 
	 
}
