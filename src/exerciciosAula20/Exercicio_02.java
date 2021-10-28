package exerciciosAula20;

import java.util.Random;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		/*
		 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
		 * Após isso indique qual é o maior e o menor valor da linha 5 e qual é
		 * o maior e o menor valor da coluna 7.
		 */
		
		Random numeroRandom = new Random();
		int[][] numerosAleatorios = new int[10][10];
		int maiorL5 = 0, menorL5 = 11, maiorC7 = 0, menorC7 = 11;
		
		for(int i = 0; i<numerosAleatorios.length; i++) {
			for(int j = 0; j<numerosAleatorios[i].length; j++) {
			
				numerosAleatorios[i][j] = numeroRandom.nextInt(10);
				
				System.out.print(numerosAleatorios[i][j] + " ");
			
			}
			
			System.out.println();
			
		}
		
		for(int i = 0; i<numerosAleatorios.length; i++) {
			
			if(maiorL5 < numerosAleatorios[4][i]) {
				maiorL5 = numerosAleatorios[4][i];
			}
			
			if(menorL5 > numerosAleatorios[4][i]) {
				menorL5 = numerosAleatorios[4][i];
			}
		}
		
		for(int i = 0; i<numerosAleatorios.length; i++) {
			
			if(maiorC7 < numerosAleatorios[i][6]) {
				maiorC7 = numerosAleatorios[i][6];
			}
			
			if(menorC7 > numerosAleatorios[i][6]) {
				menorC7 = numerosAleatorios[i][6];
			}
		}
		
		System.out.println("O maior da linha 5: " + maiorL5 + ", o menor da linha 5: " + menorL5);
		System.out.println("O maior da coluna 7: " + maiorC7 + ", o menor da coluna 7: " + menorC7);

	}

}
