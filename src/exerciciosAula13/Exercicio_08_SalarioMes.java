// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_08_SalarioMes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da sua hora de trabalho?");
		double valorHoraTrabalho = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou no m�s?");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.println("O seu sal�rio ser�: R$" + valorHoraTrabalho * horasTrabalhadas);
		
		scan.close();
						
	}

}
