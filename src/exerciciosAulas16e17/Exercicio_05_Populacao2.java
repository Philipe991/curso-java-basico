package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_05_Populacao2 {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
		 * de 3% e que a população B seja de 200000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa
		 * que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a 
		 * população do país B, mantidas as taxas de crescimento.
		 * 
		 * Altere o programa acima permitindo que o usuário informar as populações e a taxa de crescimento iniciais.
		 * Valide a entrada e permita repetir a operação.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, pA, pB;
		int anos = 0;
		boolean comparador = false;
		boolean repetirOp = false;
		
		do {
			
		System.out.println("Informe a população inicial do país A: ");
		a = scan.nextDouble();
		System.out.println("Informe a taxa anual de crescimento da população do país A: ");
		pA = scan.nextDouble();
		
		System.out.println("Informe a população inicial do país B: ");
		b = scan.nextDouble();
		System.out.println("Informe a taxa anual de crescimento da população do país B: ");
		pB = scan.nextDouble();
		
		System.out.println("Ano: " + anos + ". População país A: " + a + " População país B: " + b);
		
		do {
			
			a = a + (a*(pA/100));
			b = b + (b*(pB/100));
			anos++;
			
			if(a < b) {
				
				comparador = false;
				System.out.println("Ano: " + anos + ". População país A: " + a + " População país B: " + b);
				
			} else {
				
				comparador = true;
				System.out.println("Ano: " + anos + ". População país A: " + a + " População país B: " + b);
				System.out.println("País A com população maior ou igual ao país B em: " + anos + " anos.");
				
			}
						
		} while (!comparador);
		
		System.out.print("Deseja informar novos dados? (S ou N)");
		String refazer = scan.next();
		
		if(refazer.equalsIgnoreCase("S")) {
			repetirOp = true;
		} else if (refazer.equalsIgnoreCase("N")) {
			repetirOp = false;
		} else {
			System.out.println("Opção inválida!");
		}
		
		} while (!repetirOp);
		
	}

}
