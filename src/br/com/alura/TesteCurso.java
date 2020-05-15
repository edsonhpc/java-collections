package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas(); // Referência é para o mesmo objeto "aulas";
		
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22)); // Referência o mesmo objeto "aulas";
		
		System.out.println(aulas);
		
		
	}
}
