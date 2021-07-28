package br.com.gustavo.vendinha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Compra {
	private Long id;
	private Cliente cliente;
	private BigDecimal total;
	private List<ItemCompra> itens;
	 
	public Compra (Produto produto, Cliente cliente, Integer quantidade) {
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE); 
		this.addCompra(produto, quantidade);
	}
	
	public BigDecimal getTotal() {
		return total;
	}
	public List<ItemCompra> addCompra(Produto produto, Integer quantidade) {
		this.itens.add(new ItemCompra(produto, quantidade));
		return itens;
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
}
