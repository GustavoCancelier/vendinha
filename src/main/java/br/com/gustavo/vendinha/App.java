package br.com.gustavo.vendinha;

import java.math.BigDecimal;

//import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Cliente cliente = new Cliente ("Carlos");
        Produto produto = new Produto ("Arroz",BigDecimal.valueOf(10.99));
        Produto produto2 = new Produto ("Golf",BigDecimal.valueOf(20000.00));
        Compra compra = cliente.comprar(produto, 1);
        //ItemCompra iCompra = new ItemCompra(produto, 1);
        compra.addCompra(produto2, 2);
        System.out.println("Nome CLiente: " + compra.getCliente().getNome());
        System.out.println("Id Cliente: " + compra.getCliente().getId());
        for (ItemCompra i : compra.getItens()) {
			System.out.println("Produto: " + i.getProduto().getNomeProduto());
			System.out.println("Valor Un: " + i.getProduto().getValorProduto());
			System.out.println("Quantidade: " + i.getQtd());
			System.out.println("Valor: " + i.getTotal());
		}
        System.out.println(compra.getTotal());
    }
}
