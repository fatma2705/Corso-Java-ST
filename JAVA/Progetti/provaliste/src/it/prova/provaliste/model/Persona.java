package it.prova.provaliste.model;

import java.util.List;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	
	
	
	public Persona() {
		
	}
	
	
	public Persona(String nome, String cognome , int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String setNome) {
		this.nome = setNome;
	}
	
	
	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String setCognome) {
		this.cognome = setCognome;
	}
	
	
	
	
	public int getEta() {
		return this.eta;
	}
	public void setEta(int setEta) {
		this.eta = setEta;
	}
	
	public boolean presenteInElenco(List<Persona> persone) {
		for (Persona item : persone )
		if (item.getNome().equals(this.nome) && item.getCognome().equals(this.cognome) && item.getEta() == this.eta) {
			return true;
		}
		return false;
	}
	
	
	

}
