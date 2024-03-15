package it.provapersona.model;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomeModificato) {
		this.nome = nomeModificato;
		
	}
	

	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognomeModificato) {
		this.cognome = cognomeModificato;
		
	}
	

	public int getEta() {
		return eta;
	}
	
	public void setEta(int etaModificata) {
		this.eta = etaModificata;
		
	}
	
	public boolean piuAnzianoDi(Persona altraPersona) {
		return this.eta>altraPersona.getEta();
		
	}
	
	

}


