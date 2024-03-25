package it.prova.hellovolatile.test;

import it.prova.hellovolatile.model.*;




public class TestVolatile {
	
	public static void main(String[] args) {
		
		Volatile animale1 = new Aquila("maculata");
		Volatile animale2 = new Gallina("nero");
		Volatile animale3 = new Pinguino("Antartide");
		
		Volatile animale = new Aquila("Americana");
		Volatile animale4 = new Gallina("nero");
		Volatile animale5 = new Pinguino("Antartide");
		
		
		
		
		System.out.println(animale1.vola());
		System.out.println(animale1.stampaProprietà());
		System.out.println(animale2.vola());
		System.out.println(animale2.stampaProprietà());
		System.out.println(animale3.vola());
		System.out.println(animale3.stampaProprietà());
		
		
		
		if (animale.eUgualeA(animale1)) {
			System.out.println("true");;
		}
		System.out.println("false");
		
		
	}

}
