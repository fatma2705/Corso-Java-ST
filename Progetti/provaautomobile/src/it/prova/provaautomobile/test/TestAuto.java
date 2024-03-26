package it.prova.provaautomobile.test;

import it.prova.provaautomobile.model.Auto;
import it.prova.provaautomobile.model.Motore;

public class TestAuto {
	public static void main(String[] args) {
	
	
	Auto auto1 = new Auto("fiat","panda",3000, new Motore("ss","ff",5,90));
	Auto auto2 = new Auto("fiat","panda",3000, new Motore("s4s","ff",150,90));
	Auto auto3 = new Auto("fiat","panda",3000, new Motore("ss","ff",5,90));
	Auto auto4 = new Auto("fiat","panda",3000, new Motore("ss","ff",5,90));
	
	
	Auto[] arrayAuto = {auto1,auto2,auto3,auto4};
	
	Auto auto5 = new Auto("fiat","panda",3000, new Motore("ss","ff",5,90));
	
	System.out.println(auto5.numeroMacchineConLoStessoMotore(arrayAuto));
	System.out.println(auto5.calcolaCilindrataTotale(arrayAuto));
	
	auto5.stampaAutoConStessoMotore(arrayAuto);
	
	System.out.println(auto5.contieneMotore("s", arrayAuto));
	
	auto5.stampaAutoConPistoniMassimi(arrayAuto);
	}

}
