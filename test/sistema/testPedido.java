package sistema;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testPedido {
	private Pedido pedido;
	@Before
	public void setup() {
		pedido=new Pedido();
	}
	@Test
	public void AdicionarUmItemNoPedido() throws Exception{
		pedido.adicionarItem("Lápis", 1.0, 5);
	}
	@Test
	public void CalcularDescontoValorTotalParaPedidoVazio() throws Exception {
		assertEquals(0.0, pedido.valorTotal(),0.0001);
		assertEquals(0.0, pedido.desconto(),0.0001);
	}
}
