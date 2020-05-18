package br.com.alura;

import java.util.HashSet;

/**
 * 
 * @author edson.h.cavalcanti
 * - Como n�o h� uma sequencia dos elementos, n�o existe uma posi��o definida, imagine que o set � um saco no qual n�o conhecemos o pr�ximo elemento que sai.
 */

public class ExercicioImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
		
		
		HashSet<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("Tamanho da Cole��o: " + alunos.size());

		alunos.add("Paulo");
		boolean adicionou = alunos.add("Paulo");
		
		System.out.println(adicionou +"\n");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}
}
