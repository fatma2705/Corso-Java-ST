package it.prova.persona.model;

public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	private Indirizzo indirizzo;
	
	
	
	public Persona() {
		
	}
	
	
	public Persona(String nome, String cognome, int eta,Indirizzo indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.indirizzo = indirizzo;
	}
	
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String setNome) {
		this.nome = setNome;
	}
	
	
	
	
	public String getCogome() {
		return this.cognome;
	}
	public void setCognome(String setCognome) {
		this.cognome = setCognome;
	}
	
	
	
	public int getEta() {
		return this.eta;
	}
	public void setEta(int setEta) {
		this.eta = setEta;
	}
	
	
	public Indirizzo getIndirizzo() {
		return this.indirizzo;
	}
	public void setIndirizzo(Indirizzo setIndirizzo) {
		this.indirizzo = setIndirizzo;
	}
	
	
	
	
	public boolean abitaA(String citta) {
		if (this.indirizzo.getCitta().equals(citta)) {
			return true;
		}
		return false;
	}
	
	
	
	public boolean haAlmenoUnConcittadino(Persona[] abitanti) {
		for (int i=0;i<abitanti.length;i++) {
			if (abitanti[i].getIndirizzo().getCitta() == this.indirizzo.getCitta()) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean sonoTuttiConCittadiniPiuAnzianiDiMe(Persona[] abitanti) {
		int contaCittadini = 0;
		for (int i=0;i<abitanti.length;i++) {
			if(abitanti[i].getIndirizzo().getCitta() == this.indirizzo.getCitta() && abitanti[i].getEta() > this.eta) {
				contaCittadini ++;
			}
		}
		if (contaCittadini == abitanti.length) {
			return true;
		}
		return false;
		
	}

}
