package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;
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

@Table(name="ESAMI")
public class Esami implements Serializable {
	 public Esami (String nome2, String cfu2, String dataEsame2, String voto2) {
			this.nome=nome2;
			this.cfu=cfu2;
			this.dataEsame=dataEsame2;
			this.voto=voto2;
		}
	
	@Id
	 @Column(name = "codEsame")
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "codEsame")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	 private Long id;
	
	 @Column(name="nome")
		private String nome;
	 
	 @Column(name="cfu")
		private String cfu;
	 @Column(name="dataEsame")
		private String dataEsame;
	 
	 @Column(name="voto")
		private String voto;
//	 @Column(name="COD_DOCENTE")
//		private String COD_DOCENTE;
//	 @Column(name="COD_CORSO")
//		private String COD_CORSO;
	
	 
//	 @OneToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Docenti.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "COD_DOCENTE")
//	 private List<Docenti> COD_DOCENTE;
//	 
//	 @OneToOne(targetEntity = Corsi.class)
//	 @JoinColumn(name = " codCorso_fk", referencedColumnName = "COD_CORSO")
//	 private List<Corsi> COD_CORSO;
	 
	 @ManyToOne
	 @JoinColumn(name="studente_matricola")
	 Studente studente;	
	 
	 @ManyToOne
	 @JoinColumn(name="codCorso")
	 Corso corsi;
	 
	 
	 
}
