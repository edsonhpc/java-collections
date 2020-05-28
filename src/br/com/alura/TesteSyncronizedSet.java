package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteSyncronizedSet {

	public static void main(String[] args) {
		
		Set<String> alunos = Collections.synchronizedSet(new HashSet<>());
		alunos.add("Juliana");
		alunos.add("Edson");
		alunos.add("Selena");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		synchronized (alunos) { // Esse método podemos utilizar para manipular coleções em processamento paralelo.
			
			Iterator<String> i = alunos.iterator();
			
			while(i.hasNext()) {
				System.out.println(i); 
				i.next();
			}
		}
		
		
	}
}
