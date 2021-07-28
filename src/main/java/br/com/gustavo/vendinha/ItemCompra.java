package br.com.gustavo.vendinha;

import java.math.BigDecimal;

public class ItemCompra {
	private Produto produto;
	private Integer qtd;
	private BigDecimal total;

	public ItemCompra(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.qtd = quantidade;
		this.total = produto.getValorProduto().multiply(BigDecimal.valueOf(quantidade));
	}

	public Integer getQtd() {
		return qtd;
	}

	public Produto getProduto() {
		return produto;
	}

	public BigDecimal getTotal() {
		return total;
	}

	
}
