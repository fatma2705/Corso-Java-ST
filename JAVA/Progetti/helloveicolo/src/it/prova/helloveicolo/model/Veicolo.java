package it.prova.helloveicolo.model;

import java.util.List;

public abstract class Veicolo {
	
	private int velocita;
	
	
	public int getVelocita() {
		return this.velocita;
	}
	
	public void setVelocita(int setVelocita) {
		this.velocita = setVelocita;
	}
	
	
	abstract public String accellera();
	abstract public String frena();
	abstract public boolean eUgualeA(Veicolo altroVeicolo);
	abstract public String aggiungiVeicoloADeposito(Veicolo veicoloDaAggiungere,List<Veicolo> listaVeicoli);
	

}
