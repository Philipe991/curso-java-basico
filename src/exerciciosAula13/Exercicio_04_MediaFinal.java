// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_04_MediaFinal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as notas do 1º, 2º, 3º e 4º bimestres: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("As sua nota no 1º bimestre foi: " + nota1 + "\nAs sua nota no 2º bimestre foi: " + nota2 + "\nAs sua nota no 3º bimestre foi: " + nota3 + "\nAs sua nota no 4º bimestre foi: " + nota4 + "\nAs sua média final é: " + media);
		
		scan.close();

	}

}
