package it.prova.negoziopc.model;

import java.util.List;

public class Fattura {
	
	private List<Negozio> negozi;
	private String numeroFattura;
	private String dataFattura;
	private String ditta;
	
	public Fattura(List<Negozio> negozi, String numeroFattura, String dataFattura, String ditta) {
		this.negozi = negozi;
		this.numeroFattura = numeroFattura;
		this.dataFattura = dataFattura;
		this.ditta = ditta;
	}

	public String getNumeroFattura() {
		return numeroFattura;
	}

	public void setNumeroFattura(String numeroFattura) {
		this.numeroFattura = numeroFattura;
	}

	public String getDataFattura() {
		return dataFattura;
	}

	public void setDataFattura(String dataFattura) {
		this.dataFattura = dataFattura;
	}

	public String getDitta() {
		return ditta;
	}

	public void setDitta(String ditta) {
		this.ditta = ditta;
	}

	public Fattura() {
		
	}

	public Fattura(List<Negozio> fatture) {
		this.negozi = fatture;
	}
	
	
	public List<Negozio> getNegozi() {
		return negozi;
	}

	public void setNegozi(List<Negozio> setNegozi) {
		this.negozi = setNegozi;
	}
	
	
	public void getIndirizzo(String numeroSeriale) {
		for (Negozio negozio : this.negozi) {
			if (negozio.getNegozio(numeroSeriale)) {
				System.out.println("Il pc con il numero seriale: " + numeroSeriale + " è associato al negozio di " + negozio.getIndirizzo());
				return;
			}
		}
		System.out.println("Il pc non è associato a nessun negozio.");
	}
	
	public void stampaFatture() {
		for (Negozio item : this.negozi) {
			System.out.println("Fattura  \n  numeroFattura=" + this.numeroFattura + ", dataFattura= " + this.dataFattura
					+ ", ditta=" + this.ditta + "]" );
			item.stampaNegozio();
		}
		
	}



}
