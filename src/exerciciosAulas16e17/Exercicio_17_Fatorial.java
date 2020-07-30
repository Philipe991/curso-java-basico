package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_17_Fatorial {

	public static void main(String[] args) {
		
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 *Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		 *Ex.: 5! = 5.4.3.2.1 = 120
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para que seja calculado o fatorial: ");
		int nFatorial = scan.nextInt();
		int fatorial = nFatorial, repetidor = nFatorial, resultado = nFatorial;
				
		for(int count = 0 ; count < repetidor ; count++) {
			
			System.out.println(resultado);
			
			nFatorial--;
			fatorial = resultado * (nFatorial);
			resultado = fatorial;
									
		}
		
		// Resolução Loiane
		
		System.out.println("Informe o número para calcular o fatorial: ");
		int num = scan.nextInt();
		
		int fat = 1;
		
		for(int i = num; i>0 ; i--) {
			fat *= i;
			System.out.println(fat);
		}
				
	}

}
