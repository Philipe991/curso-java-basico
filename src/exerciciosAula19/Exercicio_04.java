package exerciciosAula19;

public class Exercicio_04 {

	public static void main(String[] args) {
		/*
		 * 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo 
		 * que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, 
		 * ou seja: B[i] = sqrt(A[i]).
		 */

		double[] a = new double[15];
		double[] b = new double[15];

		for (int i = 0; i < a.length; i++) {

			a[i] = i;
			b[i] = Math.sqrt(a[i]);
			
			System.out.println("O valor de a[" + i + "]: " + a[i] + " O valor de b[" + i + "]: " + b[i]);

		}

	}

}
