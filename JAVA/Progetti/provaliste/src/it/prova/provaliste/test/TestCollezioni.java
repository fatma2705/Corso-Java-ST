package it.prova.provaliste.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollezioni {

	public static void main(String[] args) {
		
		
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(90);
		lista.add(78);
		lista.add(78);
		lista.add(8);
		
		System.out.println(lista.size());
		System.out.println(lista.indexOf(78));
		System.out.println(lista.toString());
		System.out.println(lista.hashCode());
		
		System.out.println(lista.isEmpty());
		
		for(int i : lista) {
			System.out.println(i*2);
		}

	}

}
