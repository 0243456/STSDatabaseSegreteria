package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Generated;
import static javax.persistence.GenerationType.IDENTITY;
import org.springframework.context.annotation.Configuration;

import lombok.*;

@Configuration
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Entity
@Table(name="STUDENTI")
public class Studente implements Serializable {
	
	 public Studente(String nome2, String cognome2, String codFiscale2, String email2) {
		this.nome=nome2;
		this.codFiscale=codFiscale2;
		this.cognome=cognome2;
		this.email=email2;
	}
	 
	public Studente() {
		
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
	 
	 
	 @Column(name="nome")
	 public String nome;
	 
	 @Column(name="cognome")
	 public String cognome;
	 
	
	 @Column(name="codFiscale")
	 public String codFiscale;
		
	 @Column(name="email")
	 public String email;

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

	
	 

	 
}
