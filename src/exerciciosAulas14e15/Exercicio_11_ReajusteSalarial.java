//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_11_ReajusteSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu salário:");
		double salario = scan.nextDouble();
		
		double percentual = 0, aumento = 0, reajuste = 0;
		
		if(salario <= 280) {
			percentual = 0.2;
			aumento = salario * percentual;
			reajuste = salario + aumento;
		} else if(salario > 280 && salario <= 700) {
			percentual = 0.15;
			aumento = salario * percentual;
			reajuste = salario + aumento;
		} else if(salario > 700 && salario <= 1500) {
			percentual = 0.1;
			aumento = salario * percentual;
			reajuste = salario + aumento;
		} else if(salario > 1500) {
			percentual = 0.05;
			aumento = salario * percentual;
			reajuste = salario + aumento;
		}
		
		System.out.println("Salário antes do reajuste: R$ " + salario);
		System.out.println("Percentual de reajuste: " + percentual + " %");
		System.out.println("Valor do aumento: R$ " + aumento);
		System.out.println("Salário após o reajuste: R$ " + reajuste);
		
		scan.close();
		
	}
	
}
