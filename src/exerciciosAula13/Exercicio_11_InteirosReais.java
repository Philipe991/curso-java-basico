// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_11_InteirosReais {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois n�meros inteiros:");
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
				
		System.out.println("Informe um n�mero real:");
		double real = scan.nextDouble();
		
		double produto = ((float)int1 * 2) * ((float)int2 / 2);
		double soma = (int1 * 3) + real;
		double cubo = Math.pow(real, 3);
		
		System.out.println("Primeiro n�mero inteiro: " + int1 + "\nSegundo n�mero inteiro: " + int2 + "\nN�mero real: " + real);
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("O terceiro elevado ao cubo: " + cubo);
		
		scan.close();
		
	}

}