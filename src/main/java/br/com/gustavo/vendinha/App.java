package br.com.gustavo.vendinha;

import java.math.BigDecimal;

//import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Cliente cliente = new Cliente ("Carlos");
        Produto produto = new Produto ("Arroz",BigDecimal.valueOf(10.99));
        Compra compra = cliente.comprar(produto, 9);
        System.out.println(compra.getTotal());
    }
}
