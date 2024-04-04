package it.prova.orchestra.model;

public  class Triangolo extends Strumento{
	private String origine;

	public Triangolo() {
		super();
		
	}

	public Triangolo(int estensione, Famiglia famiglia, boolean accordabile, boolean accordato, String origine) {
		super(estensione, famiglia, accordabile, accordato);
		this.origine = origine;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String setOrigine) {
		this.origine = setOrigine;
	}

	
	public void accorda() {
		if (this.getAccordabile()== false) {
			System.out.println("Strumento triangolo non accordabile");
			return;
		}
		if (this.getAccordato() == false  && this.getAccordabile()==true) {
			this.setAccordato(true);
			System.out.println("triangolo accordato");
		}
		System.out.println("triangolo già accordato");
		}
	
	public void produciSuono() {
		System.out.println("suono triangolo");
		
	}

	
	public String ottieniDescrizione() {
		return "\n Descrizione Triangolo: \n " +  "estensione: " + this.getEstensione() + "\n famiglia: " + this.getFamiglia() + "\n accordabile ? " + this.getAccordabile() + "\n accordato ? "+
				this.getAccordato() + "\n origine: " + this.origine;
			}
	}
	


