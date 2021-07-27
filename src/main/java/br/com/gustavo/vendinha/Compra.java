package br.com.gustavo.vendinha;

import java.math.BigDecimal;

public class Compra {
	private BigDecimal total;
	
	public Compra (Produto produto, Cliente cliente, Integer quantidade) {
		produto = new Produto ("Arroz",BigDecimal.valueOf(10.99));
		cliente.getNome(); 
		this.total = produto.getValorProduto().multiply(BigDecimal.valueOf(quantidade));
	}
	
	public BigDecimal getTotal() {
		return total;
	}
}
