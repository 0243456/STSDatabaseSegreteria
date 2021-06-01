package com.DatabaseSegreteriaApplication.DBmodel;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "ESAMI")
public class Esame implements Serializable {

	@Id
	@Column(name = "codEsame")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "codEsame")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long codEsame;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cfu")
	private String cfu;
	@Column(name = "dataEsame")
	private String dataEsame;

	@Column(name = "voto")
	private String voto;

	 public Esame (Long codEsame, String nome, String cfu, String dataEsame) {
			this.codEsame=codEsame;
			this.nome=nome;
			this.cfu=cfu;
			this.dataEsame=dataEsame;
		}
	 public Esame() {
		 
	 }

	public Long getCodEsame() {
		return codEsame;
	}
	public void setCodEsame(Long codEsame) {
		this.codEsame = codEsame;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCfu() {
		return cfu;
	}
	public void setCfu(String cfu) {
		this.cfu = cfu;
	}
	public String getDataEsame() {
		return dataEsame;
	}
	public void setDataEsame(String dataEsame) {
		this.dataEsame = dataEsame;
	}
	public String getVoto() {
		return voto;
	}
	public void setVoto(String voto) {
		this.voto = voto;
	}
	@Override
	public String toString() {
		return super.toString();
	}

	
//	 @Column(name="codDocente")
//		private String codDocente;
//	 @Column(name="codCorso")
//		private String codCorso;
//	 @ManyToOne(targetEntity = Studente.class)
//	 @JoinColumn(name = " matricola_fk", referencedColumnName = "matricola")
//	 private List<Studente> matricola;
//	 
//	 @OneToOne(targetEntity = Docente.class)
//	 @JoinColumn(name = " codDocente_fk", referencedColumnName = "codDocente")
//	 private List<Docente> codDocente1;
//	 
//	 @OneToOne(targetEntity = Corso.class)
//	 @JoinColumn(name = " codCorso_fk", referencedColumnName = "codCorso")
//	 private List<Corso> codCorso1;

//	 @ManyToOne
//	 @JoinColumn(name="studente_matricola")
//	 Studente studente;	
//	 
//	 @ManyToOne
//	 @JoinColumn(name="codCorso")
//	 Corso corso;

}
