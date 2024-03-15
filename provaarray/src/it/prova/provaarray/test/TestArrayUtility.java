package it.prova.provaarray.test;

import java.util.Arrays;

import it.prova.provaarray.utility.ArrayUtility;

public class TestArrayUtility {

	public static void main(String[] args) {
		//int [] valoriPerTestSommaElementi = {20,55,10,8,2,70};
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
		//int[] ret =( ArrayUtility.creaArreyInvertito(valoriPerTestSommaElementi));
		//for (int i=0;i<ret.length;i++) {
				//System.out.println(ret[i]);
				
		
				
				
		
		//int[] ret =( ArrayUtility.cancellaElementoArray(valoriPerTestSommaElementi, 9));
		//for (int i=0;i<ret.length;i++) {
			//	System.out.println(ret[i]);
		//}
		
		
//		
//		int[] ret =( ArrayUtility.ordineCrescente(valoriPerTestSommaElementi));
//				for (int i=0;i<ret.length;i++) {
//					System.out.println(ret[i]);
//				}
//				
				
//				int[] ret =( ArrayUtility.aggiungiInCoda(valoriPerTestSommaElementi,0));
//				for (int i=0;i<ret.length;i++) {
//					System.out.println(ret[i]);
//				}
//				
				
		int [] valoriPerTestSommaElementi = {1,3,4,6,8,9,12,13,14,15,16,17,18,30,80,120,170,200};
//				
//				System.out.println(ArrayUtility.cercaNumeroArrayOrdinato(valoriPerTestSommaElementi, 100));
//				
//				char[] ret =( ArrayUtility.caratteriOrdinatistringa("ciao"));
//				for (int i=0;i<ret.length;i++) {
//					System.out.println(ret[i]);
//				}
//				
//				System.out.println(Arrays.toString(ret));
//				
				
				System.out.println(ArrayUtility.cercaNumero(valoriPerTestSommaElementi,20));
				
				//ArrayUtility.stampaInversa("nome");
				
				ArrayUtility.stampaNumeri(10);
				String[] array = {"ciao","bbbb","njhuuhuu","bvnv","ggyyg","vvvv","lll"};
				
				
				String[] ret =ArrayUtility.riempiArrayStringheUguali(array, 4);
				System.out.println(Arrays.toString(ret));
				
				
				int[] ret2 =ArrayUtility.riempiArrayConMultipliDi(valoriPerTestSommaElementi, 2);
				System.out.println(Arrays.toString(ret2));
				
				
				int[] array2 = {2002,44,2002};
				
				System.out.println(ArrayUtility.arrayPalindromo(array2));
			
				
				
	}

}
