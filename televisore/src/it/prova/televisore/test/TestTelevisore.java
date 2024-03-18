package it.prova.televisore.test;

import it.prova.televisore.model.Televisore;

public class TestTelevisore {
	
	public static void main(String[] args) {
		
		Televisore tv1 = new Televisore("tv","samsung",8000,26);
		Televisore tv2 = new Televisore("tv","samsung",700000,52);
		Televisore tv3 = new Televisore("tv","samsung",500,47);
		
		Televisore[] arrayTv = {tv1,tv2,tv3};
		
		
		
		
//		if(tv1.costaMenoDelBudgetDisponibile(4500)) {
//			System.out.println(tv1.getModello() +" costa di più del budget disponibile");
//		}else {
//			System.out.println(tv1.getModello() +" costa  meno del budget disponibile");
//		}
//		
//		if(tv1.stessaMarcaDi(tv2)) {
//			System.out.println(tv1.getMarca() +" Ha la stessa marca della seconda tv");
//		}else {
//			System.out.println(tv1.getMarca() +" Non ha la stessa marca della seconda tv");
//		}
//		
//		
//		
//		if(tv1.piuGrandeDi(tv2)) {
//			System.out.println(tv1.getPollici() +" Ha la stessa grandezza della seconda tv");
//		}else {
//			System.out.println(tv1.getPollici() +" Non ha la stessa grandezza della seconda tv");
//		}
//		
//		
//		if(tv1.miglioreQualitaPrezzoDi(tv2)) {
//			System.out.println(tv1.getPollici() + tv1.getPrezzo()+" Ha la qualità prezzo migliore della seconda tv");
//		}else {
//			System.out.println(tv1.getPollici() + tv1.getPrezzo()+" Non Ha la qualità prezzo migliore della seconda tv");
//		}
		
		
//		
		Televisore tv =new Televisore("tv","samsung",70,26);
//		
//		if(tv.esisteAlmenoUnoPiuEconomicoDi(arrayTv)) {
//			System.out.println("Esiste Almeno Uno  economico");
//		}else {
//			System.out.println("Non esiste almeno uno economico ");
//		}
//		
//		
//		int tvPiuGrandi =tv.quantiSonoPiuGrandi(arrayTv);
//		System.out.println("Numero   tv che sono più grandi :  " + tvPiuGrandi);
//		
//		
//		
//		
//		System.out.println("Tv che sono più cari pur avendo la stessa marca : "+ tv.quantiSonoPiuCariAvendoStessaMarca(arrayTv));
//		
//		
//		System.out.println(tv.stampaTelevisore());
//		
//		
//		System.out.println("Tv più caro della media dei tv dell'array ? " + tv.piuCaroDellaMedia(arrayTv));
//		
		Televisore ret = Televisore.trovaIlPiuCostoso(arrayTv);
		System.out.println(ret.stampaTelevisore());
		
	}

}
