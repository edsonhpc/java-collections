package br.com.alura;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExercicioMap {

	public static void main(String[] args) {

		Map<Integer, String> pessoas = new LinkedHashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

		long inicio = System.currentTimeMillis();
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		long fim = System.currentTimeMillis();
		System.out.println(fim-inicio + "\n");

		inicio = System.currentTimeMillis();
		for (Integer key : pessoas.keySet()) {
			System.out.println(pessoas.get(key));
		}
		fim = System.currentTimeMillis();
		System.out.println(fim-inicio);
	}

}
