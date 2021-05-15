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


@Table(name="STUDENTI")
public class Studente {
	
	 @Id
	 @Column(name="matricola")
		private String matricola;
	 
	 @Column(name="nome")
		private String nome;
	 
	 @Column(name="cognome")
		private String cognome;
	 
	 @Column(name="cod_fiscale")
		private String cod_fiscale;
		
	 @Column(name="email")
		private String email;
	 
	 @Column(name="pippo")
	 private String pippo;
	 
//		public String getMatricola() {
//			return matricola;
//		}
//
//		public void setMatricola(String matricola) {
//			this.matricola = matricola;
//		}
		
	

//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
	
	

//	public String getCognome() {
//		return cognome;
//	}
//
//	public void setCognome(String cognome) {
//		this.cognome = cognome;
//	}
	
	

//	public String getCod_fiscale() {
//		return cod_fiscale;
//	}
//
//	public void setCod_fiscale(String cod_fiscale) {
//		this.cod_fiscale = cod_fiscale;
//	}
	


//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

//	@Override
//	public String toString() {
//		return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", cod_fiscale="
//				+ cod_fiscale + ", email=" + email + ", getMatricola()=" +  ", getNome()=" 
//				+ ", getCognome()=" + getCognome() + ", getCod_fiscale()=" + getCod_fiscale() + ", getEmail()="
//				+ getEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//				+ super.toString() + "]";
//	}



	 
}
