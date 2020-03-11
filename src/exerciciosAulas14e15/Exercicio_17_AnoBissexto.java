//Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_17_AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos verificar se um ano � bissexto, informe um ano: ");
		int ano = scan.nextInt();
		
		if(ano%4 == 0) {
			if(ano%100 != 0) {
				System.out.println("O ano � bissexto! � divis�vel por 4 e por 100.");
			} else {
				System.out.println("O ano n�o � bissexto! � divis�vel por 4, mas n�o � divis�vel por 100.");
			}
		} else if (ano%400 == 0) {
			System.out.println("O ano � bissexto! N�o � divis�vel por 4, mas � divis�vel por 400.");
		} else {
			System.out.println("O ano n�o � bissexto! N�o � divis�vel por 4, nem por 400.");
		}
		
		scan.close();

	}

}
