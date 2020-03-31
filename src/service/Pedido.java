package service;

import java.util.ArrayList;
import java.util.List;

import sistema.ItemGasolina;

public class Pedido {
	private double desconto;
	private List<ItemGasolina> itemGasolina=new ArrayList<>();
	public void adicionarGasolinaPorLitro(double litro) {
		ItemGasolina item=new ItemGasolina(litro,litro*4.0);
		itemGasolina.add(item);
	}

	public void adicionarGasolinaPorDinheiro(double dinheiro) {
		ItemGasolina item=new ItemGasolina(dinheiro/4.0,dinheiro);
		itemGasolina.add(item);
	}
	public double ValorTotal() {
		return itemGasolina.stream().mapToDouble(i -> i.getDinheiro()).sum();
	}
	public double LitroTotal() {
		return itemGasolina.stream().mapToDouble(i -> i.getLitro()).sum();
	}
	public double Desconto() {
		if(this.LitroTotal()>0 && this.LitroTotal()<=15) {
			this.desconto=this.ValorTotal()*0.3;
		}
		else if(this.LitroTotal()>15 && this.LitroTotal()<=20) {
			this.desconto=this.ValorTotal()*0.5;
		}
		else if(this.LitroTotal()>20 && this.LitroTotal()<=25) {
			this.desconto=this.ValorTotal()*0.7;
		}
		return this.desconto;
	}
}
