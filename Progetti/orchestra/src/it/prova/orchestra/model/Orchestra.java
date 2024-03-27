package it.prova.orchestra.model;

import java.util.List;

public class Orchestra {
	
	private List<Strumento> listaStrumenti;
	
	
	
	public Orchestra() {
		
	}
	
	public Orchestra(List<Strumento> listaStrumenti) {
		this.listaStrumenti = listaStrumenti;
	}
	
	
	public List<Strumento> getListaStrumenti(){
		return this.listaStrumenti;
	}
	
	public void setListaStrumenti(List<Strumento> setListaStrumenti) {
		this.listaStrumenti = setListaStrumenti;
	}
	
	public void eseguiConcerto() {
		for (Strumento strumento : this.listaStrumenti) {
			strumento.produciSuono();
		}
	}
	
	public void accordaStrumenti() {
		for (Strumento strumento : this.listaStrumenti) {
			strumento.accorda();
		}
	}

}
