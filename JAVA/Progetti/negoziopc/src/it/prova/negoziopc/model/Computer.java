package it.prova.negoziopc.model;

public class Computer {
	private String numeroSerialePc;
	private String marca;
	private String modello;
	private String schedaMadre;
	private String processore;
	private String numeroSerialeProcessore;
	private String numeroSerialeSchedaMadre;
	private int prezzo;
	
	
	public Computer() {
		
	}
	

	public Computer(String numeroSerialePc, String marca, String modello, String schedaMadre, String processore,
			String numeroSerialeProcessore, String numeroSerialeSchedaMadre, int prezzo) {
		this.numeroSerialePc = numeroSerialePc;
		this.marca = marca;
		this.modello = modello;
		this.schedaMadre = schedaMadre;
		this.processore = processore;
		this.numeroSerialeProcessore = numeroSerialeProcessore;
		this.numeroSerialeSchedaMadre = numeroSerialeSchedaMadre;
		this.prezzo = prezzo;
	}








	public int getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(int setPrezzo) {
		this.prezzo = setPrezzo;
	}


	public String getNumeroSerialePc() {
		return numeroSerialePc;
	}


	public void setNumeroSerialePc(String setNumeroSerialePc) {
		this.numeroSerialePc = setNumeroSerialePc;
	}


	public String getNumeroSerialeProcessore() {
		return numeroSerialeProcessore;
	}


	public void setNumeroSerialeProcessore(String setNumeroSerialeProcessore) {
		this.numeroSerialeProcessore = setNumeroSerialeProcessore;
	}


	public String getNumeroSerialeSchedaMadre() {
		return numeroSerialeSchedaMadre;
	}


	public void setNumeroSerialeSchedaMadre(String setNumeroSerialeSchedaMadre) {
		this.numeroSerialeSchedaMadre = setNumeroSerialeSchedaMadre;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String setMarca) {
		this.marca = setMarca;
	}




	public String getModello() {
		return modello;
	}




	public void setModello(String setModello) {
		this.modello = setModello;
	}




	public String getSchedaMadre() {
		return schedaMadre;
	}




	public void setSchedaMadre(String setSchedaMadre) {
		this.schedaMadre = setSchedaMadre;
	}




	public String getProcessore() {
		return processore;
	}




	public void setProcessore(String setProcessore) {
		this.processore = setProcessore;
	}
	
	
	@Override
	public String toString() {
		return "\n Scheda pc : \n { marca: " + this.marca + "\n modello: " + this.modello + "\n numero seriale pc: " + this.numeroSerialePc
				+ "\n scheda madre: " + this.schedaMadre + "\n numero seriale scheda madre: " + this.numeroSerialeSchedaMadre + 
				"\n processore: " + this.processore + "\n numero seriale processore: " + this.numeroSerialeProcessore
				+ "\n prezzo: " + this.prezzo + "£ }";
		
	}
	
	
	
	
	
	
	
}
