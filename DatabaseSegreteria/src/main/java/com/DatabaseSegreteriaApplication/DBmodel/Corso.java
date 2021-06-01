package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "CORSI")
public class Corso implements Serializable {

	@Id
	@Column(name = "codCorso")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "codCorso")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long codCorso;

	@Column(name = "nome")
	private String nome;

	@Column(name = "durata")
	private String durata;

	public Corso(Long codCorso, String nome, String durata) {
		this.codCorso = codCorso;
		this.nome = nome;
		this.durata = durata;
	}
	
	public Corso() {
		
	}
	
	
	public Long getCodCorso() {
		return codCorso;
	}

	public void setCodCorso(Long codCorso) {
		this.codCorso = codCorso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDurata() {
		return durata;
	}

	public void setDurata(String durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return super.toString();
	}

//	@ManyToOne
//	 @JoinColumn(name="codDocente")
//	 	private Docente docente;
//	 	
//	 @ManyToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @ManyToOne(targetEntity = Docente.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
//	 private List<Docente> codDocente;
//	 
//	 
//	 @ManyToOne(targetEntity = Esame.class)
//	 @JoinColumn(name = " codEsame_fk", referencedColumnName = "codEsame")
//	 private List<Esame> codEsame;

}
