package it.provahasa.model;

public class Spettatore {
	private String nome;
	private String cognome;
	private String numeroCartaCredito;
	private Biglietto biglietto;
	
	
	
	public Spettatore() {
		
	}
	
	public Spettatore(String nome, String cognome, String numeroCartaCredito, Biglietto biglietto) {
		this.nome = nome;
		this.cognome = cognome;
		this.numeroCartaCredito = numeroCartaCredito;
		this.biglietto = biglietto;
	}
	
	
	
	public String getNome() {
		return this.nome;
	}
	public void setnome(String modificaNome) {
		this.nome = modificaNome;
	}
	

	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String modificacognome) {
		this.cognome = modificacognome;
	}
	

	public String getNumeroCartaCredito() {
		return this.numeroCartaCredito;
	}
	public void setNumeroCartaCredito(String modificaNumeroCartaCredito) {
		this.numeroCartaCredito = modificaNumeroCartaCredito;
	}
	

	public Biglietto getBiglietto() {
		return this.biglietto;
	}
	public void setBiglietto(Biglietto modificaBiglietto) {
		this.biglietto = modificaBiglietto;
	}
	
	
	public double incassoDeiPagantiDellaMiaFila(Spettatore[] elenco) {
		double incassoTotale = 0;
		for (int i=0; i<elenco.length;i++) {
			if(elenco[i].getBiglietto().getLetterafila() == this.biglietto.getLetterafila()) {
				incassoTotale = incassoTotale + elenco[i].getBiglietto().getPrezzo();
			}
		}
		return incassoTotale;
	}
	
	
	public int numeroSpettatoriDelMioStessoSpettacolo(Spettatore[] elenco) {
		int numeroSpettatori = 0;
		for (int i=0;i<elenco.length;i++){
			if (elenco[i].getBiglietto().getNomeSpettacolo().equals(this.biglietto.getNomeSpettacolo())) {
				numeroSpettatori ++;
			}
			
		}
		return numeroSpettatori;
	}
	
	
	
	public boolean numeroSpettatoriDelMioStessoSpettacoloSuperaAspettativa(Spettatore[] elenco , int aspettativa) {
		int numeroAspettatori = 0;
		for (int i=0;i<elenco.length;i++) {
			if (elenco[i].getBiglietto().getNomeSpettacolo().equals(this.biglietto.getNomeSpettacolo())) {
				numeroAspettatori ++;
			}
		}
		if (numeroAspettatori > aspettativa) {
			return true;
		}
		return false;
	}

}
