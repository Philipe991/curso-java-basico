package exerciciosAulas16e17;

public class Exercicio_16_FibonacciLimitado {

	public static void main(String[] args) {

		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * A série de Fibonacci é formada pela sequencia 
		 * 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,...
		 * Faça um programa que gere a série até que o valor seja maior que 500.
		 */
		
		int atual = 0, proximo = 1, resultado = 0;
				
		
				for(; 500 > resultado ; ) {
					
					resultado = atual;
					System.out.print(resultado + " ");
					resultado = atual + proximo;
					proximo = atual;
					atual = resultado;
								
				}
				
				System.out.println();
			/*
				// Resolução Loiane
				
				int primeiro = 1, segundo =1, proximo2 = 0;
				System.out.print(primeiro + " ");
				System.out.print(segundo + " ");
				
				while(proximo2 <= 500) {
					
					proximo2 = primeiro + segundo;
					primeiro = segundo;
					segundo = proximo2;
					System.out.print(proximo2 + " ");
						
				}
			*/	
	}

}
