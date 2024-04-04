package it.prova.provaautomobile.model;

public class Motore {
	
	private String modelloMotore;
	private String marcaMotore;
	private int pistoniMotore;
	private int cilindrata;
	
	
	
	public Motore() {
		
	}
	
	
	public Motore(String modelloMotore, String marcaMotore, int pistoniMotore, int cilindrata) {
		this.modelloMotore = modelloMotore;
		this.marcaMotore = marcaMotore;
		this.pistoniMotore = pistoniMotore;
		this.cilindrata = cilindrata;
	}
	
	
	public String getModelloMotore() {
		return this.modelloMotore;
	}
	public void setModelloMotore(String setModelloMotore) {
		this.marcaMotore = setModelloMotore;
	}
	
	
	public String getMarcaMotore() {
		return this.marcaMotore;
	}
	public void setMarcaMotore(String setMarcaMotore) {
		this.marcaMotore = setMarcaMotore;
	}
	
	
	
	public int getPistoniMotore() {
		return this.pistoniMotore;
	}
	public void setPistoniMotore(int setPistoniMotore) {
		this.pistoniMotore = setPistoniMotore;
	}
	
	
	
	public int getCilindrata() {
		return this.cilindrata;
	}
	public void setCilindrata(int setCilindrata) {
		this.cilindrata = setCilindrata;
	}
	
	
	

	

	
	
	

}
