package it.prova.provastringhe.test;

import it.prova.provastringhe.model.ProvaStringhe;

public class TestProvaStringhe {

	public static void main(String[] args) {
		String stringa = "ciao";
		//char[] risultato =ProvaStringhe.trasformoInArrayDiChar(stringa);
		//for(int i=0;i < risultato.length;i++) {
			//System.out.println(risultato[i]);
		//}
	
	
		//ProvaStringhe.stampaCaratteriAlContrario(stringa);
		//String[] stringhe = {"marca","ftm","luca","ciao","ciao"};
		String[] stringhe2 = {"ciao","ciao","ciafo","ciao","ckiao","ciao"};
		
		//System.out.println(ProvaStringhe.contaLunghezzaDispari(stringhe));
		
		//System.out.println(ProvaStringhe.contaLunghezzaUguale(stringhe));
		
		//System.out.println(ProvaStringhe.finisceConLoStessoCarattere(stringhe, 'a'));
		
		//System.out.println(ProvaStringhe.quanteVoltePresente(stringhe, stringa));
		
		//System.out.println(ProvaStringhe.lunghezzeIesime(stringhe, stringhe2));
		
		//System.out.println(ProvaStringhe.parolaPalindroma("anna"));
		
		System.out.println(ProvaStringhe.nomiUgualiNellePrimePosizioni(stringhe2, 3));
	}

}
