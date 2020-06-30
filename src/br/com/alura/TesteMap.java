package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {

		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		Set<String> chaves = nomesParaIdade.keySet(); // Acessando somente as chaves
		for (String nome : chaves) {
			System.out.println(nome);
		}

		Collection<Integer> valores = nomesParaIdade.values(); // Acessando somente os valores
		for (Integer idade : valores) {
			System.out.println(idade);
		}

		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet(); // Acessando as associações
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		nomesParaIdade.entrySet().forEach(row -> {
			System.out.println(row.getValue());
		});
	}
}
