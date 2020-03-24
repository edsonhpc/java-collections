package br.com.alura;

/**
 * 
 * @author Edson Cavalcanti
 * - O compareTo é um método que devolve um número negativo se s1 é menor s2, positivo se s2 é menor s1 e 0 se forem iguais.
 * - https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#compareTo-java.lang.String-
 */
public class TesteComparacaoStrings {

	public static void main(String[] args) {
		
		String s1 = "Edson";
		String s2 = "Juliana";
		int resultado = s1.compareTo(s2);
		
		System.out.println(resultado);
		
	}
	
}
