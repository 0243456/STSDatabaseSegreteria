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
	 	
//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Docenti.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "cod_docente")
//	 private List<Docenti> cod_docente;
//	 
//	 @OneToOne(targetEntity = Docenti.class)
//	 @JoinColumn(name = " codCorso_fk", referencedColumnName = "COD_CORSO")
//	 private List<Corsi> COD_CORSO;
//	 
//	 @OneToOne(targetEntity = Corsi.class)
//	 @JoinColumn(name = " codEsame_fk", referencedColumnName = "COD_ESAME")
//	 private List<Esami> COD_ESAME;
}

