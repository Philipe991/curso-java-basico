// Exerc�cios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_04_MediaFinal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe as notas do 1�, 2�, 3� e 4� bimestres: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("As sua nota no 1� bimestre foi: " + nota1 + "\nAs sua nota no 2� bimestre foi: " + nota2 + "\nAs sua nota no 3� bimestre foi: " + nota3 + "\nAs sua nota no 4� bimestre foi: " + nota4 + "\nAs sua m�dia final �: " + media);
		
		scan.close();

	}

}
