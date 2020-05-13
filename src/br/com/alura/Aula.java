package br.com.alura;

/**
 * 
 * @author Edson Cavalcanti
 * - Reescrita do método toString, quando criado uma lista de aula nesta lista chamamos o toString, ao implementar esse método na classe 
 * 	 será exibido conforme implementação, caso contrário será invocado o toString da classe Object.
 * - A implementação da interface Comparable<Aula> tem por objetivo implementarmos o seu método de comparação o compareTo.
 * - Com esse método escrito, ao ordernar uma lista de aulas o método Collections.sort saberá ordernar conforme implementamos o critério a ser usado.
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
		return this.titulo.compareTo(outraAula.titulo); // Ordenação reaproveitando o compareTo que compara duas strings.
	}

}
