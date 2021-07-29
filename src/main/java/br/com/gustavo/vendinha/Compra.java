package br.com.gustavo.vendinha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Compra {
	private Long id;
	private Cliente cliente;
	private List<ItemCompra> itens;
	 
	public Compra (Produto produto, Cliente cliente, Integer quantidade) {
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE); 
		this.addCompra(produto, quantidade);
	}
	
	public void addCompra(Produto produto, Integer quantidade) {
		this.itens.add(new ItemCompra(produto, quantidade));
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public List<ItemCompra> getItens() {
		return itens;
	}
	
	public Long getId() {
		return id;
	}

	public BigDecimal getTotal() {
		BigDecimal soma = BigDecimal.ZERO;
		for (ItemCompra i : itens) {
			soma = soma.add(i.getTotal());
		}
		return soma;
	}
}
