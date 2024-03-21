package it.prova.provaarray.utility;

import java.util.Iterator;

public class ArrayUtility {

	public static int sommaElementi(int[] valori) {
		int somma = 0;
		for (int i = 0; i < valori.length; i++) {
			somma += valori[i];
		}
		return somma;
	}

	// secondo metodo
	public static boolean esisteAlmenoUnNegativoPari(int[] valori) {
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % 2 == 0 && valori[i] < 0) {
				return true;

			}

		}
		return false;
	}

	// terzo metodo
	public static int contaQuantiSonoNegativiPari(int[] valori) {
		int numeriPariNegativi = 0;
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % 2 == 0 && valori[i] < 0) {
				numeriPariNegativi += 1;
			}
		}
		return numeriPariNegativi;
	}

	// quarto metodo
	public static int sommaElementiIndiceDispariAlContrario(int[] valori) {
		int somma = 0;
		for (int i = valori.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
				somma += valori[i];
			}
		}
		return somma;
	}

	// sapere se nell'array esiste un numero che è uguale a 5 interando al contrario
	public static boolean esistenzaNumero(int[] array, int numeroDaCercare) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == numeroDaCercare) {
				return true;
			}
		}
		return false;
	}

	public static boolean dimmiSeTantiDispariQuantiPari(int[] array) {
		int pari = 0;
		int dispari = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				pari++;
			} else {
				dispari++;
			}
		}
		if (pari == dispari) {
			return true;
		}

		return false;
	}

	public static int quantiSonoDivisiPer(int[] valori, int divisore) {
		int numeriDivisi = 0;
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % divisore == 0) {
				numeriDivisi++;
			}
		}
		return numeriDivisi;

	}

	public static boolean verificaSeOrdineDecrescente(int[] valori) {
		for (int i = 1; i < valori.length; i++) {
			if (valori[i] > valori[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean tuttiNumeriPari(int[] valori) {
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static int[] riempiConNumeroDaSottrarre(int[] valori, int numeroDaSottrarre) {
		int[] nuovoArray = new int[valori.length];
		for (int i = 0; i < valori.length; i++) {

			nuovoArray[i] = valori[i] - numeroDaSottrarre;
			if (nuovoArray[i] < 0) {
				nuovoArray[i] = 0;
			}

		}

		return nuovoArray;
	}

	public static boolean presenteSoloUnaVolta(int[] array, int numeroDacercare) {
		int conta = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numeroDacercare) {
				conta++;
			}
		}
		if (conta > 1 || conta == 0) {
			return false;
		}
		return true;
	}

	public static int[] creaArreyInvertito(int[] valori) {
		int indice = valori.length - 1;
		int[] nuovoArrey = new int[valori.length];
		for (int i = 0; i < valori.length; i++) {
			nuovoArrey[i] = valori[indice];
			indice--;
		}
		return nuovoArrey;

	}

	public static int[] cancellaElementoArray(int[] arrayPieno, int daEliminare) {

		int contaRipetizioni = 0;
		for (int j = 0; j < arrayPieno.length; j++) {
			if (arrayPieno[j] == daEliminare) {
				contaRipetizioni++;
			}
		}
		int[] arrayMezzoPieno = new int[arrayPieno.length - contaRipetizioni];
		int index = 0;
		for (int i = 0; i < arrayPieno.length; i++) {
			if (arrayPieno[i] != daEliminare) {
				arrayMezzoPieno[index] = arrayPieno[i];
				index++;
			}
		}
		return arrayMezzoPieno;
	}

	public static int[] ordineCrescente(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int a = i; a < array.length; a++) {
				if (array[i] > array[a]) {
					int appoggio = array[i];
					array[i] = array[a];
					array[a] = appoggio;
				}
			}
		}
		return array;

	}

	public static int[] aggiungiInCoda(int[] valori, int valoreAggiungereCoda) {
		int[] nuovoArrey = new int[valori.length + 1];
		for (int i = 0; i < valori.length; i++) {
			nuovoArrey[i] = valori[i];
			if (i == valori.length) {
				nuovoArrey[valori.length] = valoreAggiungereCoda;
			}
		}
		return nuovoArrey;
	}

	public static boolean cercaNumeroArrayOrdinato(int[] array, int numero) {
		boolean verifica = false;
		for (int i = 0; i < array.length; i++) {
			if (numero < array[0] || numero < array[array.length - 1]) {
				return verifica;
			}
			if (array[i] == numero) {
				verifica = true;
			}
		}
		return verifica;
	}

	public static char[] caratteriOrdinatistringa(String frase) {
		char[] arreyCaratteri = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			arreyCaratteri[i] = frase.charAt(i);
		}
		for (int i = 0; i < arreyCaratteri.length; i++) {
			for (int a = i; a < arreyCaratteri.length; a++) {
				if (arreyCaratteri[i] > arreyCaratteri[a]) {
					char appoggio = arreyCaratteri[i];
					arreyCaratteri[i] = arreyCaratteri[a];
					arreyCaratteri[a] = appoggio;
				}
			}
		}
		return arreyCaratteri;
	}

	// funzione ricorsiva dato un'array di interi e un intero va a cercare l'intero
	// dentro l'array
	// divindendo l'array in piccoli array
	public static boolean cercaNumero(int[] array, int numero) {
		if (numero < array[0] || numero > array[array.length - 1]) {
			return false;
		}
		if (array[array.length / 2] == numero) {
			return true;
		} else {
			if (array[array.length / 2] < numero) {
				int[] nuovoArray = new int[array.length / 2];
				for (int i = 0; i < nuovoArray.length; i++) {
					nuovoArray[i] = array[array.length / 2 + i];

				}
				return ArrayUtility.cercaNumero(nuovoArray, numero);
			} else {
				int[] nuovoArray = new int[array.length / 2];
				for (int i = 0; i < nuovoArray.length; i++) {
					nuovoArray[i] = array[i];

				}
				return ArrayUtility.cercaNumero(nuovoArray, numero);
			}
		}

	}

	public static void stampaInversa(String nome) {
		if (nome.length() > 0) {
			System.out.println(nome.charAt(nome.length() - 1));
			stampaInversa(nome.substring(0, nome.length() - 1));
		}

	}

	public static void stampaNumeri(int n) {
		if (n > 0) {
			ArrayUtility.stampaNumeri(n - 1);
			System.out.println(n);

		}

	}

	public static String[] riempiArrayStringheUguali(String[] elenco, int numCaratteri) {
		int conta = 0;
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i].length() == numCaratteri) {
				conta++;
			}
		}
		String[] nArray = new String[conta];
		int ultimoIndiceUtilizzato = 0;
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i].length() == numCaratteri) {
				nArray[ultimoIndiceUtilizzato]= elenco[i];
				ultimoIndiceUtilizzato ++;
			}
		}
		return nArray;
	}
	
	public static int[] riempiArrayConMultipliDi(int[] valori,int multiplo) {
		int conta = 0;
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % multiplo == 0) {
				conta++;
			}
		}
		int[] nArray = new int[conta];
		int ultimoIndiceUtilizzato = 0;
		for (int i = 0; i < valori.length; i++) {
			if (valori[i] % multiplo == 0) {
				nArray[ultimoIndiceUtilizzato]= valori[i];
				ultimoIndiceUtilizzato ++;
			}
		}
		return nArray;
	
		
	}
	public static boolean arrayPalindromo(int[] array) {
		for(int i=0;i<array.length;i++) {
			if(array[i] != array[array.length -i -1]){
				return false;
			}
		}
		return true;
	}
	
	
	public static int[] inserisciENUmero(int[] array, int elemento,int posizione) {
		int indexTemp = 0;
		int[] arrayNuovo = new int[array.length +1];
		for (int i=0;i<array.length +1 ;i++) {
			if(i != posizione) {
				arrayNuovo[i] = array[indexTemp];
				indexTemp ++;
				}
			}
		arrayNuovo[posizione] = elemento;
		return arrayNuovo;
	}
	
	
	
	
	public static int sommaIntervallo(int[] array, int inizio, int fine) {
		int somma = 0;
		for (int i=inizio;i<fine+1;i++) {
			somma += array[i];
		}
		return somma;
	}
	
	
	public static int[] trovaMaxMin(int[] array) {
		int[] nuovoArray = new int[2];
		int min  =array[0];
		int max = 0;
		for (int i=0;i<array.length;i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
			nuovoArray[0] = min;
			nuovoArray[1] =  max;
		}
		return nuovoArray;
	}
	
	
	
	public static int contaCoppieUguali(int[] array) {
		int coppieUguali =0;
		for(int i=0;i<array.length-1;i++) {
			for(int a=i+1;a<array.length;a++) {
				if (array[a] == array[i]) {
					coppieUguali ++;
				}
			}
		}
		return coppieUguali;
		
	}
	
	
}
