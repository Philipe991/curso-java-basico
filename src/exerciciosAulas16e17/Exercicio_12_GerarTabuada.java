package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_12_GerarTabuada {

	public static void main(String[] args) {

		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro de 1 a 10. O usuário
		 * deve informar qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo:
		 * Tabua de 5:
		 * 5 x 1 = 5
		 * ...
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int multiplicador = 0;
		boolean validador = false;
		int multiplicando;
		
		do {
			
			System.out.println("Informe um número para gerar a tabuada: ");
			multiplicando = scan.nextInt();
			
			if(multiplicando > 10) {
				
				validador = false;
				System.out.println("A número informado para a tabuada deve ser entre 0 e 10.");
				
			} else {
				
				validador = true;
				
			}
			
		} while(!validador);
		
		do {
			
			System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicando * multiplicador);
			multiplicador++;
			
		} while(multiplicador <= 10);
		
		System.out.println();
		
		// Resolução Loiane
		
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println(multiplicando + " x " + i + " = " + (multiplicando*i));
		}
		
	}

}
