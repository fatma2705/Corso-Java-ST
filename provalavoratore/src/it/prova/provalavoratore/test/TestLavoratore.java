package it.prova.provalavoratore.test;

import it.prova.provalavoratore.model.Lavoratore;
import it.prova.provalavoratore.model.Operaio;
import it.prova.provalavoratore.model.Volontario;

public class TestLavoratore {

	public static void main(String[] args) {
		
		
		Lavoratore lavoratore1 = new Operaio("mario","rossi",2000);
		
		Lavoratore lavoratore2 = new Volontario("marco","gianni","ATAC");
		Lavoratore lavoratore3 = new Operaio("mario","rossi",2000);
		
		Lavoratore lavoratore4 = new Volontario("marco","gianni","ATAC");
		
		Lavoratore[] array = {lavoratore1,lavoratore2,lavoratore3,lavoratore4};
		System.out.println(lavoratore1.contaLavoratoriConCognome(array, "gianni"));
		
		
		System.out.println(lavoratore1.percepisco());
		
		System.out.println(lavoratore2.percepisco());
		
		System.out.println(lavoratore1.contaLavoratoriVolontari(array));
	}

}
