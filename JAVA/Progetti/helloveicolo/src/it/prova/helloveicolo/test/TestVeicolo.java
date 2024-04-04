package it.prova.helloveicolo.test;

import java.util.ArrayList;
import java.util.List;

import it.prova.helloveicolo.model.Automobile;
import it.prova.helloveicolo.model.Motocicletta;
import it.prova.helloveicolo.model.Nave;
import it.prova.helloveicolo.model.Veicolo;

public abstract class TestVeicolo {

	public static void main(String[] args) {
		
		Veicolo veicolo1 = new Automobile("fiat");
		
		Veicolo veicolo2 = new Automobile("Audi");
		
		Veicolo veicolo3 = new Nave ("susus");
		
		Veicolo veicolo4 = new Nave("nusa");
		
		Veicolo veicolo5 = new Motocicletta("moto");
		
		Veicolo veicolo6 = new Motocicletta("moto");
		
		List<Veicolo> listaM = new ArrayList<>();
		listaM.add(veicolo1);
		listaM.add(veicolo2);
		
		Veicolo veicolo8 = new Automobile("Ford");
		
		
		
		List<Veicolo> listaN = new ArrayList<>();
		listaN.add(veicolo3);
		listaN.add(veicolo4);
		
		Veicolo veicolo9 = new Nave("lamia");
		
		
		
		
		List<Veicolo> listaMoto = new ArrayList<>();
		listaMoto.add(veicolo5);
		listaMoto.add(veicolo6);
		
		Veicolo veicolo10 = new Motocicletta("fe");
		
		System.out.println("\n"+veicolo1.accellera());
		System.out.println("\n"+veicolo1.frena());
		System.out.println("\n"+"Il primo veicolo è uguale al secondo? " +  veicolo1.eUgualeA(veicolo2));
		
		System.out.println("\n"+veicolo8.aggiungiVeicoloADeposito(veicolo8, listaM));
		
		
		System.out.println("\n"+veicolo3.accellera());
		System.out.println("\n"+veicolo3.frena());
		System.out.println("\n"+"Il primo veicolo è uguale al secondo? " + veicolo3.eUgualeA(veicolo4));
		
		System.out.println("\n"+veicolo9.aggiungiVeicoloADeposito(veicolo9, listaN));
		
		
		System.out.println("\n"+veicolo5.accellera());
		System.out.println("\n"+veicolo5.frena());
		System.out.println("\n Il primo veicolo è uguale al secondo? " + veicolo5.eUgualeA(veicolo6));
		
		System.out.println("\n"+veicolo10.aggiungiVeicoloADeposito(veicolo10, listaMoto));
		
		
		
		

	}

}
