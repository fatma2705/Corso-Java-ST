package it.provapersona.test;

import it.provapersona.model.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona("fatma","arafa",100);
		Persona persona2 = new Persona("marco","arafa",400);
		
		System.out.println(persona1.getNome());
		System.out.println(persona1.getCognome());
		System.out.println(persona1.getEta());
		System.out.println(persona1.getNome() +" " + persona1.getEta());
		
		
		if(persona1.piuAnzianoDi(persona2)) {
			System.out.println(persona1.getNome() +" è più anziana/o di " + persona2.getNome());
		}else {
			System.out.println(persona2.getNome() +" è più anziana/o di " + persona1.getNome());
		}

	}

}
