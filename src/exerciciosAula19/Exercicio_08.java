package exerciciosAula19;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos
		 * elementos em A e B, ou seja:
		 * C[i] = A[i] * B[i]
		 */ 
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = i;
			b[i] = i+1;
			c[i] = a[i] * b[i];
			
			System.out.println("'A' = " + a[i] + " 'B' = " + b[i] + " 'C' = " + c[i] );
			
		}

	}

}
