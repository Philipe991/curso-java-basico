// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_03_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos primeiro n�mero (" + numero1 + ") com o segundo (" + numero2 + ") � igual a: " + resultado);
		
		scan.close();

	}

}
