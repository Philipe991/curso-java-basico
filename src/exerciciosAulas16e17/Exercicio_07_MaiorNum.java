package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_07_MaiorNum {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Fa�a um programa que leia cinco n�meros e informe o maior valor.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num, maior = Integer.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Entre com um n�mero");
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
				System.out.println("O maior n�mero mudou: " + maior);
			}
			System.out.println("O maior n�mero digitado foi: " + maior);
			
		}
		
		

		
	}

}
