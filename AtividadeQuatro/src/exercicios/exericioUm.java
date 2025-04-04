package exercicios;

import java.util.Scanner;

public class exericioUm {

	public static void main(String[] args) {
		
		int buscar;
		int j = 0;
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[] {
				2,
				5,
				1,
				3,
				4,
				9,
				7,
				8,
				10,
				6,
				
		};
		
		System.out.println("Digite um número: ");
		buscar = scanner.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == buscar) {
				System.out.println("A posição do número procurado é " + (i+1));
				j += 1;
			}
			
		}
		
		if(j == 0) {
			System.out.println("O número " + buscar + " não foi encontrado!");
		}

	}

}
