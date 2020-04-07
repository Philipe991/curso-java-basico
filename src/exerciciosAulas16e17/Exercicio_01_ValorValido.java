package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_01_ValorValido {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Fa�a um programa que pe�a uma nota entre zero e dez. Mostre uma mensagem caso o valor
		 * seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um n�mero entre zero e dez: ");
		double num = scan.nextDouble();
		
		while(num<0 || num>10){
			System.out.print("Inv�lido! Informe um n�mero entre zero e dez: ");
			num = scan.nextDouble();
		}
		

	}

}
