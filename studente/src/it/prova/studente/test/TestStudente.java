package it.prova.studente.test;

import java.util.Arrays;

import it.prova.studente.model.Studente;

public class TestStudente {

	public static void main(String[] args) {
		
		Studente maria = new Studente("maria","franco",12,20);
		Studente mario = new Studente("maria","rossi",12,11);
		Studente luca = new Studente("ll","rossi",13,10);
		Studente gianluca = new Studente("maria","rossi",52,20);
		Studente franco = new Studente("ldkd","rossi",11,13);
		Studente matteo = new Studente("maria","rossi",17,12);
		
		Studente[] arrayStudenti = {maria,mario,luca,gianluca,franco,matteo};
		
		
		Studente lucia = new Studente("maria","rossi",70,18);
		
		
		System.out.println("Sono tutti più giovani di me ? "  + lucia.sonoTuttiPiuGiovaniDiMe(arrayStudenti));
		System.out.println("Almeno uno ha la media migliore di me ? " + lucia.almenoUnoHALaMediaMoglioreDellaMia(arrayStudenti));
		System.out.println("Quanti sono i miei omonimi minorenni ? " + lucia.quantiSonoMieiOmonimiMinorenni(arrayStudenti));
		System.out.println("Quanti studenti hanno la media sopra la sufficenza ? " + lucia.quantiHannoLaMediaSopraLaSufficenza(arrayStudenti));
		
		Studente[] ret = Studente.studentiScuolaMediaOmonimi(arrayStudenti, lucia);
		for(int i=0; i<ret.length;i++) {
			System.out.println((ret[i].getNome()));
		}


	}

}
