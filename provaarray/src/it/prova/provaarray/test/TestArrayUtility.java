package it.prova.provaarray.test;

import it.prova.provaarray.utility.ArrayUtility;

public class TestArrayUtility {

	public static void main(String[] args) {
		int [] valoriPerTestSommaElementi = {7,8,9,4};
		//System.out.println(ArrayUtility.sommaElementi(valoriPerTestSommaElementi));
		//System.out.println(ArrayUtility.sommaElementiIndiceDispariAlContrario(valoriPerTestSommaElementi));
		//System.out.println(ArrayUtility.contaQuantiSonoNegativiPari(valoriPerTestSommaElementi));
		//System.out.println(ArrayUtility.esisteAlmenoUnNegativoPari(valoriPerTestSommaElementi));
		//System.out.println(ArrayUtility.esistenzaNumero(valoriPerTestSommaElementi, 5));
		//System.out.println(ArrayUtility.dimmiSeTantiDispariQuantiPari(valoriPerTestSommaElementi));
		//System.out.println(ArrayUtility.quantiSonoDivisiPer(valoriPerTestSommaElementi, 8));
		//System.out.println(ArrayUtility.verificaSeOrdineDecrescente(valoriPerTestSommaElementi));
		//System.out.println(ArrayUtility.tuttiNumeriPari(valoriPerTestSommaElementi));
		//int[] ret =( ArrayUtility.riempiConNumeroDaSottrarre(valoriPerTestSommaElementi, 2));
		//for (int i=0;i<ret.length;i++) {
			//System.out.println(ret[i]);
		//}
		//System.out.println(ArrayUtility.presenteSoloUnaVolta(valoriPerTestSommaElementi,5 ));
		int[] ret =( ArrayUtility.creaArreyInvertito(valoriPerTestSommaElementi));
		for (int i=0;i<ret.length;i++) {
				System.out.println(ret[i]);
		
		}
	}

}
