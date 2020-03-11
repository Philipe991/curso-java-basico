//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_02_PositivoNegativo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número real:");
		double real = scan.nextDouble();
		
		if(real < 0) {
			System.out.println(real + " - É um número negativo!");
		} else {
			System.out.println(real + " - É um número positivo!");
		}
		
		scan.close();
		
	}

}
