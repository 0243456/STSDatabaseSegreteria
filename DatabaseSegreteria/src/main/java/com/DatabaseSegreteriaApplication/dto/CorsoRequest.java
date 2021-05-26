package com.DatabaseSegreteriaApplication.dto;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.DatabaseSegreteriaApplication.DBmodel.Corso;



@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CorsoRequest {
	
		
		private  @Getter @Setter String nome;
		private   @Getter @Setter String durata;
		private @Getter @Setter String codDocente;
		private String matricola;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDurata() {
			return durata;
		}
		public String getMatricola() {
			return matricola;
		}
		public void setMatricola(String matricola) {
			this.matricola = matricola;
		}
		public void setDurata(String durata) {
			this.durata = durata;
		}
		public String getCodDocente() {
			return codDocente;
		}
		public void setCodDocente(String codDocente) {
			this.codDocente = codDocente;
		}
	
		
	
}
		

