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

@Table(name="SEGRETERIA")
public class Segreteria {
	
	 @Id
	 @Column(name="COD_SEGRETERIA")
		private String CODICE_SEGRETERIA;
	 
	 @Column(name="DATI_STUDENTE")
		private String DATI_STUDENTE;
	 
	 @Column(name="TASSE")
		private String TASSE;
	 
	 @Column(name="COD_FISCALE")
		private String CODICE_FISCALE;
		
	 @Column(name="COD_DOCENTE")
		private String CODICE_DOCENTE;
	 
	 
}
