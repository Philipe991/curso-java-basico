//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_05_Media {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota 1:");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2:");
		double n2 = scan.nextDouble();
		
		double media = (n1+n2)/2;
		
		System.out.println("Sua média é: " + media);
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if(media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		}  
		
/*	
		switch(media) {
		case media >= 7: System.out.println("Aprovado");
		case media < 7: System.out.println("Reprovado");
		case media == 10: System.out.println("Aprovado com Distinção");
		}
*/		
		scan.close();
		
	}

}
