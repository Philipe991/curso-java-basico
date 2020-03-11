//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_07_MaiorMenorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três números aleatórios e distintos");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();

		System.out.println("Números digitados: " + num1 + ", " + num2 + ", " + num3);
		
		if(num1 == num2 || num1 == num3 || num2 == num3) {
			
			System.out.println("Existem números duplicados!");
			
		} else {
			
			if(num1 > num2 && num1 > num3 && num2 > num3) {
				System.out.println("O maior número é: " + num1);
				System.out.println("O menor número é: " + num3);
				System.out.println("passou na primeira condição");
				
			} 
			
			else if (num1 > num2 && num1 > num3 && num3 > num2) {
				System.out.println("O maior número é: " + num1);
				System.out.println("O menor número é: " + num2);
				System.out.println("passou na segunda condição");
			} 
			
			else if(num2 > num1 && num2 > num3 && num3 > num1) {
				System.out.println("O maior número é: " + num2);
				System.out.println("O menor número é: " + num1);
				System.out.println("passou na terceira condição");
			} 
			
			else if(num2 > num1 && num2 > num3 && num1 > num3) {
				System.out.println("O maior número é: " + num2);
				System.out.println("O menor número é: " + num3);
				System.out.println("passou na quarta condição");
			}
			
			else if(num3 > num1 && num3 > num2 && num1 > num2) {
				System.out.println("O maior número é: " + num3);
				System.out.println("O menor número é: " + num2);
				System.out.println("passou na quinta condição");
			
			}
			
			else if(num3 > num1 && num3 > num2 && num2 > num1) {
				System.out.println("O maior número é: " + num3);
				System.out.println("O menor número é: " + num1);
				System.out.println("passou na sexta condição");
			
			}

			
		}
		
		scan.close();
		
	}

}
