package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Edson Cavalcanti
 * - HashSet utiliza a estrutura de dados do tipo tabela de espalhamento, � o que o torna mais rapido que List.
 * - Na pratica entende-se que essa estrutura � muito usada quando temos conjuntos de dados muito grande.
 * - Ele n�o segue uma ordem dos elementos, tanto que n�o temos o get ou remove passando o index do element e tamb�m n�o ordena.
 * - Esse tipo de Collection n�o aceita elementos repetidos.
 * - O conjunto tem uma excelente performance, quando utilizamos m�todos que procuram objetos dentro de uma cole��o (por exemplo o m�todo contains).
 * - O m�todo contains � da classe m�e das cole��es a Collection, ele retorna um boolean dizendo que a cole��o existe o objeto passado.
 * - Collection � m�e de Set e List.
 */
public class TesteAlunos {

	public static void main(String[] args) {
		
		// Collection<String> alunos = new HashSet<>(); // Posso utilizar a classe m�e das cole��es para ser mais generico, ficando com c�digo mais flexivel
		Set<String> alunos = new HashSet<>();
		alunos.add("Edson Cavalcanti");
		alunos.add("Juliana de Castro");
		alunos.add("Selena Pinheiro");
		alunos.add("Luciana Pereira");
		
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
		boolean existeAluno = alunos.contains("Sebasti�o");
		System.out.println(existeAluno);
		
		System.out.println(alunos);
		System.out.println("Tamanho: " + alunos.size());
		
		List<String> alunosEmLista = new ArrayList<>(alunos); // Criamos uma lista e passamos em seu construtor uma cole��o
		
		Collections.sort(alunosEmLista);
		alunosEmLista.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.print("\n");
		alunos.forEach(System.out::println);
	}
}
