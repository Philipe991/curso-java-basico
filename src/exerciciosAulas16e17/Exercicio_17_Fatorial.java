package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_17_Fatorial {

	public static void main(String[] args) {
		
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 *Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
		 *Ex.: 5! = 5.4.3.2.1 = 120
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero para que seja calculado o fatorial: ");
		int nFatorial = scan.nextInt();
		int fatorial = nFatorial, repetidor = nFatorial, resultado = nFatorial;
				
		for(int count = 0 ; count < repetidor ; count++) {
			
			System.out.println(resultado);
			
			nFatorial--;
			fatorial = resultado * (nFatorial);
			resultado = fatorial;
									
		}
				
	}

}
