package exerciciosAula19;

public class Exercicio_03 {

	public static void main(String[] args) {
		/*
		 * 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
		 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, 
		 * ou seja: B[i] = A[i] * A[I].
		 */

		int[] a = new int[15];
		int[] b = new int[15];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;
			b[i] = a[i]*a[i];
			
			System.out.println("O valor de a[" + i + "]: " + a[i] + " O valor de b[" + i + "]: " + b[i]);

		}

	}

}
