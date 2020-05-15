package br.com.alura;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCursoContinuacao {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes.toString());
		
		System.out.println(" ");
		
		
		Collections.reverse(aulas); // Inverte a ordem a lista se estiver em ordem crescente muda para descrecente e vice e versa;
		System.out.println("Reverse" + aulas);
		
		
		Collections.shuffle(aulas);
		System.out.println("Shuffle" + aulas); // Serve para embaralhar a odem de uma lista.
		
		Collections.singleton(aulas);
		System.out.println("Singleton" + aulas); // Nos devolve uma lista imut�vel que cont�m um �nico elemento especificado, � �til quando precisamos passar um �nico elemento para API que s� aceita uma Collections daquele elemento.
		
		List<Type> lista = new ArrayList<Type>(Collections.nCopies(5, (Type) null));
		System.out.println(lista);
		

		List<Aula> listaCopia = new ArrayList<Aula>(Collections.nCopies(5, (Aula) aulas.get(0) )); // Retorna uma lista imut�vel de acordo a quantidade do elemento escolhido.
		System.out.println(listaCopia);
		
	}
	
}
