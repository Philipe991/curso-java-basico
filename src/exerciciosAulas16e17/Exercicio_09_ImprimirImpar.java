package exerciciosAulas16e17;

public class Exercicio_09_ImprimirImpar {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Fa�a um programa imprima na tela apenas os n�meros impares entre 1 e 50.
		 */
		
		double variavel;
		double n1 = 0;
		double n2 = 2;
		
		do {

			variavel = n1 % n2;
			n1++;
						
			if(variavel == 0) {
				System.out.println(n1 + " resto da divis�o: " + variavel);
			}
			
		} while(n1<50);
		
		
		// Resolu��o Loiane
		
		for(int i = 1 ; i <50 ; i++) {
			
			if( i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}

}
