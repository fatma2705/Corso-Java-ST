package it.prova.orchestra.test;


import java.util.ArrayList;
import java.util.List;

import it.prova.orchestra.model.Famiglia;
import it.prova.orchestra.model.Flauto;
import it.prova.orchestra.model.Orchestra;
import it.prova.orchestra.model.Strumento;
import it.prova.orchestra.model.Triangolo;
import it.prova.orchestra.model.Trombone;
import it.prova.orchestra.model.Violino;


public class TestOrchestra {

	public static void main(String[] args) {
		
		Strumento strumento1 = new Violino(2,Famiglia.archi,true,true,4,16);
		
		Strumento strumento2 = new Flauto(2,Famiglia.legni,false,false,"dolce");
		
		Strumento strumento3 = new Trombone(2,Famiglia.ottoni,true,true,1);
		
		Strumento strumento4 = new Triangolo(2,Famiglia.percussioni,false,false,"europa");
		
		
		System.out.println("\n Violino accordato? ");
		strumento1.accorda();
		System.out.println("\n suonare il violino ");
		strumento1.produciSuono();
		System.out.println(strumento1.ottieniDescrizione());
		
		System.out.println("\n flauto accordato? ");
		strumento2.accorda();
		System.out.println("\n suonare il flauto ");
		strumento2.produciSuono();
		System.out.println(strumento2.ottieniDescrizione());
		
		
		System.out.println("\n Trombone accordato? ");
		strumento3.accorda();
		System.out.println("\n suonare il trombone ");
		strumento3.produciSuono();
		System.out.println(strumento3.ottieniDescrizione());
		
		
		System.out.println("\n Triangolo accordato? ");
		strumento4.accorda();
		System.out.println("\n suonare il triangolo ");
		strumento4.produciSuono();
		System.out.println(strumento4.ottieniDescrizione());
		
		
		List<Strumento> listaStrumenti = new ArrayList<>();
		listaStrumenti.add(strumento4);
		listaStrumenti.add(strumento3);
		listaStrumenti.add(strumento2);
		listaStrumenti.add(strumento1);
		
		
		
		Orchestra orchestra = new Orchestra(listaStrumenti);
		
		System.out.println("\n");
		
		System.out.println("\n accordare tutti i strumenti ");
		orchestra.accordaStrumenti();
		System.out.println("\n suonare tutti i strumenti ");
		orchestra.eseguiConcerto();
		
	}

}
