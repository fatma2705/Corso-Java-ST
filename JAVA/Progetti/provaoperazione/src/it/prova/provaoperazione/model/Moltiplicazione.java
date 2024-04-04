package it.prova.provaoperazione.model;

public class Moltiplicazione implements Operazione{
	public int numero1;
	public int numero2;
	
	
	public Moltiplicazione() {
		
	}
	
	
	public Moltiplicazione(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	
	public int getNumero1() {
		return this.numero1;
	}
	
	public void setNumero1(int setNumero1) {
		this.numero1 = setNumero1;
	}
	
	
	
	public int getNumero2() {
		return this.numero1;
	}
	
	public void setNumero2(int setNumero2) {
		this.numero2 = setNumero2;
	}
	
	
	
	
	public int eseguiOperazione() {
		int risultato = this.numero1 * this.numero2;
		return risultato;
	}


	
	public void stampaOperazione() {
		int risultato = this.numero1 * this.numero2;
		System.out.println("Il risultato dell'operazione " + this.numero1 +  " * " + this.numero2 + " è = " + risultato );
		
	}


	
	public boolean seRisultatoNegativo() {
		int risultato = this.numero1 * this.numero2;
		if (risultato < 0) {
			return true;
		}
		return false;
	}


	

}
