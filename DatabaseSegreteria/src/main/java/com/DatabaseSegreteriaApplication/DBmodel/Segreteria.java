package com.DatabaseSegreteriaApplication.DBmodel;

import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Configuration
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Table(name="SEGRETERIA")
public class Segreteria {
	
	 @Id
	 @GeneratedValue
	 @Column(name="codSegreteria")
		private String codSegreteria;
	 
	 @Column(name="datiStudente")
		private String datiStudente;
	 
	 @Column(name="tasse")
		private String tasse;
	 
	 @Column(name="codFiscale")
		private String codFiscale;
		
	 @Column(name="codDocente")
		private String codDocente;
	 
	 @OneToOne(targetEntity = Studente.class)
	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
	 private List<Studente> matricola;
	 
	 @OneToOne(targetEntity = Docente.class)
	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
	 private List<Docente> codDocente;
}
