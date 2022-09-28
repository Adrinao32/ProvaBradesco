package Principal;

import java.util.Scanner;

public class Ex04_Maior_Menor {

	public static void main(String[] args) {
		
		int maior = -999, menor = 999, numero;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo. 'Caso queira parar Digite valor negativo'. ");
		numero = tc.nextInt();
		
		
		while(numero > 0) {
			if(numero > maior) {
				maior = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
			
			System.out.println("Digite um numero inteiro positivo. 'Caso queira parar Digite valor negativo'. ");
			numero = tc.nextInt();
			
			
		}
		
		System.out.println("Maior numero digitado foi: " + maior);
		System.out.println("Menor numero digitado foi: " + menor);
		
		tc.close();
		

	}

}
