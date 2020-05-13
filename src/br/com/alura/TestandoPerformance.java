package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoPerformance {

	 public static void main(String[] args) {

	        ArrayList<Class> class1 = new ArrayList<>(); 
	        ArrayList<Class> class2 = new ArrayList<>();

	        for(int i = 0; i < 1000; i++) {
	            int numeroGerado = (int) ( Math.random() * 1000 );
	            Class a = new Class(numeroGerado); 
	            class1.add( a );
	            class2.add( a );
	        }
	        
	        // imprimindo os dois arrays 
	        System.out.println(class1);
	        System.out.println(class2);
	        System.out.println();

	        long comecouMillis = System.currentTimeMillis();
	        Collections.sort(class1); // É mais rápido.
	        long tempoCollectionsSort = System.currentTimeMillis() - comecouMillis;
	        System.out.println("Tempo do Collections.sort(class1) = " + tempoCollectionsSort + "ms.");

	        comecouMillis = System.currentTimeMillis();
	        class2.sort(Comparator.comparing(Class::getTempo));
	        long tempoComparatorComparing = System.currentTimeMillis() - comecouMillis;
	        System.out.println("Tempo do Comparator.comparing(Class::getTempo()) = " + tempoComparatorComparing + "ms.");

	        // imprimindo os dois arrays ordenados
	        System.out.println(class1);
	        System.out.println(class2);
	    }

	}

	class Class implements Comparable<Class> {
	    private int tempo;

	    public Class(int tempo) {
	        this.tempo = tempo;
	    }

	    public int getTempo() {
	        return tempo;
	    }

	    public String toString() {
	        return tempo + "";
	    }

	    @Override
	    public int compareTo(Class o) {
	        return Integer.compare(this.tempo, o.getTempo());
	    }
	}