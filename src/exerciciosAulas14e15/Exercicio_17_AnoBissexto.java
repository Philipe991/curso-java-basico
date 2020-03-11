//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_17_AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos verificar se um ano é bissexto, informe um ano: ");
		int ano = scan.nextInt();
		
		if(ano%4 == 0) {
			if(ano%100 != 0) {
				System.out.println("O ano é bissexto! É divisível por 4 e por 100.");
			} else {
				System.out.println("O ano não é bissexto! É divisível por 4, mas não é divisível por 100.");
			}
		} else if (ano%400 == 0) {
			System.out.println("O ano é bissexto! Não é divisível por 4, mas é divisível por 400.");
		} else {
			System.out.println("O ano não é bissexto! Não é divisível por 4, nem por 400.");
		}
		
		scan.close();

	}

}
