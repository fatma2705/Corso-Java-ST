package it.prova.testconnection.model;

import java.sql.Date;

public class Studenti {

	private int id;
	private String nome;
	private String cognome;
	private String matricola;
	private Date data_di_nascita;
	private String indirizzo;
	private int id_aula;
	private boolean diploamto;

	public Studenti() {

	}

	public Studenti(int id, String nome, String cognome, String matricola, Date data_di_nascita, String indirizzo,
			int id_aula, boolean diploamto) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.data_di_nascita = data_di_nascita;
		this.indirizzo = indirizzo;
		this.id_aula = id_aula;
		this.diploamto = diploamto;
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

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Date getData_di_nascita() {
		return data_di_nascita;
	}

	public void setData_di_nascita(Date data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getId_aula() {
		return id_aula;
	}

	public void setId_aula(int id_aula) {
		this.id_aula = id_aula;
	}

	public boolean isDiploamto() {
		return diploamto;
	}

	public void setDiploamto(boolean diploamto) {
		this.diploamto = diploamto;
	}

	@Override
	public String toString() {
		return "Studenti [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola
				+ ", data_di_nascita=" + data_di_nascita + ", indirizzo=" + indirizzo + ", id_aula=" + id_aula
				+ ", diploamto=" + diploamto + "]";
	}
	
	

}
