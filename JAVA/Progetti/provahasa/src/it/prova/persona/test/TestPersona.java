package it.prova.persona.test;

import it.prova.persona.model.Indirizzo;
import it.prova.persona.model.Persona;

public class TestPersona {

	 public static void main(String[] args) {
		 
		 Persona persona1 = new Persona("mario","rossi",20, new Indirizzo("roma","paolo buzzi",76));
		 Persona persona2 = new Persona("mario","rossi",20, new Indirizzo("roma","paolo buzzi",76));
		 Persona persona3 = new Persona("mario","rossi",20, new Indirizzo("roma","paolo buzzi",76));
		 Persona persona4 = new Persona("mario","rossi",20, new Indirizzo("roma","paolo buzzi",76));
		 Persona persona5 = new Persona("mario","rossi",20, new Indirizzo("roma","paolo buzzi",76));
		 
		 
		 
		 Persona[] arrayPersone = {persona1,persona2,persona3,persona4,persona5};
		 Persona persona6 = new Persona("mario","rossi",10, new Indirizzo("roma","paolo buzzi",40));
		 
		 
		 System.out.println(persona1.abitaA("roma"));
		 
		 System.out.println("L'array contiene almeno un concittadino ? " + persona6.haAlmenoUnConcittadino(arrayPersone));
		 
		 System.out.println("Sono tutti concittadini e più anziani di me ? " + persona6.sonoTuttiConCittadiniPiuAnzianiDiMe(arrayPersone));
		 
		 
		 
	 }
}
