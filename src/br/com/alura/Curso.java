package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas  = new LinkedList<>(); // Possui uma estrutura de de dados chamada de lista ligada, � mais lenta quando precisamos acessar um elemento dentro da lista.
	private Set<Aluno> alunos = new HashSet<>(); // O Set n�o garante a ordem dos elementos inseridos, ou seja ele n�o guarda a sequ�ncia.
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() { // Usando dessa forma podemos inserir alguma valida��o antes de inserir o elemento na lista, visto que obrigamos a chamada do metodo adiciona.
		return Collections.unmodifiableList(aulas); // Transformando a List em read only, somente a pr�pria classe pode adicionar ou remover elementos;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		
		//int tempoTotal = 0;
		//for (Aula aula : aulas) {
		//	tempoTotal += aula.getTempo();
		//} 
		return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // Java 8 -> Pega a lista de aula e soma;
	}
	
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos); // Boa pr�tica programar defensivamente.
	}
	
	@Override
	public String toString() {
		return "[Curso: "+ this.nome +", tempo total:" + this.getTempoTotal() + ", aulas: "+ aulas.toString() +"]";
	}

	
}
