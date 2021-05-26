package com.DatabaseSegreteriaApplication.dto;

import lombok.*;



import com.DatabaseSegreteriaApplication.DBmodel.Banca;
import com.DatabaseSegreteriaApplication.Repository.BancaRepository;
import com.DatabaseSegreteriaApplication.dto.BancaRequest;
import com.DatabaseSegreteriaApplication.services.BancaService;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


 
public class BancaRequest {
	
//		private Long codBanca;
		private String pagamenti;
		private String codSegreteria;
		private String codFiscale;

		}
