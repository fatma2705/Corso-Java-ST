package it.prova.negoziopc.model;

import java.util.List;

public class Negozio {
	
	private String indirizzo;
	private List<Computer> inventario;
	private List<Fattura> fatture;
	
	
	public Negozio() {
		
	}
	
	public Negozio(String indirizzo,List<Computer> inventario) {
		this.indirizzo = indirizzo;
		this.inventario = inventario;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String setIndirizzo) {
		this.indirizzo = setIndirizzo;
	}

	public List<Computer> getInventario() {
		return inventario;
	}

	public void setInventario(List<Computer> setInventario) {
		this.inventario = setInventario;
	}
	
	
	public void AggiungerePcAInventario(Computer pcDaAggiungere) {
		if (this.inventario.size() == 0) {
			this.inventario.add(pcDaAggiungere);
			System.out.println("PC con numero seriale : " + pcDaAggiungere.getNumeroSerialePc() + " aggiunto all'inventario con successo");
			return;
		}
			for (Computer pc : this.inventario) {
				if (pcDaAggiungere.getNumeroSerialePc() != pc.getNumeroSerialePc()) {
					this.inventario.add(pcDaAggiungere);
					System.out.println("PC con numero seriale : " + pcDaAggiungere.getNumeroSerialePc() + " aggiunto all'inventario con successo");
					return;
				}

			}
			System.out.println("Errore: Già esiste un pc con questo numero seriale. ");
			
			}
	
	public void RimuoviPcDaInventario(Computer pcdaRimuovere) {
		for (Computer pc : this.inventario) {
			if (pcdaRimuovere.getNumeroSerialePc() == pc.getNumeroSerialePc()) {
				this.inventario.remove(pcdaRimuovere);
				System.out.println("Pc con numero seriale: " + pcdaRimuovere.getNumeroSerialePc() + " rimosso dall'inventario ");
				return;
			}
		}
		System.out.println("Pc non trovato dentro l'inventario");
		}
		
	
	public void EsisteIlPc(Computer pcDaControllare) {
			if (this.inventario.contains(pcDaControllare)) {
				System.out.println("Pc trovato nell'inventario");
				return;
			}
			
		
		System.out.println("Pc non trovato dentro l'inventario");
	}
	
	public void stampaNegozio() {
		for(Computer pc : this.inventario) {
			System.out.println( "Negozio [ indirizzo: " + this.indirizzo + pc.toString());
		}
	}
	
	public boolean getNegozio(String numeroSeriale) {
		for (Computer pc : this.inventario ) {
			if (pc.getNumeroSerialePc() == numeroSeriale) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	

}
