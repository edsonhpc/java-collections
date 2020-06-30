package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterador {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		letras.forEach(letra -> {
			System.out.println(letra);
		});
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterador =  letras.iterator(); // Podemos obter o iterador tanto de listas e conjuntos porque todos implementam a interface collection
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}
