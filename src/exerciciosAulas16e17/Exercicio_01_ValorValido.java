package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_01_ValorValido {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Faça um programa que peça uma nota entre zero e dez. Mostre uma mensagem caso o valor
		 * seja inválido e continue pedindo até que o usuário informe um valor válido.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número entre zero e dez: ");
		double num = scan.nextDouble();
		
		while(num<0 || num>10){
			System.out.print("Inválido! Informe um número entre zero e dez: ");
			num = scan.nextDouble();
		}
		

	}

}
