package it.prova.persona.model;

public class Indirizzo {
	private String citta;
	private String via;
	private int civico;
	
	
	
	public Indirizzo() {
		
	}

	
	public Indirizzo(String citta, String via, int civico) {
		this.citta = citta;
		this.via = via;
		this.civico = civico;
	}
	
	public String getCitta() {
		return this.citta;
	}
	public void setCitta(String setCitta) {
		this.citta = setCitta;
	}
	
	
	
	public String getVia() {
		return this.via;
	}
	public void setVia(String setVia) {
		this.via = setVia;
	}
	
	
	
	public int getCivico() {
		return this.civico;
	}
	public void setCivico(int setCivico) {
		this.civico = setCivico;
	}
	
	
}
