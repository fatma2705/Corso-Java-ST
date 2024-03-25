package it.prova.hellovolatile.model;

public class Gallina implements Volatile{
	private String piumaggio;
	
	
	public Gallina() {
		
	}
	
	public Gallina(String piumaggio) {
		this.piumaggio = piumaggio;
	}
	
	public String getPiumaggio() {
		return this.piumaggio;
	}
	
	public void setPiumaggio(String setPiumaggio) {
		this.piumaggio = setPiumaggio;
	}

	
	public String vola() {
		return "La gallina è un'animale volatile ma non vola";
	}

	
	public String stampaProprietà() {
		return "Questa gallina ha il piumaggio di colore " + this.piumaggio;
	}
	
	
	public boolean eUgualeA(Volatile altroVolatile) {
		if(!(altroVolatile instanceof Gallina)) {
			return false;
		}
		Gallina tempVolatile = (Gallina) altroVolatile;
		return this.piumaggio.equals(tempVolatile.getPiumaggio());
	
	}
	
	
	
	
	

}
