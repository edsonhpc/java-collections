package br.com.alura;

public class TesteBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		
		Curso curso = new Curso("Dominando as coleções do java", "Paulo SIlveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 21));
		
		Aluno a1 = new Aluno("Rodrigo Turino", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 5617);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = curso.buscaMatriculado(5617);
		System.out.println("Aluno: "+ aluno);
		
		Aluno alunoLambda = curso.buscaMatriculadoLambda(5617);
		System.out.println("Aluno: "+ alunoLambda);
	}
}
