//Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_02_PositivoNegativo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero real:");
		double real = scan.nextDouble();
		
		if(real < 0) {
			System.out.println(real + " - � um n�mero negativo!");
		} else {
			System.out.println(real + " - � um n�mero positivo!");
		}
		
		scan.close();
		
	}

}
