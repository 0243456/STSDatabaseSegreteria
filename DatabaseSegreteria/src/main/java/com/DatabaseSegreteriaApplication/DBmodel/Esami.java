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

@Table(name="ESAMI")
public class Esami {
	@Id
	 @Column(name="COD_ESAME")
		private String COD_ESAME;
	 @Column(name="NOME")
		private String NOME;
	 
	 @Column(name="CFU")
		private String CFU;
	 @Column(name="DATA_ESAME")
		private String DATA_ESAME;
	 
	 @Column(name="VOTO")
		private String VOTO;
//	 @Column(name="COD_DOCENTE")
//		private String COD_DOCENTE;
//	 @Column(name="COD_CORSO")
//		private String COD_CORSO;
	 @Column(name="MATRICOLA")
		private String MATRICOLA;
	 
//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Docenti.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "COD_DOCENTE")
//	 private List<Docenti> COD_DOCENTE;
//	 
//	 @OneToOne(targetEntity = Corsi.class)
//	 @JoinColumn(name = " codCorso_fk", referencedColumnName = "COD_CORSO")
//	 private List<Corsi> COD_CORSO;
	 
	 @ManyToOne
	 @JoinColumn(name="studente_matricola")
	 Studente studente;	
	 
	 
	 
}
