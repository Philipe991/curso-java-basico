package exerciciosAula19;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos
		 * armazenados neste vetor.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int parcela1 = 0, parcela2 = 0, soma = 0;
				
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			a[i] = scan.nextInt();
			
			parcela1 = a[i];
			soma = parcela1 + parcela2;
			parcela2 = soma;
					
		}
		
		System.out.println("A soma dos elementos do array é: " + soma);

	}

}
