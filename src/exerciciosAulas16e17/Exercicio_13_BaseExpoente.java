package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_13_BaseExpoente {

	public static void main(String[] args) {
		
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao 
		 * segundo número. Não ulitlize a função de potencia da linguagem.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double base, expoente, resultado, potencia;
				
		System.out.println("Informe o valor da base: ");
		base = scan.nextDouble();
		System.out.println("Informe o valor do expoente: ");
		expoente = scan.nextDouble();
		
		resultado = 1;
		
		for(double count = 1 ; count <= expoente ; count++) {

			potencia = resultado * base;
			resultado = potencia;
			
		}
		
		System.out.println("Potencia: " + base + " ^ " + expoente + " = " + resultado);
		
	}

}
