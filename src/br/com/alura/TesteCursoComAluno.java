package br.com.alura;

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
		
	}
}
