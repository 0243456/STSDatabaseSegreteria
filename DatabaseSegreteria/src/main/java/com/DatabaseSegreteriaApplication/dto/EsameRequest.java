package com.DatabaseSegreteriaApplication.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import com.DatabaseSegreteriaApplication.DBmodel.Esami;

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
}
