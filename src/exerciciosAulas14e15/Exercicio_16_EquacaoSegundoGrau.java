//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_16_EquacaoSegundoGrau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular as raízes da equação de segundo grau, informe os valores abaixo:");
		System.out.println("Valor de 'a': ");
		double a = scan.nextDouble();
		System.out.println("Valor de 'b': ");
		double b = scan.nextDouble();
		System.out.println("Valor de 'c': ");
		double c = scan.nextDouble();
		
		/* Bhaskara Delta = b² - 4.a.c
		 * x = (-b+-RaisDelta)/2.a
		 */
		
		double raiz1;
		double raiz2;
		double delta = (b*b)-(4*a*c);
				
		if(a == 0) {
			System.out.println("O valor de 'a' é igual a zero! A equação não é de segundo grau.");
		}
		else if(delta == 0) {
			raiz1 = (((-1*b)+Math.sqrt(delta))/(2*a));
			raiz2 = (((-1*b)-Math.sqrt(delta))/(2*a));
			System.out.println("O valor de Delta é: " + delta + " (igual a zero). A equação possui apenas uma raiz real.");
			System.out.println("O valor de 'Delta' é...........: " + delta);
			System.out.println("Raíz ..........................: " + raiz1);
		}
		else if(delta > 0) {
			raiz1 = (((-1*b)+Math.sqrt(delta))/(2*a));
			raiz2 = (((-1*b)-Math.sqrt(delta))/(2*a));
			System.out.println("O valor de Delta é: " + delta + " (maior que zero). A equação possui duas raizes reais.");
			System.out.println("O valor de 'Delta' é...........: " + delta);
			System.out.println("Raíz 1.........................: " + raiz1);
			System.out.println("Raíz 2.........................: " + raiz2);
		}
		else if(delta < 0) {
			System.out.println("O valor de Delta é: " + delta + " (menor que zero). A equação não possui raízes reais.");
		}
		
		scan.close();
		
	}

}
