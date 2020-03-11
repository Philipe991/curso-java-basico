//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_08_Compras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		System.out.println("Preço de cada produto ");
		System.out.println("Produto 1: " + produto1);
		System.out.println("Produto 2: " + produto2);
		System.out.println("Produto 3: " + produto3);
		
		if(produto1 > produto2 && produto1 > produto3 && produto2 > produto3) {
			System.out.println("Compre o produto que custa: R$" + produto3);
			System.out.println("primeira condição");
		}
		else if(produto1 > produto2 && produto1 > produto3 && produto3 > produto2) {
			System.out.println("Compre o produto que custa: R$" + produto2);
			System.out.println("segunda condição");
		}
		else if(produto2 > produto1 && produto2 > produto3 && produto1 > produto3) {
			System.out.println("Compre o produto que custa: R$" + produto3);
			System.out.println("terceira condição");
		}
		else if(produto2 > produto1 && produto2 > produto3 && produto3 > produto1) {
			System.out.println("Compre o produto que custa: R$" + produto1);
			System.out.println("quarta condição");
		}
		else if(produto3 > produto1 && produto3 > produto2 && produto1 > produto2) {
			System.out.println("Compre o produto que custa: R$" + produto2);
			System.out.println("qinta condição");
		}
		else if(produto3 > produto1 && produto3 > produto2 && produto2 > produto1) {
			System.out.println("Compre o produto que custa: R$" + produto1);
			System.out.println("sexta condição");
		}
		
		scan.close();

	}

}
