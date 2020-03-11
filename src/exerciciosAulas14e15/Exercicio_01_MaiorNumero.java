// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_01_MaiorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite outro número:");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O maior número é: " + num1);
		} else if(num1 < num2) {
			System.out.println("O maior número é: " + num2);
		} else {
			System.out.println("Os números são iguais");
		}
		
		scan.close();

	}

}
