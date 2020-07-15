package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_07_MaiorNum {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Faça um programa que leia cinco números e informe o maior valor.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num, maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Entre com um número");
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
				System.out.println("O maior número mudou: " + maior);
			}
			System.out.println("O maior número digitado foi: " + maior);
			
		}
		
		

		
	}

}
