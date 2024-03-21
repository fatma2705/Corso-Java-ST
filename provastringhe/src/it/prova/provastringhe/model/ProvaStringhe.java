package it.prova.provastringhe.model;

import java.util.Arrays;

public class ProvaStringhe {

	public static char[] trasformoInArrayDiChar(String stringa) {
		char[] arreyDiCaretteri = new char[stringa.length()];
		for (int i = 0; i < stringa.length(); i++) {
			arreyDiCaretteri[i] = stringa.charAt(i);
		}
		return arreyDiCaretteri;

	}

	public static void stampaCaratteriAlContrario(String stringa) {
		for (int i = stringa.length() - 1; i >= 0; i--) {
			System.out.println(stringa.charAt(i));

		}
	}

	public static int contaLunghezzaDispari(String[] stringhe) {
		int conta = 0;
		for (int i = 0; i < stringhe.length; i++) {
			if (stringhe[i].length() % 2 != 0) {
				conta++;
			}
		}
		return conta;
	}

	public static boolean contaLunghezzaUguale(String[] stringhe) {
		for (int i = 1; i < stringhe.length; i++) {
			if (stringhe[i].length() != stringhe[0].length()) {
				return false;
			}
		}
		return true;
	}

	public static boolean finisceConLoStessoCarattere(String[] stringhe, char carattere) {
		for (int i = 0; i < stringhe.length; i++) {
			if (stringhe[i].charAt(stringhe[i].length() - 1) != carattere) {
				return false;
			}
		}
		return true;
	}

	public static int quanteVoltePresente(String elenco[], String nomeDaCercare) {
		int conta = 0;
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i].equals(nomeDaCercare)) {
				conta++;
			}
		}
		return conta;

	}

	public static boolean lunghezzeIesime(String[] elenco1, String[] elenco2) {
		if (elenco1.length != elenco2.length) {
			return false;
		}
		for (int i = 0; i < elenco1.length; i++) {
			if (elenco1[i].length() != elenco2[i].length()) {
				return false;

			}
		}

		return true;
	}
	public static boolean parolaPalindroma(String parola) {
		for (int i=0;i<parola.length()/2;i++) {
			if(parola.charAt(i) != parola.charAt(parola.length()-i -1)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean nomiUgualiNellePrimePosizioni(String [] stringhe , int posizione) {
		for(int i=1;i<posizione;i++) {
			if(stringhe[i]!=stringhe[0]) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	
	
	
	public static int contaVocali(String testo) {
		int conta = 0;
		for (int i=0;i<testo.length();i++) {
			if (testo.charAt(i) == 'a' || testo.charAt(i) == 'e' || testo.charAt(i) == 'i' || testo.charAt(i) == 'o' || testo.charAt(i) == 'u' ||
					testo.charAt(i) == 'A' || testo.charAt(i) == 'E' || testo.charAt(i) == 'I' || testo.charAt(i) == 'O' || testo.charAt(i) == 'U') {
				conta ++;
			}
		}
		return conta;
	}
	
	
	
	
	
	public static boolean[] sonoPalindromi(String[] array) {
		boolean[] res = new boolean[array.length];
		for (int i = 0; i<array.length;i++) {
			String parola = array[i].toLowerCase();
			int lunghezza = parola.length();
			boolean palindromo = true;
			for  (int a = 0; a<lunghezza/2;a++) {
				if(parola.charAt(a) != parola.charAt(lunghezza -1 -a)) {
					palindromo = false;
				}
				
			}
			res[i] = palindromo;
		}
		return res;
		}
	
	
	
	
	public static String trovaParolaPiuCorta(String[] array) {
		int minCaratteri = array[0].length();
		String parolaPiuCorta = null;
		for(int i=0;i<array.length;i++) {
		if (array[i].length()< minCaratteri) {
				minCaratteri = array[i].length();
			}
		parolaPiuCorta = array[i];
		}
		return parolaPiuCorta;
	}
	
	
	
	public static void invertiOrdineStringhe(String[] array) {
		String[] nuovoArray = new String[array.length];
		int a = 0;
		for (int i=array.length-1;i>=0;i--) {
			nuovoArray[a] = array[i];
			a++;
			
		}
		System.out.println(Arrays.toString(nuovoArray));
	}
	
	
	
	
	public static boolean haElementoComune(String[] array1,String[] array2) {
		for(int i=0;i<array1.length;i++) {
			for(int a=0;a<array2.length;a++) {
				if (array1[i] == array2[a]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static int contaStringheConNumeroVocali(String[] array,int numVocali) {
		int stringhe = 0;
		for(int i=0;i<array.length;i++) {
			int conta = 0;
			String parola = array[i].toLowerCase();
			for(int a=0;a<parola.length();a++) {
			if ( parola.charAt(a) == 'a' || parola.charAt(a) == 'e' || parola.charAt(a) == 'i' || parola.charAt(a) == 'o' || parola.charAt(a) == 'u' ){
				conta ++;
			}
			}
			if (conta == numVocali) {
				stringhe ++;
			}
		}
		return stringhe;
	}
	
	
	
	public static void stampaSottoStringheConLunghezza(String[] array,int lunghezza) {
	

}
}
