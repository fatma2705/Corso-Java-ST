package it.prova.televisore.model;

public class Televisore {
	private String modello;
	private String marca;
	private int prezzo;
	private int pollici;
	
	
	public Televisore(){
		
	}
	
	public Televisore(String modello, String marca , int prezzo, int pollici) {
		this.modello = modello;
		this.marca = marca;
		this.prezzo = prezzo;
		this.pollici = pollici;
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getPrezzo() {
		return this.prezzo;
	}
	
	public int getPollici() {
		return this.pollici;
	}
	
	public void setModello(String modelloModificato) {
		this.modello = modelloModificato;
	}
	
	public void setMarca(String marcaModificata) {
		this.marca = marcaModificata;
	}
	
	public void setPrezzo(int prezzoModificato) {
		this.prezzo = prezzoModificato;
	}
	
	public void setPollici(int PolliciModificato) {
		this.pollici = PolliciModificato;
	}
	
	
	public boolean costaMenoDelBudgetDisponibile(int budget) {
		return this.prezzo<budget;
	}
	
	public boolean stessaMarcaDi(Televisore altraTv) {
		return this.marca==altraTv.getMarca();
		
	}
	
	public boolean piuGrandeDi(Televisore altraTv) {
		return this.pollici>altraTv.getPollici();
		
	}
	public boolean miglioreQualitaPrezzoDi(Televisore altraTv) {
		return this.pollici>altraTv.getPollici() && this.prezzo<altraTv.getPrezzo();
		
	}




}
