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

@Table(name="BANCA")
public class Banca {
	
	@Id
	 @Column(name="COD_BANCA")
		private String CODICE_BANCA;
	 @Column(name="PAGAMENTI")
		private String PAGAMENTI;
	 
	 @Column(name="COD_SEGRETERIA")
		private String CODICE_SEGRETERIA;
	 
	 @Column(name="COD_FISCALE")
		private String CODICE_FISCALE;
	 	
//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Segreteria.class)
//	 @JoinColumn(name = " COD_SEGRETERIA_fk", referencedColumnName = "COD_SEGRETERIA")
//	 private List<Segreteria> COD_SEGRETERIA;
}
