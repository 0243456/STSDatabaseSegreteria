package com.DatabaseSegreteriaApplication.dto;

import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.DatabaseSegreteriaApplication.Repository.StudenteRepository;
import com.DatabaseSegreteriaApplication.dto.StudenteRequest;
import com.DatabaseSegreteriaApplication.services.StudenteService;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


 

public class StudenteRequest {
	
//		private String matricola;
		private String nome;
		private String cognome;
		private String codFiscale;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCognome() {
			return cognome;
		}
		public void setCognome(String cognome) {
			this.cognome = cognome;
		}
		public String getCodFiscale() {
			return codFiscale;
		}
		public void setCodFiscale(String codFiscale) {
			this.codFiscale = codFiscale;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		private String email;

		}
