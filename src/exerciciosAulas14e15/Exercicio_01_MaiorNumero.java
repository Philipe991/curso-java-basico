// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_01_MaiorNumero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite outro n�mero:");
		double num2 = scan.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O maior n�mero �: " + num1);
		} else if(num1 < num2) {
			System.out.println("O maior n�mero �: " + num2);
		} else {
			System.out.println("Os n�meros s�o iguais");
		}
		
		scan.close();

	}

}
