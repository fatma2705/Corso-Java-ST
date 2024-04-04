package it.prova.gestioneraccoglitore.model;

public class Raccoglitore {
	private String colore;
	private int spessore;
	private Foglio[] array;

	
	
	public Raccoglitore() {
		
	}
	
	public Raccoglitore(String colore, int spessore, Foglio[] array) {
		
		this.colore = colore;
		this.spessore = spessore;
		this.array = array;
				
	}
	
	public String getColore() {
		return this.colore;
	}
	public void setColore(String setColore) {
		this.colore = setColore;
	}
	
	
	
	public int getSpessore() {
		return this.spessore;
	}
	public void setSpessore(int setSpessore) {
		this.spessore = setSpessore;
	}
	
	
	public Foglio[] getArray() {
		return this.array;
	}
	public void setArray(Foglio[] setArray) {
		this.array = setArray;
	}
	
	public void addToFogli(Foglio foglioDaAggiungere) {
		Foglio[] arrayFogli = new Foglio[this.array.length +1];
		for(int i=0;i<this.array.length;i++) {
			arrayFogli[i] = this.array[i];
			}
		arrayFogli[arrayFogli.length -1] = foglioDaAggiungere;
		this.array = arrayFogli;
		
		
		for (int i=0; i<this.array.length;i++) {
			System.out.println(this.array[i].getTipologia());
		}
	}
	
	public void removeFromFogli(int indexToRemove ) {
		int a = 0;
		Foglio[] arrayTemp = new Foglio[this.array.length -1];
		for (int i=0;i<this.array.length  ;i++) {
			if(i != indexToRemove) {
					arrayTemp[a] = this.array[i];
					a++;
				
			}
		}
		
		this.array =  arrayTemp;
		for (int i=0; i<this.array.length;i++) {
			System.out.println(this.array[i].getTipologia());
		}
		
	}
	
	
	
}
