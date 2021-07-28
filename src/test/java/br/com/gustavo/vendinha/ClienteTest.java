package br.com.gustavo.vendinha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;


public class ClienteTest {
	@Test
	public void ClienteResultadoTest() {
		Cliente cliente = new Cliente ("carlos");
		Produto produto = new Produto ("Arroz", BigDecimal.valueOf(10.99));
		cliente.comprar(produto, 2);
		
		//assertEquals(21.98, cliente.comprar());
	}
}
