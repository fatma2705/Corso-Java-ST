package it.prova.negoziopc.test;

import java.util.ArrayList;
import java.util.List;

import it.prova.negoziopc.model.Computer;
import it.prova.negoziopc.model.Fattura;
import it.prova.negoziopc.model.Negozio;

public class TestNegozio {

	public static void main(String[] args) {
		
		Computer pc = new Computer("Hp","17m","intel","ia7","1412","7777",400);
		
		System.out.println(pc.toString());
		Computer pc2 = new Computer("15881714","Hp","17m","intel","ia7","1412","7777",400);
		
		Computer pc3 = new Computer("15156714","Hp","17m","intel","ia7","1412","7777",400);
		
		Computer pc4 = new Computer("15145714","Hp","17m","intel","ia7","1412","7777",400);
		
		Computer pc5 = new Computer("15481714","Hp","17m","intel","ia7","1412","7777",400);
		
		
		
	
		
		Computer pc6 = new Computer("714","Hp","17m","intel","ia7","1412","7777",400);
		
		Computer pc7 = new Computer("187","Hp","17m","intel","ia7","1412","7777",400);
		
		Computer pc8 = new Computer("020","Hp","17m","intel","ia7","1412","7777",400);
		
		Computer pc9 = new Computer("544","Hp","17m","intel","ia7","1412","7777",400);
		
		
		pc.stampaPc();
		
		List<Computer> inventario = new ArrayList<>();
		List<Computer> inventario2 = new ArrayList<>();
		
		
		Negozio negozio = new Negozio("LAURENTINA", inventario );
		Negozio negozio2 = new Negozio("Cecchiognola", inventario2 );
		
		negozio.AggiungerePcAInventario(pc5);
		negozio.AggiungerePcAInventario(pc3);
		negozio.AggiungerePcAInventario(pc2);
		negozio.AggiungerePcAInventario(pc);
		negozio.AggiungerePcAInventario(pc4);
		
		
		
		
		negozio2.AggiungerePcAInventario(pc6);
		negozio2.AggiungerePcAInventario(pc7);
		negozio2.AggiungerePcAInventario(pc8);
		negozio2.AggiungerePcAInventario(pc9);
		
		
		
		
		
		negozio.RimuoviPcDaInventario(pc5);
		negozio.EsisteIlPc(pc4);
		
		
		negozio.stampaInventario();
		
		List<Negozio> negozi = new ArrayList<>();
		negozi.add(negozio2);
		negozi.add(negozio);
		
		Fattura fattura = new Fattura(negozi,"14524785","27/05/2021","Unieuro");
		
		fattura.getIndirizzo("151714");
		
		fattura.stampaFatture();
		
	
		
	}

}
