package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Edson Cavalcanti
 * - O Collection.sort quando passamos o tipo String consegue realizar a ordena��o, isso porque na classe String, foi definido atr�ves do m�todo compareTo.
 * - Como segundo argumento o Collection.sort recebe um comparador representado pela interface Comparator do java.util.
 * - Toda lista a partir do java 8, possui um m�todo sort que recebe um Comparator.
 * 
 */
public class TesteListaDeAulas {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println("Before");
		System.out.println(aulas);
		
		Collections.sort(aulas); // orderna��o sem crit�rio de compara��o usado o comparador direto da classe aula.
		
		System.out.println("\nAfter");
		System.out.println(aulas);
		
		
		System.out.println("\nUsing Interface Comparing Aula::getTempo");
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // ordene estas aulas como compara��o o retorno do m�todo getTempo de cada Aula
		// Collections.sort(aulas, Comparator.comparing(Aula::getTempo).reversed()); // dessa forma ele ordena do maior para o menor.
	 
		System.out.println(aulas);
		
		System.out.println("\nUsing java 8");
		aulas.sort(Comparator.comparing(Aula::getTempo)); 
	    //aulas.sort(Comparator.comparing(Aula::getTitulo).thenComparing(Aula::getTempo)); // compara��o com mais atributos
		System.out.println(aulas);
		
	}
	

}
