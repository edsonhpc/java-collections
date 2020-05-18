package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Edson Cavalcanti
 * - HashSet utiliza a estrutura de dados do tipo tabela de espalhamento, é o que o torna mais rapido que List.
 * - Na pratica entende-se que essa estrutura é muito usada quando temos conjuntos de dados muito grande.
 * - Ele não segue uma ordem dos elementos, tanto que não temos o get ou remove passando o index do element e também não ordena.
 * - Esse tipo de Collection não aceita elementos repetidos.
 * - O conjunto tem uma excelente performance, quando utilizamos métodos que procuram objetos dentro de uma coleção (por exemplo o método contains).
 * - O método contains é da classe mãe das coleções a Collection, ele retorna um boolean dizendo que a coleção existe o objeto passado.
 * - Collection é mãe de Set e List.
 */
public class TesteAlunos {

	public static void main(String[] args) {
		
		// Collection<String> alunos = new HashSet<>(); // Posso utilizar a classe mãe das coleções para ser mais generico, ficando com código mais flexivel
		Set<String> alunos = new HashSet<>();
		alunos.add("Edson Cavalcanti");
		alunos.add("Juliana de Castro");
		alunos.add("Selena Pinheiro");
		alunos.add("Luciana Pereira");
		
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
		boolean existeAluno = alunos.contains("Sebastião");
		System.out.println(existeAluno);
		
		System.out.println(alunos);
		System.out.println("Tamanho: " + alunos.size());
		
		List<String> alunosEmLista = new ArrayList<>(alunos); // Criamos uma lista e passamos em seu construtor uma coleção
		
		Collections.sort(alunosEmLista);
		alunosEmLista.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.print("\n");
		alunos.forEach(System.out::println);
	}
}
