package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="STUDENTI")
public class Studente implements Serializable {
	
	@Id
	 @Column(name = "matricola")
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "studente_matricola")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	 private Long matricola;

	 
	 @Column(name="nome")
	 public String nome;
	 
	 @Column(name="cognome")
	 public String cognome;
	 
	
	 @Column(name="codFiscale")
	 public String codFiscale;
		
	 @Column(name="email")
	 public String email;
	 
	 
	 
	public Studente(Long matricola, String nome, String cognome, String codFiscale, String email) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
		this.email = email;
	}

	public Studente() {
		
	}

	

	public Long getMatricola() {
		return matricola;
	}

	public void setMatricola(Long matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	 

	 
}
