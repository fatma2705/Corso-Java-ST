package it.prova.provastringhe.model;

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
	

}
