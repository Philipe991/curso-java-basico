package exerciciosAulas16e17;

public class Exercicio_09_ImprimirImpar {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Faça um programa imprima na tela apenas os números impares entre 1 e 50.
		 */
		
		double variavel;
		double n1 = 0;
		double n2 = 2;
		
		do {

			variavel = n1 % n2;
			n1++;
						
			if(variavel == 0) {
				System.out.println(n1 + " resto da divisão: " + variavel);
			}
			
		} while(n1<50);
		
		
		// Resolução Loiane
		
		for(int i = 1 ; i <50 ; i++) {
			
			if( i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}
