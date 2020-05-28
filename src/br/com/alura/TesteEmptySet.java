package br.com.alura;

import java.util.Collections;
import java.util.Set;

/**
 * 
 * @author edson.h.cavalcanti
 * - No exemplo abaixo � lan�ado uma exception, visto que um conjunto destinado a ser vazio n�o pode receber elemento.
 * - Sentido de usar um conjunto vazio: imagino que preciso representar um curso que foi cancelado pois n�o teve matriculas, neste caso
 * 	 faria sentido devolver um Collections.emptySet();
 */
public class TesteEmptySet {

	public static void main(String[] args) {
		
		Set<String> nomes = Collections.emptySet();
		nomes.add("Edson");
		
	}
}
