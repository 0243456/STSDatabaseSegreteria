package com.DatabaseSegreteriaApplication.DBmodel;
import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import lombok.*;

@Configuration
@Entity
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@ToString

@Table(name="BANCA")
public class Banca {
	
	@Id
	 @Column(name="codBanca")
		private String codBanca;
	 @Column(name="pagamenti")
		private String pagamenti;
	 
	 @Column(name="codSegreteria")
		private String codSegreteria;
	 
	 @Column(name="codFiscale")
		private String codFiscale;
	 	
//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
	 
//	 @OneToOne(targetEntity = Segreteria.class)
//	 @JoinColumn(name = " codSegreteria_fk", referencedColumnName = "codSegreteria")
//	 private List<Segreteria> codSegreteria;
}
