package it.prova.nazione.test;

import it.prova.nazione.model.Nazione;

public class TestNazione {

	public static void main(String[] args) {
		Nazione paese1 = new Nazione("Fndia",200000,15555);
		Nazione paese2 = new Nazione("Ftalia",525151,145245);
		Nazione paese3 = new Nazione("Farocco",882,145245);
		
		
		Nazione[] arrayNazioni = {paese1,paese2,paese3};
		Nazione paese4 = new Nazione("Francia",858888555,528888845);
		
		
		System.out.println(paese4.esisteAlmenoUnaPiuEstesa(arrayNazioni));
		System.out.println(paese4.quanteSonoPiuPopolose(arrayNazioni));
		System.out.println(paese4.haPiuAbitantiDitutte(arrayNazioni));
		System.out.println(paese4.hannoLaStessaIniziale(arrayNazioni));
		System.out.println(paese4.ePiuEstesaDellaMedia(arrayNazioni));

	}
	

}
