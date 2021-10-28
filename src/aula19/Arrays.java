package aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 22;
		temperaturas[1] = 22.5;
		temperaturas[2] = 23;
		
		System.out.println("O valor da temperatura do dia 3 �: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " �: " + temperaturas[i]);
		}
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}

	}

}
