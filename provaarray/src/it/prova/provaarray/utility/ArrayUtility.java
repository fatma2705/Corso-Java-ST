package it.prova.provaarray.utility;

public class ArrayUtility {
	
	public static int sommaElementi(int [] valori) {
		int somma = 0;
		for (int i=0;i<valori.length;i++) {
			somma += valori[i];
		}
		return somma;
	}
	
	
	// secondo metodo 
	public static boolean esisteAlmenoUnNegativoPari(int [] valori) {
		for (int i=0;i<valori.length;i++) {
			if (valori[i]%2==0  && valori[i]<0) {
				return true;
				
			}
			
		}
		return false;
	}
	
	// terzo metodo 
	public static int contaQuantiSonoNegativiPari(int [] valori) {
		int numeriPariNegativi = 0;
		for (int i=0;i<valori.length;i++) {
			if (valori[i]%2==0 && valori[i]<0) {
				numeriPariNegativi +=1;
			}
		}
		return numeriPariNegativi;
	}
	
	// quarto metodo
	public static int sommaElementiIndiceDispariAlContrario(int[] valori) {
		int somma =0;
		for (int i =valori.length-1;i>=0;i--) {
			if (i%2!=0) {
				somma += valori[i];
			}
		}
		return somma;
	}
	
	// sapere se nell'array esiste un numero che è uguale a 5 interando al contrario 
	public static boolean esistenzaNumero(int [] array, int numeroDaCercare) {
		for (int i=array.length -1;i>=0;i--) {
			if (array[i]==numeroDaCercare) {
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean dimmiSeTantiDispariQuantiPari(int[]array) {
		int pari =0;
		int dispari =0;
		for (int i=0;i<array.length;i++) {
			if (array[i]%2==0) {
				pari ++;
				}
			else {
				dispari ++;
			}
		}
		if (pari == dispari) {
			return true;
			}
		
		return false;
	}
	
	public static int quantiSonoDivisiPer(int[] valori , int divisore) {
		int numeriDivisi = 0;
		for(int i =0;i<valori.length;i++) {
			if (valori[i]%divisore==0) {
				numeriDivisi ++;
			}
		}
		return numeriDivisi;
				
	}
	
	public static boolean verificaSeOrdineDecrescente(int [] valori) {
		for(int i =1;i<valori.length;i++){
			if (valori[i]>valori[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean tuttiNumeriPari(int[] valori) {
		for(int i =0; i<valori.length;i++) {
			if (valori[i]%2!=0) {
				return false;
			}
		}
		return true;
	}
	public static int[] riempiConNumeroDaSottrarre(int[] valori , int numeroDaSottrarre) {
		int [] nuovoArray = new int [valori.length];
		for (int i=0;i<valori.length;i++) {
			
			nuovoArray[i] = valori[i] - numeroDaSottrarre ;
			if (nuovoArray[i]<0) {
				nuovoArray[i]=0;
			}
			
		}
		
		return nuovoArray;
	}
	
	public static boolean presenteSoloUnaVolta(int[] array,int numeroDacercare) {
		int conta = 0;
		for (int i =0;i<array.length;i++) {
			if (array[i]==numeroDacercare) {
				conta ++;
				}
			}
		if (conta >1 || conta==0) {
			return false;
		}
		return true;
	}
	public static int[] creaArreyInvertito(int[] valori) {
		int indice = valori.length-1;
		int [] nuovoArrey = new int[valori.length];
		for (int i=0;i<valori.length;i++) {
			nuovoArrey[i] = valori[indice];
			indice--;
		}
		return nuovoArrey;
				
	}
}
