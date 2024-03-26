package it.prova.televisore.model;

public class Televisore {
	private String modello;
	private String marca;
	private int prezzo;
	private int pollici;
	
	
	public Televisore(){
		
	}
	
	public Televisore(String modello, String marca , int prezzo, int pollici) {
		this.modello = modello;
		this.marca = marca;
		this.prezzo = prezzo;
		this.pollici = pollici;
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getPrezzo() {
		return this.prezzo;
	}
	
	public int getPollici() {
		return this.pollici;
	}
	
	public void setModello(String modelloModificato) {
		this.modello = modelloModificato;
	}
	
	public void setMarca(String marcaModificata) {
		this.marca = marcaModificata;
	}
	
	public void setPrezzo(int prezzoModificato) {
		this.prezzo = prezzoModificato;
	}
	
	public void setPollici(int PolliciModificato) {
		this.pollici = PolliciModificato;
	}
	
	
	public boolean costaMenoDelBudgetDisponibile(int budget) {
		return this.prezzo<budget;
	}
	
	public boolean stessaMarcaDi(Televisore altraTv) {
		return this.marca==altraTv.getMarca();
		
	}
	
	public boolean piuGrandeDi(Televisore altraTv) {
		return this.pollici>altraTv.getPollici();
		
	}
	public boolean miglioreQualitaPrezzoDi(Televisore altraTv) {
		return this.pollici>altraTv.getPollici() && this.prezzo<altraTv.getPrezzo();
		
	}
	
	// metodo che confronta un'oggetto creato da me con gli oggetti presenti dentro l'array
	// di televisori   con ( this.prezzo ) richiamo il prezzo dell'oggetto che 
	// ho creato io con ( catalogo[i].getPrezzo() ) richiamo il prezzo 
	// dell'iesimo oggetto presente dentro l'array 
	
	public boolean esisteAlmenoUnoPiuEconomicoDi(Televisore [] catalogo) {
		for(int i =0; i<catalogo.length; i++) {
			if(catalogo[i].getPrezzo() < this.prezzo) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public int quantiSonoPiuGrandi(Televisore[] catalogo) {
		int conta =0;
		for (int i=0;i<catalogo.length;i++) {
			if(catalogo[i].getPollici() > this.pollici) {
				conta ++;
			}
		}
		return conta;
	}
	
	
	public int quantiSonoPiuCariAvendoStessaMarca(Televisore [] catalogo) {
		int conta = 0;
		for(int i = 0;i<catalogo.length;i++) {
			if(catalogo[i].getMarca().equals(this.marca) && catalogo[i].getPrezzo() > this.prezzo ) {
				conta ++;
			}
		}
		return conta;
	}

	
	public boolean piuCaroDellaMedia(Televisore[] catalogo) {
		int somma = 0;
		for(int i=0;i<catalogo.length;i++) {
			somma = somma + catalogo[i].getPrezzo();
		}
		int media = somma / catalogo.length;
		if (this.prezzo > media) {
			return true;
		}
		return false;
	}
	
	
	public String stampaTelevisore() {
		return ("Carattersistiche del televisore \n marca : " + this.marca + "\n modello : "+
				this.modello+ "\n prezzo : " + this.prezzo+ "\n pollici : " +this.pollici);
	}
	
	
	// quando il metodo è statico viene richiamato con il nome della classe e non con 
	// l'istanza  della classe 
	// es: Televisore.trovaIlPiuCostoso             -- quando è statico 
	// es: tv1.getPrezzo                          -- quando non è statico
	
	
	public static Televisore trovaIlPiuCostoso(Televisore[] catalogo) {
		Televisore tvPiuCostoso = null;
		for (int i=0;i<catalogo.length;i++) {
			if(catalogo[i].getPrezzo() > catalogo[0].getPrezzo()) {
				tvPiuCostoso =  catalogo[i];
			}
		}
		return tvPiuCostoso;
	}



}
