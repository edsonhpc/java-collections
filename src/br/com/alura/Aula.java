package br.com.alura;

/**
 * 
 * @author Edson Cavalcanti
 * - Reescrita do m�todo toString, quando criado uma lista de aula nesta lista chamamos o toString, ao implementar esse m�todo na classe 
 * 	 ser� exibido conforme implementa��o, caso contr�rio ser� invocado o toString da classe Object.
 * - A implementa��o da interface Comparable<Aula> tem por objetivo implementarmos o seu m�todo de compara��o o compareTo.
 * - Com esse m�todo escrito, ao ordernar uma lista de aulas o m�todo Collections.sort saber� ordernar conforme implementamos o crit�rio a ser usado.
 * 
 *
 */

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + " , " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo); // Ordena��o reaproveitando o compareTo que compara duas strings.
	}

}
