package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nullo");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Nome: " +  this.nome + ",  Matricula: "+ this.numeroMatricula+"]";
	}
	
	@Override // Para todos os testes se sobrescrevermos o equals é obrigatorio sobrescrever o hashCode.
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome); // Definimos que dois alunos são iguais quando possuem o mesmo nome.
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
