package br.com.gustavo.vendinha;

import java.util.SplittableRandom;


public class Cliente {
	private String nome;
	private Long id;
	
	public Cliente (String nome) {
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE);
		this.nome = nome;
	}
	
	public Compra comprar(Produto produto, Integer quantidade) {
		Compra compra = new Compra(produto, this, quantidade);
		return compra;
	}
	
	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	
	
}
