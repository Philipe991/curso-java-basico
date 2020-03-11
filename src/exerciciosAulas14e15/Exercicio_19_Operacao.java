//Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_19_Operacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual opera��o deseja realizar?");
		System.out.println("Para soma digite.............'+'");
		System.out.println("Para subtra��o digite........'-'");
		System.out.println("Para multiplica��o digite....'*'");
		System.out.println("Para divis�o digite..........'/'");
		String operacao = scan.next().toLowerCase();
				
		if(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
			
			System.out.println("Informe dois n�meros: ");
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			
			double resultado = 0;
					
			if(operacao.equals("+")){
				resultado = n1 + n2;
				System.out.println("A opera��o escolhida foi 'Soma'!");
			} else if (operacao.equals("-")) {
				resultado = n1 - n2;
				System.out.println("A opera��o escolhida foi 'Subtra��o'!");
			} else if (operacao.equals("*")) {
				resultado = n1 * n2;
				System.out.println("A opera��o escolhida foi 'Multiplica��o'!");
			} else if (operacao.equals("/")) {
				resultado = n1 / n2;
				System.out.println("A opera��o escolhida foi 'Divis�o'!");
			}
			
			System.out.println("O resultado da opera��o �: " + resultado);
			
			if(resultado == 0) {
				
				System.out.println("O n�mero '" + resultado + "' � nulo!");
				
			} else {
				
				if(resultado%2 == 0) {
					System.out.println("O n�mero '" + resultado + "' � par!");
				} else {
					System.out.println("O n�mero '" + resultado + "' � �mpar!");
				}
				
				if(resultado < 0) {
					System.out.println("O n�mero '" + resultado + "' � negativo!");
				} else {
					System.out.println("O n�mero '" + resultado + "' � positivo!");
				}
		
			}
			
		} else {
			System.out.println("Informe uma opera��o v�lida!");
		}
		
		scan.close();
		
	}

}
