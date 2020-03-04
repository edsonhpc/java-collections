package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Edson Cavalcanti
 * - Classe ArrayList ou uma de suas mães, reescreveu o método toString, internamente é feito um for concatenando os elementos separados por vírgula;
 * - foreach e/ou enhanced for não existe no Java como comando, e sim um caso especial do for mesmo;
 *
 */
public class TestandoListas {

	
	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Trabalhando com Cursos e Sets";
		String aula3 = "Conhecendo mais de listas";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println("Mostrando array completo: ");
		System.out.println(aulas);
		
		
		System.out.println("\nRemovendo index de posição 0: ");
		aulas.remove(0);
		System.out.println("Após remoção: " + aulas);
		
		System.out.println("\nforEach: ");
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("\nRecuperando o primeiro elemento da lista: ");
		String primeiraAula = aulas.get(0);
		System.out.println("index 0: " + primeiraAula);
		
		// se i <= aulas.size() será lançado IndexOutOfBoundsExcepetion
		System.out.println("\nfor: ");
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + i + " = " + aulas.get(i));
		}
		
		// Esse método forEach ele recebe um objeto do tipo Consumer, o interessante é que não precisamos criá-lo, usamos a sintexe enxuta chamada lambda.
		System.out.println("\nforEach");
		aulas.forEach(aula -> {
			System.out.println("Aula " + aula );
		});
		
		System.out.println("\nAntes de ordenado: ");
		Collections.sort(aulas); // Collections possui um conjunto de métodos estáticos auxiliares as coleções.
		System.out.println(aulas);
		System.out.println("Depois de ordenado: ");
		
	}
}
