//Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_09_OrdemDecrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe tr�s n�meros distintos:");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		if(n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("Existem n�meros iguais!");
		}
		else if(n1 > n2 && n1 >n3 && n2 > n3) {
			System.out.println("Ordem descrescente: " + n1 + ", " + n2 + ", " + n3);
			System.out.println("primeira valida��o");
		}
		else if(n1 > n2 && n1 >n3 && n3 > n2) {
			System.out.println("Ordem descrescente: " + n1 + ", " + n3 + ", " + n2);
			System.out.println("segunda valida��o");
		}
		else if(n2 > n1 && n2 >n3 && n1 > n3) {
			System.out.println("Ordem descrescente: " + n2 + ", " + n1 + ", " + n3);
			System.out.println("terceira valida��o");
		}
		else if(n2 > n1 && n2 >n3 && n3 > n1) {
			System.out.println("Ordem descrescente: " + n2 + ", " + n3 + ", " + n1);
			System.out.println("quarta valida��o");
		}
		else if(n3 > n1 && n3 >n2 && n2 > n1) {
			System.out.println("Ordem descrescente: " + n3 + ", " + n2 + ", " + n1);
			System.out.println("quinta valida��o");
		}
		else if(n3 > n1 && n3 >n2 && n1 > n2) {
			System.out.println("Ordem descrescente: " + n3 + ", " + n1 + ", " + n2);
			System.out.println("sexta valida��o");
		}
		
		scan.close();

	}

}