package exerciciosAula19;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma dos elementos
		 * armazenados neste vetor que s�o m�ltiplos de 5.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int parcela1 = 0, parcela2 = 0, soma = 0;
				
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o " + (i+1) + "� n�mero: ");
			a[i] = scan.nextInt();
			
			if(a[i]%5 == 0) {
				
				parcela1 = a[i];
				soma = parcela1 + parcela2;
				parcela2 = soma;
				
			}
					
		}
		
		System.out.println("A soma dos elementos do array �: " + soma);
	}

}
