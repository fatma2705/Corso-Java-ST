package it.prova.provafigurageometrica.model;

public class Figura {
	protected int base;
	protected int altezza;
	
	
	
	
	public Figura() {
		
	}
	
	
	public Figura(int base,int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	
	
	public int getBase() {
		return this.base;
	}
	
	public void setBase(int setBase) {
		this.base = setBase;
	}
	
	
	public int getAltezza() {
		return this.altezza;
	}
	
	public void setAltezza(int setAltezza) {
		this.altezza = setAltezza;
	}
	
	
	
	
	public int calcolaPerimetro() {
		return -1;
	}
	
	
	public int calcolaArea() {
		return -1;
	}

}
