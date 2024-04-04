package it.prova.gestioneraccoglitore.test;

import it.prova.gestioneraccoglitore.model.Foglio;
import it.prova.gestioneraccoglitore.model.Raccoglitore;

public abstract class TestAccoglitore {

	public static void main(String[] args) {
		
		
		Foglio paper1 = new Foglio("G1","PAPER");
		Foglio paper2 = new Foglio("G1","CARTONE");
		Foglio paper3 = new Foglio("G1","igienica");
		
		Foglio[] arrayFogli = {paper1,paper2,paper3};
		
		Foglio paper4 = new Foglio("G1","carta");
		
		Raccoglitore raccoglitore1 = new Raccoglitore("giallo",5,arrayFogli);
		
		//raccoglitore1.addToFogli(paper4);
		raccoglitore1.removeFromFogli(1);

	}

}
