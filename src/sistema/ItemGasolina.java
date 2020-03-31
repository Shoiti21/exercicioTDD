package sistema;

public class ItemGasolina {
	private double litro;
	private double dinheiro;
	private tipoAbastecimento status;
	public ItemGasolina (double litro, double dinheiro) {
		this.litro=litro;
		this.dinheiro=dinheiro;
	}
	public double getLitro() {
		return litro;
	}
	public void setLitro(double litro) {
		this.litro = litro;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}
