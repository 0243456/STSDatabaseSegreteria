package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "BANCA")
public class Banca implements Serializable {

	@Id
	@Column(name = "codBanca")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "codBanca")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long codBanca;
	
	@Column(name = "pagamenti")
	private String pagamenti;

	@Column(name = "codSegreteria")
	private String codSegreteria;

	@Column(name = "codFiscale")
	private String codFiscale;
	
	public Banca(Long codBanca, String pagamenti, String codSegreteria, String codFiscale) {
		this.codBanca = codBanca;
		this.pagamenti = pagamenti;
		this.codSegreteria = codSegreteria;
		this.codFiscale = codFiscale;
	}
	
	public Banca() {
		
	}

	public Long getCodBanca() {
		return codBanca;
	}

	public void setCodBanca(Long codBanca) {
		this.codBanca = codBanca;
	}

	public String getPagamenti() {
		return pagamenti;
	}

	public void setPagamenti(String pagamenti) {
		this.pagamenti = pagamenti;
	}

	public String getCodSegreteria() {
		return codSegreteria;
	}

	public void setCodSegreteria(String codSegreteria) {
		this.codSegreteria = codSegreteria;
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

//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_f	k", referencedColumnName = "matricola")
//	 private List<Studente> matricola;

//	 @OneToOne(targetEntity = Segreteria.class)
//	 @JoinColumn(name = " codSegreteria_fk", referencedColumnName = "codSegreteria")
//	 private List<Segreteria> codSegreteria;
}
