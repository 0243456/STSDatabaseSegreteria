package com.DatabaseSegreteriaApplication.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import com.DatabaseSegreteriaApplication.DBmodel.Esame;

import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EsameRequest {
//	private Long codEsame;
	private String nome;
	private String cfu;
	private String dataEsame;
	private String voto;
	private Long matricola;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCfu() {
		return cfu;
	}
	public void setCfu(String cfu) {
		this.cfu = cfu;
	}
	public String getDataEsame() {
		return dataEsame;
	}
	public void setDataEsame(String dataEsame) {
		this.dataEsame = dataEsame;
	}
	public String getVoto() {
		return voto;
	}
	public void setVoto(String voto) {
		this.voto = voto;
	}
	public Long getMatricola() {
		return matricola;
	}
	public void setMatricola(Long matricola) {
		this.matricola = matricola;
	}	 
}
