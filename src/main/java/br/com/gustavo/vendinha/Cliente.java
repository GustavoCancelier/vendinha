package br.com.gustavo.vendinha;

//import java.math.BigDecimal;

public class Cliente {
	private String nome;
	
	public Cliente (String nome) {
		this.nome = nome;
	}
	
	public Compra comprar(Produto produto, Integer quantidade) {
		Compra compra = new Compra(produto, this, quantidade);
		return compra;
	}
	
	public String getNome() {
		return nome;
	}
}
