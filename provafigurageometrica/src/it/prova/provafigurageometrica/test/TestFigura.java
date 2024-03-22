package it.prova.provafigurageometrica.test;

import it.prova.provafigurageometrica.model.*;

public class TestFigura {

	public static void main(String[] args) {
		
		Figura figura1 = new Quadrato(4,4);
		Figura figura2 = new TriangoloEquilatero(7,10);
		
		
		
		System.out.println(figura1.calcolaArea());
		System.out.println(figura1.calcolaPerimetro());
		
		
		System.out.println(figura2.calcolaArea());
		System.out.println(figura2.calcolaPerimetro());
		
	

	}

}
