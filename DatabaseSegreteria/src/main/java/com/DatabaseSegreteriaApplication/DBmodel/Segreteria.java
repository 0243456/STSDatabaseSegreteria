package com.DatabaseSegreteriaApplication.DBmodel;

import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Configuration
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Table(name="SEGRETERIA")
public class Segreteria {
	
	 @Id
	 @GeneratedValue
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
//	 
//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Docenti.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "COD_DOCENTE")
//	 private List<Docenti> COD_DOCENTE;
}
