package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_11_NumInteirosSoma {

	public static void main(String[] args) {

		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Altere o programa anterior para que ao final mostre a soma dos números.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = scan.nextInt();
		
		for(int i = n1 ; i <= n2 ; i++) {
			soma += i;
		}
		
		System.out.println(soma);
	}

}
