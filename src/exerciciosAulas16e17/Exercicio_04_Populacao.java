package exerciciosAulas16e17;

public class Exercicio_04_Populacao {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
		 * de 3% e que a popula��o B seja de 200000 habitantes com uma taxa de crescimento de 1,5%. Fa�a um programa
		 * que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a 
		 * popula��o do pa�s B, mantidas as taxas de crescimento.
		 */
		
		double a, b, pA, pB;
		int anos = 0;
		boolean comparador = false;
		a = 80000;
		b = 200000;
		pA = 0.03;
		pB = 0.015;
			
		System.out.println("Ano: " + anos + ". Popula��o pa�s A: " + a + " Popula��o pa�s B: " + b);
		
		do {
			
			a = a + (a*pA);
			b = b + (b*pB);
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
		
		/*
		for(; a < b ;) {
			
			a = a + (a+pA);
			b = b + (b + pB);
			System.out.println("Ano: " + anos + " Popula��o pa�s A: " + a + " Popula��o pa�s B: " + b);
						
		}
		*/

	}

}
