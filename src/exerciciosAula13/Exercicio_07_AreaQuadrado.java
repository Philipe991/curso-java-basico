// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_07_AreaQuadrado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do quadrado:");
		double base = scan.nextDouble();
		System.out.println("Digite a altura do quadrado:");
		double altura = scan.nextDouble();
		
		double areaQuadrado = base * altura;
		double dobroAreaQuadrado = areaQuadrado *2;
		
		System.out.println("Base do quadrado: " + base);
		System.out.println("Altura do quadrado: " + altura);
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println("O dobro da área do quadrado é: " + dobroAreaQuadrado);
		
		scan.close();
		
	}

}
