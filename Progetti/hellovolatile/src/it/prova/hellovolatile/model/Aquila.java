package it.prova.hellovolatile.model;

public class Aquila implements Volatile{
	private String razzaAquila;
	
	
	public  Aquila() {
		
	}
	
	
	public  Aquila(String razzaAquila) {
		this.razzaAquila = razzaAquila;
	}
	
	public String getRazzaAquila() {
		return this.razzaAquila;
	}
	
	
	public void setRazzaAquila(String setRazzaAquila) {
		this.razzaAquila = setRazzaAquila;
	}




	
	public String vola() {
		return "L'aquila è un animale volatile che vola";
	}

	
	public String stampaProprietà() {

		return "Questa aquila è della razza : " + this.razzaAquila;
	}



	public boolean eUgualeA(Volatile altroVolatile) {
		if(!(altroVolatile instanceof Aquila)) {
			return false;
		}
		Aquila tempVolatile = (Aquila) altroVolatile;
		return this.razzaAquila.equals(tempVolatile.getRazzaAquila());
	
	}

	
}