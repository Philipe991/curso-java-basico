// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_06_AreaCirculo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o raio do c�rculo?");
		double raioCirculo = scan.nextDouble();
		
		double areaCirculo = Math.PI * raioCirculo;
		
		System.out.println("O raio do c�rculo informado foi: " + raioCirculo + "\nA �rea do c�rculo �: " + areaCirculo);
		
		scan.close();
		
	}

}
