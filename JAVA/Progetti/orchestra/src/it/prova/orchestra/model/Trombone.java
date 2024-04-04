package it.prova.orchestra.model;

public class Trombone extends Strumento {
	private int peso;

	public Trombone() {
	}

	public Trombone(int estensione, Famiglia famiglia, boolean accordabile, boolean accordato,int peso) {
		super(estensione, famiglia, accordabile, accordato);
		this.peso = peso;
		
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int setPeso) {
		this.peso = setPeso;
	}

	
	public void accorda() {
		if (this.getAccordabile()== false) {
			System.out.println("Strumento trombone non accordabile");
			return;
		}
		if (this.getAccordato() == false  && this.getAccordabile()==true) {
			this.setAccordato(true);
			System.out.println("trombone accordato");
		}
		System.out.println("trombone già accordato");
		}
	
	public void produciSuono() {
		System.out.println("suono tromboni");
		
	}

	
	public String ottieniDescrizione() {
		
		return "\n Descrizione Trombone: \n " +  "estensione: " + this.getEstensione() + "\n famiglia: " + this.getFamiglia() + "\n accordabile ? " + this.getAccordabile() + "\n accordato ? "+
				this.getAccordato() + "\n peso: " + this.peso;
			}

}
