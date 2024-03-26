package it.prova.provaliste.test;

import java.util.Arrays;
import java.util.List;

import it.prova.provaliste.model.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		List<Persona> persone = Arrays.asList(new Persona ("fatma","arafa",20), new Persona ("marco","gianni",50));
		
		Persona persona1 = new Persona("maro","gianni",50);
		System.out.println(persona1.presenteInElenco(persone));
		
		System.out.println(persona1);

}
	
}
