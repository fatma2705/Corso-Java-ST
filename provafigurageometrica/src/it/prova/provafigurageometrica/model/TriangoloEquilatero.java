package it.prova.provafigurageometrica.model;

public class TriangoloEquilatero extends Figura {
	
	
	public TriangoloEquilatero() {
		
	}
	
	
	
	public TriangoloEquilatero(int base,int altezza) {
		super(base,altezza);
	}
	
	
	
	public int calcolaPerimetro() {
		return (super.base + super.altezza) *2;
		
	}
	
	
	public int calcolaArea() {
		return (super.base * super.altezza) /2;
	}

}
