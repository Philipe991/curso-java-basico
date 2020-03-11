//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_18_ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("O número '" + num + "' é par!");
		} else {
			System.out.println("O número '" + num + "' é ímpar!");
		}
		
		scan.close();

	}

}
