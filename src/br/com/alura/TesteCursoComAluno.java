package br.com.alura;

import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author edson.h.cavalcanti
 * TDD - Test Driven Development (Desenvolvimento Guiado por Testes)
 *
 */
public class TesteCursoComAluno {

	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando as coleções do java", "Paulo Silveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 3456);
		Aluno a2 = new Aluno("Edson Cavalcanti", 5673);
		Aluno a3 = new Aluno("Mauricio Aniche", 9832);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		curso.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("\n O aluno "+ a1.getNome() + " está matriculado?");
		System.out.println(curso.estaMatriculado(a1));
		
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(curso.estaMatriculado(turini));
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		
		
		System.out.println("\n Usando o Iterator -> Muito usado nas versões antes do Java 5");
		Set<Aluno> alunos = curso.getAlunos(); 
		Iterator<Aluno> iterador = alunos.iterator(); // É um objeto que todas as coleções nos dão acesso e serve para iterar entre os objetos dentro da coleção.
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		
		
	}
}
