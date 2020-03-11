//Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_16_EquacaoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular as ra�zes da equa��o de segundo grau, informe os valores abaixo:");
		System.out.println("Valor de 'a': ");
		double a = scan.nextDouble();
		System.out.println("Valor de 'b': ");
		double b = scan.nextDouble();
		System.out.println("Valor de 'c': ");
		double c = scan.nextDouble();
		
		/* Bhaskara Delta = b� - 4.a.c
		 * x = (-b+-RaisDelta)/2.a
		 */
		
		double raiz1;
		double raiz2;
		double delta = (b*b)-(4*a*c);
				
		if(a == 0) {
			System.out.println("O valor de 'a' � igual a zero! A equa��o n�o � de segundo grau.");
		}
		else if(delta == 0) {
			raiz1 = (((-1*b)+Math.sqrt(delta))/(2*a));
			raiz2 = (((-1*b)-Math.sqrt(delta))/(2*a));
			System.out.println("O valor de Delta �: " + delta + " (igual a zero). A equa��o possui apenas uma raiz real.");
			System.out.println("O valor de 'Delta' �...........: " + delta);
			System.out.println("Ra�z ..........................: " + raiz1);
		}
		else if(delta > 0) {
			raiz1 = (((-1*b)+Math.sqrt(delta))/(2*a));
			raiz2 = (((-1*b)-Math.sqrt(delta))/(2*a));
			System.out.println("O valor de Delta �: " + delta + " (maior que zero). A equa��o possui duas raizes reais.");
			System.out.println("O valor de 'Delta' �...........: " + delta);
			System.out.println("Ra�z 1.........................: " + raiz1);
			System.out.println("Ra�z 2.........................: " + raiz2);
		}
		else if(delta < 0) {
			System.out.println("O valor de Delta �: " + delta + " (menor que zero). A equa��o n�o possui ra�zes reais.");
		}
		
		scan.close();
		
	}

}
