package br.com.gustavo.vendinha;

import java.math.BigDecimal;
import java.util.SplittableRandom;

public class Produto {
	private Long id;
	private String nomeProduto;
	private BigDecimal valorProduto;
	
	public Produto (String nomeProduto, BigDecimal valorProduto) {
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE);
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public Long getId() {
		return id;
	}
}
