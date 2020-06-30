package br.com.alura;

public class Recibo implements Comparable<Recibo> {

	private String nome;
	private Double valor;
	
	public Recibo(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getValor() {
		return valor;
	}

	@Override
	public int compareTo(Recibo outroRecibo) {
		return this.getNome().compareTo(outroRecibo.getNome());
	}
	
}
