package Principal;

import java.util.Scanner;

public class Ex03_multas {

	public static void main(String[] args) {
		
		int velocidadeMaxima, velocidadeVeiculo; 

		Scanner tc = new Scanner(System.in);
		
		System.out.println("Qual a velocidade Maxima da via? ");
		velocidadeMaxima = tc.nextInt();
		
		System.out.println("Qual a velociadade do Veiculo? ");
		velocidadeVeiculo = tc.nextInt();
		
		if(velocidadeVeiculo <= velocidadeMaxima) {
			System.out.println("Veiculo dentro dos limites de velocidade da via");
		}
		if(velocidadeVeiculo > velocidadeMaxima & velocidadeVeiculo <= velocidadeMaxima + 10) {
			System.out.println("Veiculo acima dos limites da via 'ate 10km/h a mais' - multa R$ 100,00");
		}
		if(velocidadeVeiculo >= velocidadeMaxima + 11 & velocidadeVeiculo <= velocidadeMaxima + 30) {
			System.out.println("Veiculo acima dos limites da via 'de 11km/h ate 30km/h' - multa R$ 200,00");
		}
		if(velocidadeVeiculo > velocidadeMaxima + 30) {
			System.out.println("Veiculo acima dos limites da via 'acima de 30km/h' - multa R$ 500,00");
		}	
		
		tc.close();
		
	}

}
