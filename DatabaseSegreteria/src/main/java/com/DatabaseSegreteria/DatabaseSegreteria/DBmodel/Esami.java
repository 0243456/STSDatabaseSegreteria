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

@Table(name="ESAMI")
public class Esami {
	@Id
	 @Column(name="COD_ESAME")
		private String COD_ESAME;
	 @Column(name="NOME")
		private String NOME;
	 
	 @Column(name="CFU")
		private String CFU;
	 @Column(name="DATA_ESAME")
		private String DATA_ESAME;
	 
	 @Column(name="VOTO")
		private String VOTO;
	 @Column(name="COD_DOCENTE")
		private String COD_DOCENTE;
	 @Column(name="COD_CORSO")
		private String COD_CORSO;
	 @Column(name="MATRICOLA")
		private String MATRICOLA;
	 
	 
}
