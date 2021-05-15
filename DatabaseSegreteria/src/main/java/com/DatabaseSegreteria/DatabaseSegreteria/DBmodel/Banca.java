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
	 	
}
