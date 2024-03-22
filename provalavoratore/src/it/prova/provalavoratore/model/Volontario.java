package it.prova.provalavoratore.model;

public class Volontario extends Lavoratore {

	private String nomeAssociazione;
	
	
	
	
	public Volontario() {
		
	}
	
	
	public Volontario(String nome, String cognome, String nomeAssociazione) {
		super(nome,cognome);
		this.nomeAssociazione = nomeAssociazione;
	}
	
	
	public String getNomeAssociazione() {
		return this.nomeAssociazione;
	}
	
	public void setNomeAssociazione(String setNomeAssociazione) {
		this.nomeAssociazione = setNomeAssociazione;
	}
	
	
	public String percepisco() {
		return  "Io " + super.nome + " " + super.cognome + " lavoro presso l'associazione: " + this.nomeAssociazione ;
	}

}
