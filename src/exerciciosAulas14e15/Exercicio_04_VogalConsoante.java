//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_04_VogalConsoante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("a")) {
			System.out.println("A letra digitada é uma vogal!");
		} else if (letra.equalsIgnoreCase("e")) {
			System.out.println("A letra digitada é uma vogal!");
		} else if (letra.equalsIgnoreCase("i")) {
			System.out.println("A letra digitada é uma vogal!");
		} else if (letra.equalsIgnoreCase("o")) {
			System.out.println("A letra digitada é uma vogal!");
		} else if (letra.equalsIgnoreCase("u")) {
			System.out.println("A letra digitada é uma vogal!");
		} else {
			System.out.println("A letra digitada é uma consoante!");
		}
		
		scan.close();
			
	}

}
