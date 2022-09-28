package Principal;

public class Veiculo {
	
	private int placa;
	private String proprietario;
	private String modelo;
	private String fabricante;
	private double valor_mercado;
	
	public Veiculo(int placa, String proprietario, String modelo, String fabricante, double valor_mercado) {
		super();
		this.placa = placa;
		this.proprietario = proprietario;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.valor_mercado = valor_mercado;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getValor_mercado() {
		return valor_mercado;
	}

	public void setValor_mercado(double valor_mercado) {
		this.valor_mercado = valor_mercado;
	}
	

}
