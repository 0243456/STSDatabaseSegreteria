package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.context.annotation.Configuration;

import com.DatabaseSegreteriaApplication.DBmodel.Studente;

import lombok.*;

@Configuration
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString


@Table(name="corsi")
public class Corso implements Serializable {
	

	

//	public Corso(String nome2, String durata2, Long codCorso2) {
//		this.nome=nome2;
//		this.durata=durata2;
//		this.codCorso=codCorso2;
//	}
	


	@Id
	 @Column(name="codCorso")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "codCorso")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
		private Long codCorso;
	
	 @Column(name="nome")
		private String nome;
	 
	 @Column(name="durata")
		private String durata;
	 
	 Studente studente;
	
	 
	 public Studente getStudente() {
		return studente;
	}




	public void setStudente(Studente studente) {
		this.studente = studente;
	}




	@ManyToOne
	 @JoinColumn(name="codDocente")
	 	private Docente docente;




	public Long getCodCorso() {
		return codCorso;
	}




	public void setCodCorso(Long codCorso) {
		this.codCorso = codCorso;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getDurata() {
		return durata;
	}




	public void setDurata(String durata) {
		this.durata = durata;
	}




	public Docente getDocente() {
		return docente;
	}




	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	 
	 
//	 	
//	 @ManyToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @ManyToOne(targetEntity = Docente.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
//	 private List<Docente> codDocente;
//	 
//	 
//	 @ManyToOne(targetEntity = Esame.class)
//	 @JoinColumn(name = " codEsame_fk", referencedColumnName = "codEsame")
//	 private List<Esame> codEsame;



	 
}

