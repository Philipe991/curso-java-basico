package exerciciosAula19;

public class Exercicio_01 {

	public static void main(String[] args) {
		/*
		 * 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
		 */

		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;
			b[i] = i;
			
			System.out.println("O valor de a[" + i + "]: " + a[i] + " O valor de b[" + i + "]: " + b[i]);

		}

	}

}
