// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_05_MetrosParaCentimetros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em metros: ");
		double metros = scan.nextDouble(); 
		
		double centimetros = metros*100;
		System.out.println(metros + " metros equivalem a " + centimetros + " centímetros!");
		
		scan.close();
		
	}

}
