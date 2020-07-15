package exerciciosAulas16e17;

public class Exercicio_16_FibonacciLimitado {

	public static void main(String[] args) {

		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * A s�rie de Fibonacci � formada pela sequencia 
		 * 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,...
		 * Fa�a um programa que gere a s�rie at� que o valor seja maior que 500.
		 */
		
		int atual = 0, proximo = 1, resultado, limite;
				
		
				for(; 500 >= atual ; ) {
					
					resultado = atual;
					System.out.print(resultado + " ");
					resultado = atual + proximo;
					proximo = atual;
					atual = resultado;
								
				}
		
	}

}
