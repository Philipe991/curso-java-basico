package exerciciosAula19;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos
		 * armazenados neste vetor que são pares.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int contador = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			a[i] = scan.nextInt();
			
			if(a[i]%2 == 0) {
				contador++;
			}
					
		}
		
		System.out.println("A quantidade de números pares é: " + contador);

	}

}
