package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;
import java.lang.*;
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
//@Table(name="ESAMI")
public class Esame implements Serializable {
	 public Esame (String nome2, String cfu2, String dataEsame2, String voto2) {
			this.nome=nome2;
			this.cfu=cfu2;
			this.dataEsame=dataEsame2;
			this.voto=voto2;
		}
	public Esame() {
		
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCfu() {
		return cfu;
	}

	public void setCfu(String cfu) {
		this.cfu = cfu;
	}

	public String getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(String dataEsame) {
		this.dataEsame = dataEsame;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Corso getCorso() {
		return corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}



	@Id
	 @Column(name = "codEsame")
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "codEsame")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	 private Long id;
	
	 @Column(name="nome")
		private String nome;
	 
	 @Column(name="cfu")
		private String cfu;
	 @Column(name="dataEsame")
		private String dataEsame;
	 
	 @Column(name="voto")
		private String voto;
//	 @Column(name="codDocente")
//		private String codDocente;
//	 @Column(name="codCorso")
//		private String codCorso;
	
	 
//	 @ManyToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Docente.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
//	 private List<Docente> codDocente1;
//	 
//	 @OneToOne(targetEntity = Corso.class)
//	 @JoinColumn(name = " codCorso_fk", referencedColumnName = "codCorso")
//	 private List<Corso> codCorso1;
	 
	 @ManyToOne
	 @JoinColumn(name="studente_matricola")
	 Studente studente;	
	 
	 @ManyToOne
	 @JoinColumn(name="codCorso")
	 Corso corso;
	 
	 
	 
}
