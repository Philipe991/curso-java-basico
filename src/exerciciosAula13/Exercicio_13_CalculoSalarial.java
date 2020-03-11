// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_13_CalculoSalarial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor do seu sal�rio por hora de trabalho?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou este m�s?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = salarioHora * horasTrabalhadas;
		double IR = salarioBruto * 0.11;
		double INSS = salarioBruto * 0.08;
		double contribuicaoSindical = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - IR - INSS - contribuicaoSindical;
		
		System.out.println("");
		System.out.println("HOLERITH");
		System.out.println("Sal�rio por hora: R$" + salarioHora);
		System.out.println("Total de horas mensais: " + horasTrabalhadas);
		System.out.println("(+) Sal�rio bruto..................R$" + salarioBruto);
		System.out.println("(-) IR (11%).......................R$" + IR);
		System.out.println("(-) INSS (8%)......................R$" + INSS);
		System.out.println("(-) Contribui��o sindical (5%).....R$" + contribuicaoSindical);
		System.out.println("(=) Sal�rio l�quido................R$" + salarioLiquido);
		
		scan.close();
				
	}

}
