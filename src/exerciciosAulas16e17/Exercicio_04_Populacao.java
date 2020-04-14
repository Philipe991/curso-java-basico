package exerciciosAulas16e17;

public class Exercicio_04_Populacao {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
		 * de 3% e que a população B seja de 200000 habitantes com uma taxa de crescimento de 1,5%. Faça um programa
		 * que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a 
		 * população do país B, mantidas as taxas de crescimento.
		 */
		
		double a, b, pA, pB;
		int anos = 0;
		boolean comparador = false;
		a = 80000;
		b = 200000;
		pA = 0.03;
		pB = 0.015;
			
		System.out.println("Ano: " + anos + ". População país A: " + a + " População país B: " + b);
		
		do {
			
			a = a + (a*pA);
			b = b + (b*pB);
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
		
		/*
		for(; a < b ;) {
			
			a = a + (a+pA);
			b = b + (b + pB);
			System.out.println("Ano: " + anos + " População país A: " + a + " População país B: " + b);
						
		}
		*/

	}

}
