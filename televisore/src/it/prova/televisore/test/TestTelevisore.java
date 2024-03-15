package it.prova.televisore.test;

import it.prova.televisore.model.Televisore;

public class TestTelevisore {
	
	public static void main(String[] args) {
		
		Televisore tv1 = new Televisore("tv","samsung",70000,26);
		Televisore tv2 = new Televisore("tv","samsung",70000,26);
		
		
		if(tv1.costaMenoDelBudgetDisponibile(4500)) {
			System.out.println(tv1.getModello() +" costa di più del budget disponibile");
		}else {
			System.out.println(tv1.getModello() +" costa  meno del budget disponibile");
		}
		
		if(tv1.stessaMarcaDi(tv2)) {
			System.out.println(tv1.getMarca() +" Ha la stessa marca della seconda tv");
		}else {
			System.out.println(tv1.getMarca() +" Non ha la stessa marca della seconda tv");
		}
		
		
		
		if(tv1.piuGrandeDi(tv2)) {
			System.out.println(tv1.getPollici() +" Ha la stessa grandezza della seconda tv");
		}else {
			System.out.println(tv1.getPollici() +" Non ha la stessa grandezza della seconda tv");
		}
		
		
		if(tv1.miglioreQualitaPrezzoDi(tv2)) {
			System.out.println(tv1.getPollici() + tv1.getPrezzo()+" Ha la qualità prezzo migliore della seconda tv");
		}else {
			System.out.println(tv1.getPollici() + tv1.getPrezzo()+" Non Ha la qualità prezzo migliore della seconda tv");
		}
	}

}
