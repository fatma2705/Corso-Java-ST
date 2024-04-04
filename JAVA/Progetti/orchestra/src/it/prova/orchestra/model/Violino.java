package it.prova.orchestra.model;

public class Violino extends Strumento {
	
	private int corde;
	private int lunghezzaCassaArmonica;
	
	
	public Violino() {
		
	}
	
	public Violino(int estensione, Famiglia famiglia,boolean accordabile,boolean accordato, int corde, int lunghezzaCassaArmonica) {
		super(estensione,famiglia,accordabile,accordato);
		this.corde = corde;
		this.lunghezzaCassaArmonica = lunghezzaCassaArmonica;
	}

	public int getCorde() {
		return corde;
	}

	public void setCorde(int setCorde) {
		this.corde = setCorde;
	}

	public int getLunghezzaCassaArmonica() {
		return lunghezzaCassaArmonica;
	}

	public void setLunghezzaCassaArmonica(int setLunghezzaCassaArmonica) {
		this.lunghezzaCassaArmonica = setLunghezzaCassaArmonica;
	}

	
	public void accorda() {
		if (this.getAccordabile()== false) {
			System.out.println("Strumento violino non accordabile");
			return;
		}
		if (this.getAccordato() == false && this.getAccordabile()==true) {
			this.setAccordato(true);
			System.out.println("Violino accordato");
		}
		System.out.println("Violino già accordato");
		}
	

	
	public void produciSuono() {
		System.out.println("suono violino");
		}

	
	public String ottieniDescrizione() {
		
		return "\n Descrizione Violino: \n " +  "estensione: " + this.getEstensione() + "\n famiglia: " + this.getFamiglia() + "\n accordabile ? " + this.getAccordabile() + "\n accordato ? "+
		this.getAccordato() + "\n corde: " + this.corde + "\n lunghezza cassa armonica: " + this.lunghezzaCassaArmonica;
	}

}
