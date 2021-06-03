package com.SegreteriaApplication.DBmodel;

import java.io.Serializable;
import java.util.List;

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

	@Column(name = "codFiscale")
	private String codFiscale;
	
	public Banca(Long codBanca, String pagamenti, String codSegreteria, String codFiscale) {
		this.codBanca = codBanca;
		this.pagamenti = pagamenti;
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

	 @ManyToOne(targetEntity = Segreteria.class)
	 @JoinColumn(name = " codSegreteria_fk", referencedColumnName = "codSegreteria")
	 private List<Segreteria> codSegreteria;
}
