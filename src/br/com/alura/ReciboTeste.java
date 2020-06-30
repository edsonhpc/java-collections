package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class ReciboTeste {
	
	// A implementação TreeSet consegue ordenar os elementos na hora da inserção, o critério de ordenação vai depender do que for definido com o Comparator.
	// O principal recurso do TreeSet é a classificação, o LinkedHashSet mantem a ordem de inserção e o HashSet é apenas uma coleção de uso geral para armazenar objetos. 
	// O TreeSet é uma implementação de SortedSet que permite manter os elementos na ordem classificada definida pela interface Comparable ou Comparator, ou seja, 
	// quando você insere um novo elemento em um TreeSet, ele verifica em qual posição será inserido esse elemento para manter a ordenação.

	public static void main(String[] args) {
		
		Recibo rec1 = new Recibo("Edson",150.0);
		Recibo rec2 = new Recibo("Juliana",250.0);
		Recibo rec3 = new Recibo("Selena",350.0);
		
		Set<Recibo> recibos = new TreeSet<>(); // Parar usarmos essa implementação de Set é necessário a implementar o Comparable 
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
		
		
		recibos.forEach(recibo -> {
			System.out.println(recibo.getNome());
		});
		
	}
}
