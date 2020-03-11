// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_09_10_ConversaoGraus {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite: \n1 - Para converter graus Celsius em Farenheit \n2 - Para convertar graus Farenheit em graus Celsius");
		int tipoConversao = scan.nextInt();
		
		if(tipoConversao == 1){
		
			System.out.println("Digite a temperaturam em graus Celsius: ");
			double grausCelsius = scan.nextDouble();
			
			double celsiusParaFarenheit = grausCelsius * 1.8 + 32;
			
			System.out.println(grausCelsius + "° Celsius correspondem a " + celsiusParaFarenheit + "º Farenheit!");	
			
			scan.close();
			
		} else if(tipoConversao == 2) {
			
			System.out.println("Digite a temperaturam em graus Farenheit: ");
			double grausFarenheit = scan.nextDouble();
			
			double farenheitParaCelsius = (grausFarenheit -32) / 1.8;
			
			System.out.println(grausFarenheit + " graus Farenheit correspondem a " + farenheitParaCelsius + " graus Celsius!");			
			
			scan.close();
			
		} else {
			
			System.out.println("Digite um valor válido!");
			
		}
		
	}

}
