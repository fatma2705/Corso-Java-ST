package it.prova.provaoperazione.test;

import it.prova.provaoperazione.model.*;


public class TestOperazione {

	public static void main(String[] args) {
		
		
		Operazione operazione1 = new Somma(10,10);
		Operazione operazione2 = new Sottrazione(50,10);
		Operazione operazione3 = new Divisione(100,10);
		Operazione operazione4 = new Moltiplicazione(10,10);
		
		
		operazione1.stampaOperazione();
		System.out.println(operazione2.seRisultatoNegativo());
		System.out.println(operazione3.eseguiOperazione());
		operazione4.stampaOperazione();
		

	}

}
