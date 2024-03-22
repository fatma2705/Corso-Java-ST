package it.prova.provalavoratore.model;

public class Lavoratore {
	protected String nome;
	protected String cognome;
	
	
	public Lavoratore(){
		
	}
	
	public Lavoratore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String setNome) {
		this.nome = setNome;
	}
	
	
	
	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String setCognome) {
		this.cognome = setCognome;
	}
	
	
	
	
	
	
	public String percepisco() {
		return "N.D";
	}
	
	public int contaLavoratoriConCognome(Lavoratore[] array, String cognome) {
		int conta = 0;
		for(int i= 0;i<array.length;i++) {
			if(array[i].getCognome() == cognome) {
				conta ++;
			}
		}
		return conta;
	}
	
	
	public int contaLavoratoriVolontari(Lavoratore[] array) {
		int conta = 0;
		for (int i=0;i<array.length;i++) {
			if (array[i] instanceof Volontario) {
				conta ++;
			}
		}
		return conta;
	}
	
	

}
