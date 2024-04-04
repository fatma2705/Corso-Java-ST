package it.prova.provaautomobile.model;

public class Auto {
	private String marca;
	private String modello;
	private int kilometraggio;
	private Motore motore;
	
	
	
	public Auto() {
		
	}
	
	public Auto(String marca, String modello, int kilometraggio, Motore motore) {
		this.marca = marca;
		this.modello = modello;
		this.kilometraggio = kilometraggio;
		this.motore = motore;
	}
	
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String setMarca) {
		this.marca = setMarca;
	}
	
	
	public String getModello() {
		return this.modello;
	}
	public void setModello(String setModello) {
		this.modello = setModello;
	}
	
	
	public int getKilometraggio() {
		return this.kilometraggio;
	}
	public void setKilometraggio(int setKilometraggio) {
		this.kilometraggio = setKilometraggio;
	}
	
	
	
	public Motore getMotore() {
		return this.motore;
	}
	public void setMotore(Motore setMotore) {
		this.motore = setMotore;
	}
	
	
	
	public int numeroMacchineConLoStessoMotore(Auto [] garage) {
		int conta = 0;
		for(int i= 0;i<garage.length;i++) {
			if(garage[i].getMotore().getModelloMotore() == this.motore.getModelloMotore() && garage[i].getMotore().getMarcaMotore() == this.motore.getMarcaMotore()) {
				conta ++;
			}
		}
		return conta;
		
		
	}
	
	
	
	
	public int calcolaCilindrataTotale(Auto[] garage) {
		int somma = 0;
		for(int i=0;i<garage.length;i++) {
			somma = somma + garage[i].getMotore().getCilindrata();
		}
		return somma;
	}
	
	
	
	
	public void stampaAutoConStessoMotore(Auto[] garage) {
		for (int i=0;i<garage.length;i++) {
			if(garage[i].getMotore().getModelloMotore() == this.motore.getModelloMotore() && garage[i].getMotore().getMarcaMotore() == this.motore.getMarcaMotore()) {
				System.out.println("marca : " + garage[i].getMarca()+ " modello : " + garage[i].getModello() +
						" kilometraggio : " + garage[i].getKilometraggio() + "\n motore : \n modello motore : " +
						garage[i].getMotore().getModelloMotore() + " marca motore : " + garage[i].getMotore().getMarcaMotore() + 
						" pistoni motore : " + garage[i].getMotore().getPistoniMotore()  + " cilindrata : " + garage[i].getMotore().getCilindrata());                                       
			}
		}
	}
	
	
	
	public boolean contieneMotore(String modelloMotore,Auto[] garage) {
		for(int i=0;i<garage.length;i++) {
			if (garage[i].getMotore().getModelloMotore() == modelloMotore) {
				return true;
			}
		}
		return false;
		
	}
		public void stampaAutoConPistoniMassimi(Auto[] garage) {
			Auto AutoConPistoniMassimi = null;
			for(int i =0;i<garage.length;i++) {
				if(garage[i].getMotore().getPistoniMotore() > garage[0].getMotore().getPistoniMotore()) {
					AutoConPistoniMassimi = garage[i];
				}
			}
			System.out.println("marca : " + AutoConPistoniMassimi.getMarca()+ " modello : " + AutoConPistoniMassimi.getModello() +
					" kilometraggio : " + AutoConPistoniMassimi.getKilometraggio() + "\n motore : \n modello motore : " +
					AutoConPistoniMassimi.getMotore().getModelloMotore() + " marca motore : " +AutoConPistoniMassimi.getMotore().getMarcaMotore() + 
					" pistoni motore : " + AutoConPistoniMassimi.getMotore().getPistoniMotore()  + " cilindrata : " +AutoConPistoniMassimi.getMotore().getCilindrata());  
			
		}

}


