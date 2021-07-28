package br.com.gustavo.vendinha;

import java.math.BigDecimal;

//import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Cliente cliente = new Cliente ("Carlos");
        Produto produto = new Produto ("Arroz",BigDecimal.valueOf(10.99));
        Produto produto2 = new Produto ("Golf",BigDecimal.valueOf(2000.00));
        Compra compra = cliente.comprar(produto, 2);
        compra.addCompra(produto, 3);
        compra.addCompra(produto2, 2);
        System.out.println(compra.getItens());
        //System.out.println(produto.getId());
        //System.out.println(compra.getTotal());
    }
}
