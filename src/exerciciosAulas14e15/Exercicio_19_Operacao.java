//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_19_Operacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual operação deseja realizar?");
		System.out.println("Para soma digite.............'+'");
		System.out.println("Para subtração digite........'-'");
		System.out.println("Para multiplicação digite....'*'");
		System.out.println("Para divisão digite..........'/'");
		String operacao = scan.next().toLowerCase();
				
		if(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
			
			System.out.println("Informe dois números: ");
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			
			double resultado = 0;
					
			if(operacao.equals("+")){
				resultado = n1 + n2;
				System.out.println("A operação escolhida foi 'Soma'!");
			} else if (operacao.equals("-")) {
				resultado = n1 - n2;
				System.out.println("A operação escolhida foi 'Subtração'!");
			} else if (operacao.equals("*")) {
				resultado = n1 * n2;
				System.out.println("A operação escolhida foi 'Multiplicação'!");
			} else if (operacao.equals("/")) {
				resultado = n1 / n2;
				System.out.println("A operação escolhida foi 'Divisão'!");
			}
			
			System.out.println("O resultado da operação é: " + resultado);
			
			if(resultado == 0) {
				
				System.out.println("O número '" + resultado + "' é nulo!");
				
			} else {
				
				if(resultado%2 == 0) {
					System.out.println("O número '" + resultado + "' é par!");
				} else {
					System.out.println("O número '" + resultado + "' é ímpar!");
				}
				
				if(resultado < 0) {
					System.out.println("O número '" + resultado + "' é negativo!");
				} else {
					System.out.println("O número '" + resultado + "' é positivo!");
				}
		
			}
			
		} else {
			System.out.println("Informe uma operação válida!");
		}
		
		scan.close();
		
	}

}
