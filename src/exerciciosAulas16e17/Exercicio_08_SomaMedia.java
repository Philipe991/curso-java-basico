package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_08_SomaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			soma += num;
			
		}
		
		media = soma / 5;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);

	}

}
