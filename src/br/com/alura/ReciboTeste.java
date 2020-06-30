package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class ReciboTeste {
	
	// A implementa��o TreeSet consegue ordenar os elementos na hora da inser��o, o crit�rio de ordena��o vai depender do que for definido com o Comparator.
	// O principal recurso do TreeSet � a classifica��o, o LinkedHashSet mantem a ordem de inser��o e o HashSet � apenas uma cole��o de uso geral para armazenar objetos. 
	// O TreeSet � uma implementa��o de SortedSet que permite manter os elementos na ordem classificada definida pela interface Comparable ou Comparator, ou seja, 
	// quando voc� insere um novo elemento em um TreeSet, ele verifica em qual posi��o ser� inserido esse elemento para manter a ordena��o.

	public static void main(String[] args) {
		
		Recibo rec1 = new Recibo("Edson",150.0);
		Recibo rec2 = new Recibo("Juliana",250.0);
		Recibo rec3 = new Recibo("Selena",350.0);
		
		Set<Recibo> recibos = new TreeSet<>(); // Parar usarmos essa implementa��o de Set � necess�rio a implementar o Comparable 
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
		
		
		recibos.forEach(recibo -> {
			System.out.println(recibo.getNome());
		});
		
	}
}
