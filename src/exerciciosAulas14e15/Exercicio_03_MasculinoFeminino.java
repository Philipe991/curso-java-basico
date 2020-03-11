//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_03_MasculinoFeminino {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual seu sexo? (Digite 'M' ou 'F')");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("M")) {
			System.out.println("Seu sexo é Masculino!");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Seu sexo é Feminino!");
		} else {
			System.out.println("Sexo inválido!");
		}
		
		scan.close();

	}

}
