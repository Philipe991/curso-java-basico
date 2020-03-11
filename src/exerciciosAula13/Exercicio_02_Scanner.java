// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_02_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Você digitou: " + numero1);
		
		scan.close();

	}

}
