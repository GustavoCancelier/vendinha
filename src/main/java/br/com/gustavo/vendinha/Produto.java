package br.com.gustavo.vendinha;

import java.math.BigDecimal;

public class Produto {
	private String nomeProduto;
	private BigDecimal valorProduto;
	
	public Produto (String nomeProduto, BigDecimal valorProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public BigDecimal getValorProduto() {
		return valorProduto;
	}
}
