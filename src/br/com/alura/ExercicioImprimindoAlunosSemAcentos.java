package br.com.alura;

import java.util.HashSet;

/**
 * 
 * @author edson.h.cavalcanti
 * - Como não há uma sequencia dos elementos, não existe uma posição definida, imagine que o set é um saco no qual não conhecemos o próximo elemento que sai.
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
		
		System.out.println("Tamanho da Coleção: " + alunos.size());

		alunos.add("Paulo");
		boolean adicionou = alunos.add("Paulo");
		
		System.out.println(adicionou +"\n");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}
}
