package br.com.gustavo.vendinha;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Compra {
	private Long id;
	private Cliente cliente;
	private List<ItemCompra> itens;
	private LocalDateTime dataCompra;
	private LocalDateTime dataPagamento;
	private LocalDateTime dataCancelamento;
	private EnumPagamento statusPagamento;
	private BigDecimal valorPago;
	private BigDecimal troco;
	 
	public Compra (Produto produto, Cliente cliente, Integer quantidade) {
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		this.id = new SplittableRandom().nextLong(1, Long.MAX_VALUE); 
		this.dataCompra = LocalDateTime.now();
		this.addCompra(produto, quantidade);
		this.statusPagamento = EnumPagamento.AGUARDANDO;
		this.valorPago = BigDecimal.valueOf(0);
		this.troco = BigDecimal.valueOf(0);
	}
	public BigDecimal pagar (BigDecimal dinheiro) {
		if (valorPago.compareTo(getTotal()) < 0) {
			cancelar();
		} else if (getStatusPagamento().equals(EnumPagamento.PAGO)) {
			throw new RuntimeException ("Erro! A compra ja foi paga");
		}
		this.dataPagamento = LocalDateTime.now();
		this.statusPagamento = EnumPagamento.PAGO;
		this.valorPago = dinheiro;
		return troco = dinheiro.subtract(getTotal());
	}
	
	public BigDecimal cancelar() {
		if (getStatusPagamento().equals(EnumPagamento.CANCELADO)) {
			throw new RuntimeException ("Erro! A compra ja foi cancelada");
		}
		
		if (getStatusPagamento().equals(EnumPagamento.PAGO)) {
			this.statusPagamento = EnumPagamento.CANCELADO;
			this.dataCancelamento = LocalDateTime.now();
		}
		
		return getValorPago();
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

	public LocalDateTime getDataCompra() {
		return dataCompra;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}

	public LocalDateTime getDataCancelamento() {
		return dataCancelamento;
	}
	
	public EnumPagamento getStatusPagamento() {
		return statusPagamento;
	}
	
	public BigDecimal getValorPago() {
		return valorPago;
	}
	
	public BigDecimal getTroco() {
		return troco;
	}
}
