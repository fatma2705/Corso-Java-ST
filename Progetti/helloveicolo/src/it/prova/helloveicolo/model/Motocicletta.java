package it.prova.helloveicolo.model;

import java.util.List;

public class Motocicletta extends Veicolo{
	
	private String tipoMoto;
	
	
	public Motocicletta() {
		
	}
	
	public Motocicletta(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}
	
	public String getTipoMoto() {
		return this.tipoMoto;
	}
	
	public void setTipoMoto(String setTipoMoto) {
		this.tipoMoto = setTipoMoto;
	}

	
	public String accellera() {
		
		int nuovaVelocita = this.getVelocita() + 20;
		return "La moto di tipo " + this.tipoMoto + " sta accellerando e la sua velocità è cambiata da  " + this.getVelocita() + " km/h a " + nuovaVelocita + " km/h";
		
	}

	
	public String frena() {
		int nuovaVelocita = this.getVelocita() -30;
		return  "La moto di tipo " + this.tipoMoto + " sta frenando e la sua velocità è cambiata da " + this.getVelocita() +" km/h a " + nuovaVelocita + " km/h";
	}
	
	
	public boolean eUgualeA(Veicolo altroVeicolo) {
		if(!(altroVeicolo instanceof Motocicletta)) {
			return false;
		}
		Motocicletta tempVeicoli = (Motocicletta) altroVeicolo;
		return this.tipoMoto.equals(tempVeicoli.getTipoMoto());
	}
	
	
	@Override
	public String toString() {
	    return this.tipoMoto;
	}

	
	public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere, List<Veicolo> listaVeicoli) {
		if (!(veicoloDaAggiungere instanceof Motocicletta)) {
			return "ERRORE:  IL veicolo da aggiungere non è di tipo moto quindi non può essere aggiunto alla lista ";
		}
		for (Veicolo i : listaVeicoli) {
			if (!(i instanceof Motocicletta)) {
				return "ERRORE:  Gli oggetti presenti nella lista non sono di tipo moto quindi  non può essere aggiunta alla lista";
			}
			}
		listaVeicoli.add(veicoloDaAggiungere);
		return "veicolo aggiunto nuova lista: " + listaVeicoli.toString() ;
		
	}
	

}
