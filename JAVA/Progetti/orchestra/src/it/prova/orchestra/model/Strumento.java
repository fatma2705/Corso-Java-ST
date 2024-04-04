package it.prova.orchestra.model;

abstract public class Strumento {
	
	private int estensione;
	private Famiglia famiglia;
	private boolean accordabile;
	private boolean accordato;
	
	
	
	public Strumento() {
		
	}
	
	
	
	
	public Strumento(int estensione, Famiglia famiglia, boolean accordabile, boolean accordato) {
		this.estensione = estensione;
		this.famiglia = famiglia;
		this.accordabile = accordabile;
		this.accordato = accordato;
		
	}
	
	public int getEstensione() {
		return this.estensione;
	}
	
	public void setEstensione(int setEstensione ) {
		this.estensione = setEstensione;
	}
	
	
	public Famiglia getFamiglia() {
		return this.famiglia;
	}
	
	public void setFamiglia(Famiglia setFamiglia ) {
		this.famiglia = setFamiglia;
	}
	
	
	
	public boolean getAccordabile() {
		return this.accordabile;
	}
	
	public void setAccordabile(boolean setAccordabile ) {
		this.accordabile = setAccordabile;
	}
	
	
	public boolean getAccordato() {
		return this.accordato;
	}
	
	public void setAccordato(boolean setAccordato ) {
		this.accordato = setAccordato;
	}
	
	
	
	
	
	
	
	
	
	abstract public void accorda();
	abstract public void produciSuono();
	abstract public String ottieniDescrizione();
	
	
	

}
