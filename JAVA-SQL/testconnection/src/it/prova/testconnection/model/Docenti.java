package it.prova.testconnection.model;

import java.sql.Date;

public class Docenti {
	
	private int id;
	private String nome;
	private String cognome;
	private String materia;
	private Date inizio_carriera;
	private boolean pensionato;
	
	
	
	public Docenti() {
		
	}



	public Docenti(int id, String nome, String cognome, String materia, Date inizio_carriera, boolean pensionato) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materia = materia;
		this.inizio_carriera = inizio_carriera;
		this.pensionato = pensionato;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



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



	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}



	public Date getInizio_carriera() {
		return inizio_carriera;
	}



	public void setInizio_carriera(Date inizio_carriera) {
		this.inizio_carriera = inizio_carriera;
	}



	public boolean isPensionato() {
		return pensionato;
	}



	public void setPensionato(boolean pensionato) {
		this.pensionato = pensionato;
	}



	@Override
	public String toString() {
		return "Docenti [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", materia=" + materia
				+ ", inizio_carriera=" + inizio_carriera + ", pensionato=" + pensionato + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
