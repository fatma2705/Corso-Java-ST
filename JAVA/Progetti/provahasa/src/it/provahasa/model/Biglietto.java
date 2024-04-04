package it.provahasa.model;

public class Biglietto {
	private String nomeSpettacolo;
	private char letteraFila;
	private int numeroPosto;
	private double prezzo;
	
	
	
	public Biglietto() {
		
	}
	
	public Biglietto(String nomeSpettacolo,char letteraFila , int numeroPosto,double prezzo) {
		this.nomeSpettacolo = nomeSpettacolo;
		this.letteraFila = letteraFila;
		this.numeroPosto = numeroPosto;
		this.prezzo = prezzo;
	}
	
	
	
	public String getNomeSpettacolo() {
		return this.nomeSpettacolo;
	}
	public void setNomeSpettacolo(String modificaNomeSpettacolo) {
		this.nomeSpettacolo=modificaNomeSpettacolo;
	}
	
	public char getLetterafila() {
		return this.letteraFila;
	}
	public void setLetterafila(char modificaLetterafila) {
		this.letteraFila = modificaLetterafila;
	}
	
	
	public int getNumeroPosto() {
		return this.numeroPosto;
	}
	public void setNumeroPosto(int modificaNomePosto) {
		this.numeroPosto = modificaNomePosto;
	}
	
	
	public double getPrezzo() {
		return this.prezzo;
	}
	public void setPrezzo(double modificaPrezzo) {
		this.prezzo = modificaPrezzo;
	}
	
	
	
	public static Biglietto trovaIlPiuEconomico(Biglietto[] elencoBiglietti) {
		Biglietto bigliettoEconomico = null;
		for (int i=0; i<elencoBiglietti.length;i++) {
			if (elencoBiglietti[i].getPrezzo() < elencoBiglietti[0].getPrezzo() ) {
				bigliettoEconomico = elencoBiglietti[i];
			}
		}
		return bigliettoEconomico;
	}
	
	
	public boolean bigliettoAncorainvenduto(Biglietto[] elencoBigliettiInvenduti) {
		for (int i=0;i<elencoBigliettiInvenduti.length;i++) {
			if(elencoBigliettiInvenduti[i].getNomeSpettacolo().equals(this.nomeSpettacolo) && elencoBigliettiInvenduti[i].getLetterafila() == this.letteraFila && elencoBigliettiInvenduti[i].getNumeroPosto() == this.numeroPosto) {
				return true ;
			}
		}
		return false;
	}




}
