package exerciciosAula19;

public class Exercicio_06 {

	public static void main(String[] args) {
		/*
		 * 6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada 
		 * elemento de C é a soma dos respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].
		 */

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;
			b[i] = i;
			c[i] = a[i] + b[i];
			
			System.out.println("O valor de a[" + i + "]: " + a[i] + " O valor de b[" + i + "]: " + b[i] + " O valor de c[" + i + "]: " + c[i]);

		}

	}

}
