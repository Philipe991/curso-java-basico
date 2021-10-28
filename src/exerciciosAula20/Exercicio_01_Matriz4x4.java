package exerciciosAula20;

import java.util.Scanner;

public class Exercicio_01_Matriz4x4 {

	public static void main(String[] args) {

		/*
		 * Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0 e 9. Ap�s isso
		 * determine o maior n�mero da matriz e sua posi��o (linha, coluna).
		 */

		Scanner scan = new Scanner(System.in);

		double[][] numerosAleatorios = new double[4][4];
		double entrada = 0, maiorNumero = 0;
		int linha = 0, coluna = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				do {

					System.out.println("Digite um n�mero aleat�rio entre 0 e 9: ");
					entrada = scan.nextDouble();

				} while ((entrada < 0 || entrada > 9));

				numerosAleatorios[i][j] = entrada;

				if (maiorNumero < numerosAleatorios[i][j]) {
					maiorNumero = numerosAleatorios[i][j];
					linha = i + 1;
					coluna = j + 1;
				}

			}

		}

		for (int i = 0; i < numerosAleatorios.length; i++) {

			for (int j = 0; j < numerosAleatorios[i].length; j++) {

				System.out.print(numerosAleatorios[i][j] + " ");

			}

			System.out.println();

		}

		System.out.println("O maior n�mero da matriz �: " + maiorNumero + ", localizado na linha [ " + linha
				+ " ] e coluna [ " + coluna + " ]");

	}

}
