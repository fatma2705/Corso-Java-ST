package it.provahasa.test;

import it.provahasa.model.Biglietto;
import it.provahasa.model.Spettatore;

public class TestSpettatore {

	public static void main(String[] args) {
		
		
		
		Biglietto biglietto1 = new Biglietto("Cenerentola",'b',9,12.50);
		Biglietto biglietto2 = new Biglietto("Cenerentola",'b',9,12.50);
		Biglietto biglietto3 = new Biglietto("Cenerentola",'c',9,12.50);
		Biglietto biglietto4 = new Biglietto("Cenerentola",'b',9,10.50);
		Biglietto biglietto5 = new Biglietto("Cenerentola",'b',9,12.50);
		Biglietto biglietto6 = new Biglietto("Cenerentola",'b',9,12.50);
		
		Biglietto[] arrayBiglietti = {biglietto1,biglietto2,biglietto3,biglietto4,biglietto5,biglietto6};
		
		Biglietto biglietto7 = new Biglietto("Cenerentola",'f',9,12.50);
		
		
		Spettatore spettatore1 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'b',9,12.50));
		Spettatore spettatore2 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'b',9,12.50));
		Spettatore spettatore3 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'v',9,12.50));
		Spettatore spettatore4 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'b',9,12.50));
		Spettatore spettatore5 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'d',9,10.00));
		Spettatore spettatore6 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'b',9,12.50));
		
		Spettatore[] arraySpettatori = {spettatore1,spettatore2,spettatore3,spettatore4,spettatore5,spettatore6};
		
		
		Spettatore spettatore7 = new Spettatore("mario","rossi","15427854456655",new Biglietto("Cenerentola",'b',9,12.50));
		
		System.out.println("L'incasso dei paganti della mia fila è : " + spettatore7.incassoDeiPagantiDellaMiaFila(arraySpettatori));
		
		System.out.println("Il numero Spettatori dello spettacolo di " + spettatore7.getBiglietto().getNomeSpettacolo() + " è : " +
		spettatore7.numeroSpettatoriDelMioStessoSpettacolo(arraySpettatori));
		
		System.out.println("Il numero degli spettatori dello spettacolo di " + spettatore7.getBiglietto().getNomeSpettacolo()
		+ " supera l'aspettativa ? " + spettatore7.numeroSpettatoriDelMioStessoSpettacoloSuperaAspettativa(arraySpettatori,5));
		
		
		System.out.println("Il prezzo del biglietto più economico è " + Biglietto.trovaIlPiuEconomico(arrayBiglietti).getPrezzo());
		
		System.out.println("il mio biglietto non è ancora stato veduto? " + biglietto7.bigliettoAncorainvenduto(arrayBiglietti));
		

	}

}
