package com.SegreteriaApplication.DBmodel;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="SEGRETERIA")
public class Segreteria implements Serializable {
	
	@Id
	 @Column(name="codSegreteria")
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="codSegreteria")
	 @SequenceGenerator(name="id_Sequence", sequenceName = "ID_SEQ")
		private Long codSegreteria;
	 
	 @Column(name="datiStudente")
	 public String datiStudente;
	 
	 @Column(name="tasse")
	 public String tasse;
	 
	 @Column(name="codFiscale")
	 public String codFiscale;
		

	 
	 public Segreteria(Long codSegreteria, String datiStudente, String tasse, String codFiscale, String codDocente) {
		 this.codSegreteria = codSegreteria;
		 this.datiStudente = datiStudente;
		 this.tasse = tasse;
		 this.codFiscale = codFiscale;
		 
		
	 }
	 
	 public Segreteria() {
		 
	 }
	 
	 
	 public Long getCodSegreteria() {
		return codSegreteria;
	}

	public void setCodSegreteria(Long codSegreteria) {
		this.codSegreteria = codSegreteria;
	}

	public String getDatiStudente() {
		return datiStudente;
	}

	public void setDatiStudente(String datiStudente) {
		this.datiStudente = datiStudente;
	}

	public String getTasse() {
		return tasse;
	}

	public void setTasse(String tasse) {
		this.tasse = tasse;
	}

	public String getCodFiscale() {
		return codFiscale;
	}

	public void setCodFiscale(String codFiscale) {
		this.codFiscale = codFiscale;
	}


	@Override
	public String toString() {
		return super.toString();
	}


	 
	 @ManyToOne(targetEntity = Studente.class)
	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
	 private List<Studente> matricola;
	 
	 @ManyToOne(targetEntity = Docente.class)
	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
	 private List<Docente> codDocente;
}
