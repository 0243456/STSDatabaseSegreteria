package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Generated;
import static javax.persistence.GenerationType.IDENTITY;
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


@Table(name="STUDENTI")
public class Studente implements Serializable {
	
	 public Studente(String nome2, String cognome2, String cod_fiscale2, String email2) {
		this.nome=nome2;
		this.cod_fiscale=cod_fiscale2;
		this.cognome=cognome2;
		this.email=email2;
	}
	 
	 @Id
	 @Column(name = "matricola")
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "studente_matricola")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	 private Long id;
//	@Id
//	 @GeneratedValue(strategy = IDENTITY)
//	 @Column(name="matricola")
//	public Long matricola;
//	 @ManyToOne()
//	 @JoinColumn(name="segreteria")
//	 Segreteria segreteria;
	 
	 
	 
	 @Column(name="nome")
	 public String nome;
	 
	 @Column(name="cognome")
	 public String cognome;
	 
	
	 @Column(name="cod_fiscale")
	 public String cod_fiscale;
		
	 @Column(name="email")
	 public String email;
	 
	
	 
	 
	 
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
