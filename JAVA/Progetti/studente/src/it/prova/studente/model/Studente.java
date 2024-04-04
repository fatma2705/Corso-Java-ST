package it.prova.studente.model;

public class Studente {
	private String nome;
	private String cognome;
	private int eta;
	private int mediaScolastica;
	
	
	public Studente() {
		
	}
	
	public Studente(String nome,String cognome,int eta , int mediaScolastica) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.mediaScolastica = mediaScolastica;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nomeModificato) {
		this.nome = nomeModificato;
	}
	
	
	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String cognomeModificato) {
		this.cognome = cognomeModificato;
	}
	
	
	public int getEta() {
		return this.eta;
	}
	public void setEta(int etaModificata) {
		this.eta = etaModificata;
	}
	
	
	public int getMediaScolastica() {
		return this.mediaScolastica;
	}
	public void setMediaScolastica(int mediaScolasticaModificata) {
		this.mediaScolastica = mediaScolasticaModificata;
	}
	
	
	public boolean sonoTuttiPiuGiovaniDiMe(Studente[] corso) {
		for(int i=0;i<corso.length;i++) {
			if(corso[i].getEta() > this.eta) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean almenoUnoHALaMediaMoglioreDellaMia(Studente[] corso) {
		for (int i=0; i<corso.length;i++) {
			if (corso[i].getMediaScolastica() > this.mediaScolastica) {
				return true;
			}
		}
		return false;
	}
	
	public int quantiSonoMieiOmonimiMinorenni(Studente[] corso) {
		int conta =0;
		for (int i=0;i<corso.length;i++) {
			if (corso[i].getNome().equals(this.nome) && corso[i].getEta() < 18) {
				conta ++;
			}
		}
		return conta;
	}
	
	public int quantiHannoLaMediaSopraLaSufficenza(Studente[] corso) {
		int conta =0;
		for (int i=0;i<corso.length;i++) {
			if(corso[i].getMediaScolastica() > 18) {
				conta ++;
			}
		}
		return conta;
	}
	
	
	public static Studente[] studentiScuolaMediaOmonimi(Studente[] corso, Studente altroStudente) {
		int dimensioneArray = 0;
		for (int i=0;i<corso.length;i++) {
			if (corso[i].getNome().equals(altroStudente.getNome()) && corso[i].getEta() <= 13 && corso[i].getEta() >= 11){
			dimensioneArray ++;
			}
		}
		Studente[] nuovoArray = new Studente[dimensioneArray];
		int conta =0;
		for (int i=0;i<corso.length;i++) {
			if (corso[i].getNome().equals(altroStudente.getNome()) && corso[i].getEta() <= 13 && corso[i].getEta() >= 11){
				nuovoArray[i] = corso[i];
				conta ++;
			}
		}
		return nuovoArray;
	}




}
