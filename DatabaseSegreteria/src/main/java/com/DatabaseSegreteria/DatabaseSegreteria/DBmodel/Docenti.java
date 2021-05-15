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

@Table(name="DOCENTI")
public class Docenti {
	@Id
	 @Column(name="COD_DOCENTE")
		private String COD_DOCENTE;
	 @Column(name="NOME")
		private String NOME;
	 
	 @Column(name="COGNOME")
		private String COGNOME;
	 
	 @Column(name="MATERIA")
		private String MATERIA;
	 @Column(name="COD_CORSO")
		private String COD_CORSO;
}
