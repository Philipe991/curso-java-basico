package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_10_NumInteiros {

	public static void main(String[] args) {

		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Faça um programa que receba dois números inteiros e gere os números inteiros compreendidos no intervalo entre eles.
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean validador = false;
		
		do {
		
			System.out.println("Digite o primeiro número: ");
			int n1 = scan.nextInt();
									
			System.out.println("Digite o segundo número: ");
			int n2 = scan.nextInt();
			
			if(n2 <= n1) {
				System.out.println("O segundo número deve ser maior que o primeiro.");
			}
			else {
				validador = true;
				System.out.println("Inteiros entre os números " + n1 + " e " + n2 +" :");
			}
						
			do {
								
				System.out.print(n1 +" ");
				n1++;
				
			} while(n1<=n2);
			
		} while(!validador);
		
		// Resolução Loiane
		
		System.out.println("\nDigite o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = scan.nextInt();
		
		for(int i = n1 ; i <= n2 ; i++) {
			System.out.println(i);
		}
		
	}

}
