package it.prova.gestioneraccoglitore.model;

public class Foglio {
	private String qualita;
	private String tipologia;
	
	
	
	public Foglio() {
		
	}
	
	public Foglio(String qualita, String tipologia) {
		this.qualita = qualita;
		this.tipologia = tipologia;
	}
	
	
	
	public String getQualita() {
		return this.qualita;
	}
	public void setQualita(String setQualita) {
		this.qualita = setQualita;
	}
	
	
	
	public String getTipologia() {
		return this.tipologia;
	}
	public void setTipologia(String setTipologia) {
		this.tipologia= setTipologia;
	}

}
