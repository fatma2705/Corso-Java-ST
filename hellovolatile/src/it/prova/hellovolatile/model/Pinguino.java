package it.prova.hellovolatile.model;

public class Pinguino implements Volatile{
	private String continenteAppartenza;
	
	
	public Pinguino() {
		
	}
	
	
	public Pinguino(String continenteAppartenza) {
		this.continenteAppartenza = continenteAppartenza;
		
	}
	
	
	public String getContinenteAppartenza() {
		return this.continenteAppartenza;
	}
	
	
	public void setContinenteAppartenza(String setContinenteAppartenza) {
		this.continenteAppartenza = setContinenteAppartenza;
	}


	
	public String vola() {
		return " Il pinguino è un'animale volatile ma non vola";
	}


	
	public String stampaProprietà() {
		return "Questo pinguino appartiene  al continente : " + this.continenteAppartenza;
	}
	
	
	public boolean eUgualeA(Volatile altroVolatile) {
		if(!(altroVolatile instanceof Pinguino)) {
			return false;
		}
		Pinguino tempVolatile = (Pinguino) altroVolatile;
		return this.continenteAppartenza.equals(tempVolatile.getContinenteAppartenza());
	
	}
	
	
	

}
