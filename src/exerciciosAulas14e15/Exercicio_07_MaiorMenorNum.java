//Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_07_MaiorMenorNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros aleat�rios e distintos");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();

		System.out.println("N�meros digitados: " + num1 + ", " + num2 + ", " + num3);
		
		if(num1 == num2 || num1 == num3 || num2 == num3) {
			
			System.out.println("Existem n�meros duplicados!");
			
		} else {
			
			if(num1 > num2 && num1 > num3 && num2 > num3) {
				System.out.println("O maior n�mero �: " + num1);
				System.out.println("O menor n�mero �: " + num3);
				System.out.println("passou na primeira condi��o");
				
			} 
			
			else if (num1 > num2 && num1 > num3 && num3 > num2) {
				System.out.println("O maior n�mero �: " + num1);
				System.out.println("O menor n�mero �: " + num2);
				System.out.println("passou na segunda condi��o");
			} 
			
			else if(num2 > num1 && num2 > num3 && num3 > num1) {
				System.out.println("O maior n�mero �: " + num2);
				System.out.println("O menor n�mero �: " + num1);
				System.out.println("passou na terceira condi��o");
			} 
			
			else if(num2 > num1 && num2 > num3 && num1 > num3) {
				System.out.println("O maior n�mero �: " + num2);
				System.out.println("O menor n�mero �: " + num3);
				System.out.println("passou na quarta condi��o");
			}
			
			else if(num3 > num1 && num3 > num2 && num1 > num2) {
				System.out.println("O maior n�mero �: " + num3);
				System.out.println("O menor n�mero �: " + num2);
				System.out.println("passou na quinta condi��o");
			
			}
			
			else if(num3 > num1 && num3 > num2 && num2 > num1) {
				System.out.println("O maior n�mero �: " + num3);
				System.out.println("O menor n�mero �: " + num1);
				System.out.println("passou na sexta condi��o");
			
			}

			
		}
		
		scan.close();
		
	}

}
