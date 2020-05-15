package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas(); // Refer�ncia � para o mesmo objeto "aulas";
		
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22)); // Refer�ncia o mesmo objeto "aulas";
		
		System.out.println(aulas);
		
		
	}
}
