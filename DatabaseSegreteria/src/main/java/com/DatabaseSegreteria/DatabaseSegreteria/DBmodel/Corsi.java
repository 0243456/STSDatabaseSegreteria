package com.DatabaseSegreteria.DatabaseSegreteria.DBmodel;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Configuration
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name="CORSI")
public class Corsi {
	@Id
	 @Column(name="COD_CORSO")
		private String CODICE_CORSO;
	 @Column(name="NOME")
		private String NOME;
	 
	 @Column(name="DURATA")
		private String DURATA;
	 
	 @Column(name="COD_DOCENTE")
		private String COD_DOCENTE;
	 @Column(name="MATRICOLA")
		private String MATRICOLA;
	 	

}
