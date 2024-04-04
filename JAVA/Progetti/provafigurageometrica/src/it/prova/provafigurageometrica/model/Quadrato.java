package it.prova.provafigurageometrica.model;

public class Quadrato extends Figura{
	
	
	public Quadrato() {
		
	}
	
	public Quadrato(int base,int altezza) {
		super(base,altezza);
	}
	
	

	public int calcolaPerimetro() {
		return super.base *4;
	}
	
	

	public int calcolaArea() {
		return super.base * super.base;
	}

}
