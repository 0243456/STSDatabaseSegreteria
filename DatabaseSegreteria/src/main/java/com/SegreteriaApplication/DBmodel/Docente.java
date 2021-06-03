package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;

import javax.persistence.*;



@Entity
@Table(name = "DOCENTI")
public class Docente implements Serializable {
	
	@Id
	@Column(name = "codDocente")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "codDocente")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	 private Long codDocente;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "materia")
	private String materia;
	
	public Docente(Long codDocente, String nome, String cognome, String materia) {
		this.codDocente = codDocente;
		this.nome = nome;
		this.cognome = cognome;
		this.materia = materia;
	}

	public Docente() {
	}
	
	public Long getCodDocente() {
		return codDocente;
	}

	public void setCodDocente(Long codDocente) {
		this.codDocente = codDocente;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
//	 @OneToOne(targetEntity = Corso.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
//	 private List<Docente> codDocente;

}
