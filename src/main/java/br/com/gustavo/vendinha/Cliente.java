package br.com.gustavo.vendinha;

//import java.math.BigDecimal;

public class Cliente {
	private String nome;
	
	public Cliente (String nome) {
		this.nome = nome;
	}
	
	public Compra Comprar(Produto produto, Integer quantidade) {
		Compra compra = new Compra(produto, this, quantidade);
		System.out.println(compra);
		return compra;
	}
	
	public String getNome() {
		return nome;
	}
}
