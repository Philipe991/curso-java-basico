package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_05_Populacao2 {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
		 * de 3% e que a popula��o B seja de 200000 habitantes com uma taxa de crescimento de 1,5%. Fa�a um programa
		 * que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a 
		 * popula��o do pa�s B, mantidas as taxas de crescimento.
		 * 
		 * Altere o programa acima permitindo que o usu�rio informar as popula��es e a taxa de crescimento iniciais.
		 * Valide a entrada e permita repetir a opera��o.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, pA, pB;
		int anos = 0;
		boolean comparador = false;
		boolean repetirOp = false;
		
		do {
			
		System.out.println("Informe a popula��o inicial do pa�s A: ");
		a = scan.nextDouble();
		System.out.println("Informe a taxa anual de crescimento da popula��o do pa�s A: ");
		pA = scan.nextDouble();
		
		System.out.println("Informe a popula��o inicial do pa�s B: ");
		b = scan.nextDouble();
		System.out.println("Informe a taxa anual de crescimento da popula��o do pa�s B: ");
		pB = scan.nextDouble();
		
		System.out.println("Ano: " + anos + ". Popula��o pa�s A: " + a + " Popula��o pa�s B: " + b);
		
		do {
			
			a = a + (a*(pA/100));
			b = b + (b*(pB/100));
			anos++;
			
			if(a < b) {
				
				comparador = false;
				System.out.println("Ano: " + anos + ". Popula��o pa�s A: " + a + " Popula��o pa�s B: " + b);
				
			} else {
				
				comparador = true;
				System.out.println("Ano: " + anos + ". Popula��o pa�s A: " + a + " Popula��o pa�s B: " + b);
				System.out.println("Pa�s A com popula��o maior ou igual ao pa�s B em: " + anos + " anos.");
				
			}
						
		} while (!comparador);
		
		System.out.print("Deseja informar novos dados? (S ou N)");
		String refazer = scan.next();
		
		if(refazer.equalsIgnoreCase("S")) {
			repetirOp = true;
		} else if (refazer.equalsIgnoreCase("N")) {
			repetirOp = false;
		} else {
			System.out.println("Op��o inv�lida!");
		}
		
		} while (!repetirOp);
		
	}

}
