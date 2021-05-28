package com.DatabaseSegreteriaApplication.DBmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UTENTI")
public class LoginPageStudente {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "studente_matricola")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private long matricola;
	
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(nullable = false, length = 20)
	private String Nome;
	
	@Column(nullable = false, length = 20)
	private String Cognome;
	
	@Column(nullable = false, unique = true, length = 64)
	private String password;
	

	public long getMatricola() {
		return matricola;
	}
	public void setMatricola(long matricola) {
		this.matricola = matricola;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
