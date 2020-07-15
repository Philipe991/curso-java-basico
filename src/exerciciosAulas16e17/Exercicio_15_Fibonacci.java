package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_15_Fibonacci {

	public static void main(String[] args) {
		
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * A série de Fibonacci é formada pela sequencia 
		 * 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,...
		 * Faça um programa capaz de gerar até o n-ésimo termo.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o n-ésimo termo da série de Fibonacci, para que eu a gere: ");
		int nTermos = scan.nextInt();
		int atual = 0, proximo = 1, resultado;
		
		for(int i = 0; i < nTermos ; i++) {
			
			resultado = atual;
			System.out.print(resultado + " ");
			resultado = atual + proximo;
			proximo = atual;
			atual = resultado;
						
		}
		
	}

}
