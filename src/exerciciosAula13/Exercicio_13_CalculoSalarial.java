// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_13_CalculoSalarial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor do seu salário por hora de trabalho?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas você trabalhou este mês?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = salarioHora * horasTrabalhadas;
		double IR = salarioBruto * 0.11;
		double INSS = salarioBruto * 0.08;
		double contribuicaoSindical = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - IR - INSS - contribuicaoSindical;
		
		System.out.println("");
		System.out.println("HOLERITH");
		System.out.println("Salário por hora: R$" + salarioHora);
		System.out.println("Total de horas mensais: " + horasTrabalhadas);
		System.out.println("(+) Salário bruto..................R$" + salarioBruto);
		System.out.println("(-) IR (11%).......................R$" + IR);
		System.out.println("(-) INSS (8%)......................R$" + INSS);
		System.out.println("(-) Contribuição sindical (5%).....R$" + contribuicaoSindical);
		System.out.println("(=) Salário líquido................R$" + salarioLiquido);
		
		scan.close();
				
	}

}
