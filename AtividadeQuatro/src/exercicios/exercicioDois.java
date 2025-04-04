package exercicios;

public class exercicioDois {

	public static void main(String[] args) {
		
		
		int[][] matriz = new int[3][3];
		
		int[] diagonalPrincipal = new int[3];
		int[] diagonalSecundaria = new int[3];
		
		int somaDiagonalP = 0;
		int somaDiagonalS = 0;
		
		matriz[0][0] = 1;
		matriz[0][1] = 4;
		matriz[0][2] = 7;
		matriz[1][0] = 2;
		matriz[1][1] = 5;
		matriz[1][2] = 8;
		matriz[2][0] = 3;
		matriz[2][1] = 6;
		matriz[2][2] = 9;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[0].length; j++) {
				if(i == j) {
					diagonalPrincipal[i] = matriz[i][i];
					somaDiagonalP += matriz[i][i];
					if(i+j == 2) {
						diagonalSecundaria[i] = matriz[i][i];
						somaDiagonalS += matriz[i][i];
					}
				} else if(i+j == 2) {
					diagonalSecundaria[i] = matriz[i][j];
					somaDiagonalS += matriz[i][j];
				} 
				
			}
			
		}
		
		System.out.print("Diagonal Principal: ");
		for (int k = 0; k < diagonalPrincipal.length; k++) {
			System.out.print(diagonalPrincipal[k] + " ");
			
		}
		
		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalP);
		System.out.println("*************************");
		System.out.println();
	
		
		System.out.print("Diagonal Secundaria: ");
		for (int k = 0; k < diagonalSecundaria.length; k++) {
			System.out.print(diagonalSecundaria[k] + " ");
			
		}
		
		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalS);
		
		
		
		

	}
	

}
