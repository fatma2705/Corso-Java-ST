package it.prova.orchestra.model;

public class Flauto extends Strumento {
	private String tipo;

	public Flauto() {
	}

	public Flauto(int estensione, Famiglia famiglia, boolean accordabile, boolean accordato,String tipo) {
		super(estensione, famiglia, accordabile, accordato);
		this.tipo = tipo;
	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String setTipo) {
		this.tipo = setTipo;
	}

	
	public void accorda() {
		if (this.getAccordabile()== false) {
			System.out.println("Strumento flauto non accordabile");
			return;
		}
		if (this.getAccordato() == false && this.getAccordabile()==true) {
			this.setAccordato(true);
			System.out.println("flauto accordato");
		}
		System.out.println("flauto già accordato");
		}
	
	
	public void produciSuono() {
		System.out.println("suono flauto...");
		
	}

	
	public String ottieniDescrizione() {
		
		return "\n Descrizione Flauto: \n " +  "estensione: " + this.getEstensione() + "\n famiglia: " + this.getFamiglia() + "\n accordabile ? " + this.getAccordabile() + "\n accordato ? "+
				this.getAccordato() + "\n tipo: " + this.tipo;
			}
	

}
