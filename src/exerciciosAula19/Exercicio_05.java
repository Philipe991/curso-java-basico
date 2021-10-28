package exerciciosAula19;

public class Exercicio_05 {

	public static void main(String[] args) {
		/*
		 * 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
		 * sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por 
		 * sua posição (ou índice), ou seja: B[i] = A[i] * i.
		 */

		int[] a = new int[10];
		int[] b = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;
			b[i] = a[i]*i;
			
			System.out.println("O valor de a[" + i + "]: " + a[i] + " O valor de b[" + i + "]: " + b[i]);

		}

	}

}
