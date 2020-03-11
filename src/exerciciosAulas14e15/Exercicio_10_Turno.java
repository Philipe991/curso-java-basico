//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_10_Turno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual turno vc estuda? (M, V ou N)");
		String turno = scan.next().toLowerCase();
		
		
		System.out.println(turno);
		
		if(turno.equals("m") || turno.equals("v") || turno.equals("n")) {

			switch(turno) {
			case "m": System.out.println("Bom dia!"); break;
			case "v": System.out.println("Boa tarde!"); break;
			case "n": System.out.println("Boa noite!"); break;
			}

		} else {
		 System.out.println("Valor inválido!");
		}
		
		scan.close();

	}

}
