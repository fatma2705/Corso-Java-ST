package it.prova.helloveicolo.model;

import java.util.List;

public class Nave extends Veicolo{
	
	private String nomeNave;
	
	
	public Nave() {
		
	}
	
	public Nave(String nomeNave) {
		this.nomeNave = nomeNave;
	}
	
	public String getNomeNave() {
		return this.nomeNave;
	}
	public void setNomeNave(String setNomeNave) {
		this.nomeNave = setNomeNave;
	}

	
	public String accellera() {
		
		int nuovaVelocita = this.getVelocita() + 100;
		return "La nave di nome " + this.nomeNave + " sta accellerando e la sua velocità è cambiata da  " + this.getVelocita() + " km/h a " + nuovaVelocita + " km/h";
	}
		
	
	public String frena() {
		int nuovaVelocita = this.getVelocita() -100;
		return  "La nave  di nome " + this.nomeNave + " sta frenando e la sua velocità è cambiata da " + this.getVelocita() +" km/h a " + nuovaVelocita + " km/h";

	}

	
	public boolean eUgualeA(Veicolo altroVeicolo) {
		if (!(altroVeicolo instanceof Nave)) {
			return false;
		}
		Nave tempNave = (Nave) altroVeicolo;
		return this.nomeNave.equals(tempNave.getNomeNave());
	}
	
	
	@Override
	public String toString() {
	    return this.nomeNave;
	}

	
	public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli) {
		if (!(veicoloDaAggiungere instanceof Nave)) {
			return "ERRORE:  IL veicolo da aggiungere non è di tipo Nave quindi non può essere aggiunta alla lista ";
		}
		for (Veicolo i : listaVeicoli) {
			if (!(i instanceof Nave)) {
				return "ERRORE:  Gli oggetti presenti nella lista non sono di tipo Nave quindi la nave non può essere aggiunta alla lista";
			}
			}
		listaVeicoli.add(veicoloDaAggiungere);
		return "veicolo aggiunto nuova lista: " + listaVeicoli.toString() ;
		
	}
	

}
