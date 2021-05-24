package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Configuration
//@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString


@Table(name="corsi")
public class Corso implements Serializable {
	

	

	public Corso(String nome2, String durata2, String codDocente) {
		this.nome=nome2;
		this.durata=durata2;
		this.codDocente=codDocente;
	}
	
	
	public Corso() {
		// TODO Auto-generated constructor stub
	}


	@Id
	 @Column(name="codCorso")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "codCorso")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
		private Long codCorso;
	 @Column(name="nome")
		private String nome;
	 
	 @Column(name="durata")
		private String durata;
	 

	 
	 @ManyToOne
	 @JoinColumn(name="matricola")
		private Studente studente;
	 
	 @ManyToOne
	 @JoinColumn(name="codDocente")
	 	private Docente docente;
	 
	 
	 	
	 @OneToOne(targetEntity = Studente.class)
	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
	 private List<Studente> matricola;
	 
	 @OneToOne(targetEntity = Docente.class)
	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
	 private List<Docente> codDocente;
	 
	 @OneToOne(targetEntity = Docente.class)
	 @JoinColumn(name = " codCorso_fk", referencedColumnName = "codCorso")
	 private List<Corso> codCorso;
	 
	 @OneToOne(targetEntity = Corso.class)
	 @JoinColumn(name = " codEsame_fk", referencedColumnName = "codEsame")
	 private List<Esami> codEsame;
	 
	 
}

