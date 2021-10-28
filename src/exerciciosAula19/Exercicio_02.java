package exerciciosAula19;

public class Exercicio_02 {

	public static void main(String[] args) {
		/*
		 * 2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho 
		 * e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.
		 */

		int[] a = new int[8];
		int[] b = new int[8];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;
			b[i] = a[i]*2;
			
			System.out.println("O valor de a[" + i + "]: " + a[i] + " O valor de b[" + i + "]: " + b[i]);

		}

	}

}
