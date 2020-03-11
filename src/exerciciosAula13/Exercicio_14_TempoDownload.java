// Exercícios no link: https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13

package exerciciosAula13;

import java.util.Scanner;

public class Exercicio_14_TempoDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho de arquivo (em MB)?");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Qual a velocidade da internet (em Mbps)?");
		double velocidadeInternet = scan.nextDouble();
		
		double tempoDownload = (tamanhoArquivo / velocidadeInternet) / 60;		
		System.out.println("Tempo de download (em minutos): " + tempoDownload);
		
		scan.close();

	}

}
