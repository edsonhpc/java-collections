package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas  = new LinkedList<>(); // Possui uma estrutura de de dados chamada de lista ligada, � mais lenta quando precisamos acessar um elemento dentro da lista.
//	private Set<Aluno> alunos = new HashSet<>(); // O Set n�o garante a ordem dos elementos inseridos, ou seja ele n�o guarda a sequ�ncia.
	private Set<Aluno> alunos = new LinkedHashSet<>(); // Essa implementa��o de Set nos garante a ordem dos elementos com extrema velocidade no entanto n�o conseguirmos pegar um elemento get de acordo com sua posi��o.
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); // O Map n�o � uma implementa��o de Collection ele � uma Interface por si s�.
																		// LinkedHashMap tamb�m mantem a order de inser��o
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
		this.alunos.add(aluno); // adiciona no Set de alunos
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos); // Boa pr�tica programar defensivamente.
	}
	
	@Override
	public String toString() {
		return "[Curso: "+ this.nome +", tempo total:" + this.getTempoTotal() + ", aulas: "+ aulas.toString() +"]";
	}

	public boolean estaMatriculado(Aluno aluno) { 
		return this.alunos.contains(aluno); // Contains utilizar� a estrutura bem implementada da tabela de espalhamento e ir� retornar true ou false
	} 										// Quando usamos o m�todo contains de List ele utiliza apenas o equals para comparar dois objetos

	public Aluno buscaMatriculado(int numero) {
		return this.matriculaParaAluno.get(numero);
	}
	
	public Aluno buscaMatriculadoLambda(int numero) {
	    return alunos
	            .stream() // cria uma Stream
	            .filter(aluno -> Integer.valueOf(aluno.getNumeroMatricula()).equals(numero)) // retorna uma nova stream com filtro informado
	            .findFirst() // retorna um optional contendo o primeiro elemento da stream
	            .orElseThrow(() -> new RuntimeException("Aluno n�o encontrado")); // lan�a uma exception quando valor for null
	}

}
