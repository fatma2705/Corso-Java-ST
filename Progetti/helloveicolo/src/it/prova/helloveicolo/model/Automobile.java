package it.prova.helloveicolo.model;

import java.util.List;

public class Automobile extends Veicolo{
	private String modelloMacchina;
	
	public Automobile() {
		
	}
	
	
	public Automobile(String modelloMacchina) {
		this.modelloMacchina = modelloMacchina;
		
	}
	
	public String getmodelloMacchina() {
		return this.modelloMacchina;
	}
	
	public void setModelloMacchina(String setModelloMacchina) {
		this.modelloMacchina = setModelloMacchina;
	}


	
	public String accellera() {
			
			int nuovaVelocita = this.getVelocita() + 30;
			return "L' automobile di modello " + this.modelloMacchina + " sta accellerando e la sua velocità è cambiata da  " + this.getVelocita() + " km/h a " + nuovaVelocita + " km/h";
			
	}


	
	public String frena() {
		int nuovaVelocita = this.getVelocita() -30;
		return  "L' automobile di modello " + this.modelloMacchina + " sta frenando e la sua velocità è cambiata da " + this.getVelocita() + " km/h a " + nuovaVelocita + " km/h";
	}


	
	public boolean eUgualeA(Veicolo altroVeicolo) {
		if (!(altroVeicolo instanceof Automobile))
			return false;
		Automobile tempVeicolo = (Automobile) altroVeicolo;
		
		return this.modelloMacchina.equals(tempVeicolo.getmodelloMacchina());
	}
	@Override
	public String toString() {
	    return this.modelloMacchina;
	}

	
	public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli) {
		if (!(veicoloDaAggiungere instanceof Automobile)) {
			return "ERRORE:  IL veicolo da aggiungere non è di tipo Automobile quindi non può essere aggiunto alla lista ";
		}
		for (Veicolo i : listaVeicoli) {
			if (!(i instanceof Automobile)) {
				return "ERRORE:  Gli oggetti presenti nella lista non sono di tipo Automobile quindi L'automobile non può essere aggiunta alla lista";
			}
			}
		listaVeicoli.add(veicoloDaAggiungere);
		return "veicolo aggiunto nuova lista: " + listaVeicoli.toString() ;
		
	}
	
	

}
