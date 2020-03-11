// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_12_PesoIdeal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual a sua altura?");
		double altura = scan.nextDouble();
		
		double IMC = ((72.7 * altura)-58);
		
		System.out.println("Seu peso ideal é: " + IMC);
		scan.close();

	}

}
