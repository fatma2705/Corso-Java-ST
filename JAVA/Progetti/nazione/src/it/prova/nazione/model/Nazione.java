package it.prova.nazione.model;

public class Nazione {
	private String denominazione;
	private int superficie;
	private int abitanti;
	
	
	
	public Nazione() {
		
	}
	
	public Nazione(String denominazione, int superfiie , int abitanti) {
		this.denominazione = denominazione;
		this.superficie = superfiie;
		this.abitanti = abitanti;
	}
	
	public String getDenominazione() {
		return this.denominazione;
	}
	
	public void setDenominazione(String modificaDenominazione) {
		this.denominazione = modificaDenominazione;
	}
	
	public int  getSuperficie() {
		return this.superficie;
	}
	
	public void setSuperficie(int modificaSuperficie) {
		this.superficie = modificaSuperficie;
	}
	
	public int  getAbitanti() {
		return this.abitanti;
	}
	
	public void setAbitanti(int modificaAbitanti) {
		this.abitanti = modificaAbitanti;
	}
	
	
	public boolean esisteAlmenoUnaPiuEstesa(Nazione[] catalogo) {
		for (int i=0;i<catalogo.length;i++) {
			if(catalogo[i].getSuperficie() > this.superficie) {
				return true;
			}
		}
		return false;
	}
	
	public int quanteSonoPiuPopolose(Nazione[] catalogo) {
		int conta =0;
		for(int i=0;i<catalogo.length;i++) {
			if(catalogo[i].getAbitanti() > this.abitanti) {
				conta ++;
			}
		}
		return conta;
	}
	
	public boolean haPiuAbitantiDitutte(Nazione[] catalogo) {
		for (int i=0;i<catalogo.length;i++) {
			if(this.abitanti > catalogo[i].getAbitanti()) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean hannoLaStessaIniziale(Nazione[] catalogo) {
		for(int i=0;i <catalogo.length;i++) {
			if(this.denominazione.charAt(0) != catalogo[i].getDenominazione().charAt(0)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean ePiuEstesaDellaMedia(Nazione[] catalogo) {
		int somma =0;
		for(int i=0;i<catalogo.length;i++) {
			somma = somma + catalogo[i].getSuperficie();
		}
		int media = somma / catalogo.length;
		if (this.superficie > media) {
			return true;
		}
		return false;
	}


}

