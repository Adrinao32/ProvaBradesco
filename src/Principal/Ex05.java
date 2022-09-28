package Principal;

public class Ex05 {

	public static void main(String[] args) {
		
		
		
		Veiculo v = new Veiculo(5569, "Adriano Gomes", "FOX", "W.W", 38800.00);
		
		
		
		System.out.println("Placa do veiculo: " + v.getPlaca());
		System.out.println("Nome do Proprietarios: " + v.getProprietario());
		System.out.println("Modelo do Veiculo: " + v.getModelo());
		System.out.println("Fabricante veiculo: " + v.getFabricante());
		System.out.println("Valor mercado veiculo: " + v.getValor_mercado());
		
		
		
		
	}

}
