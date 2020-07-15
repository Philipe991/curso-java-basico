package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_14_DezNum {

	public static void main(String[] args) {
		
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Faça um programa que peça dez números inteiros, calcule e mostre a quantidade de números pares e a quantidade
		 * de números impares.
		 */
		
		Scanner scan = new Scanner(System.in);

		int []n;
		n = new int[10];
		int count = 0;
		int impar = 0, par = 0;
		
		System.out.println("Digite 10 números inteiros\n");

		for(; count <= 9; count ++) {
			
			int numero = count+1;
			System.out.println("Digite o número "+ numero + " :");
			n[count] = scan.nextInt();
			
			if(n[count]%2 == 0) {
				impar++;
			} else if (n[count]%2 != 0) {
				par++;
			}
			
		}
		
		System.out.println("Os números informados foram:");
		
		for(int i = 0; i <=9 ; i++) {
			System.out.print(n[i] + " ");
		}
		
		System.out.println("\n\nQuantidade de número ímpares: " + impar);
		System.out.println("Quantidade de número pares: " + par);
		
	}

}
