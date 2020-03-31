package sistema;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import service.Pedido;


public class testPedido {
	private Pedido pedido;
	@Before
	public void setup() {
		pedido=new Pedido();
	}
	@Test
	public void AdicionarGasolinaNoPedido() throws Exception{
		pedido.adicionarGasolinaPorLitro(1.0);
		pedido.adicionarGasolinaPorDinheiro(1.0);
	}
	@Test
	public void ValorTotalEDescontoDoPedidoVazio() throws Exception {
		assertResumoPedido(0.0, 0.0, 0.0);
	}
	@Test
	public void calcularResumoDeUmPedido() throws Exception {
		pedido.adicionarGasolinaPorDinheiro(3.0);
		pedido.adicionarGasolinaPorLitro(1.0);
		
		assertResumoPedido(2.1, 7.0, 1.75);
	}
	@Test
	public void ResumoDeDoisPedido() throws Exception {
		pedido.adicionarGasolinaPorDinheiro(4.0);
		pedido.adicionarGasolinaPorLitro(1.0);
		pedido.adicionarGasolinaPorDinheiro(10.0);
		pedido.adicionarGasolinaPorLitro(7.0);
		
		assertResumoPedido(13.8, 46.0, 11.5);
	}
	private void assertResumoPedido(double desconto, double valorTotal, double litroTotal) {
		assertEquals(desconto, pedido.Desconto(), 0.001);
		assertEquals(valorTotal, pedido.ValorTotal(), 0.001);
		assertEquals(litroTotal, pedido.LitroTotal(), 0.001);
	}
}
