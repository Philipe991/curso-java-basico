//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_20_QuestoesPontuadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Responda as perguntas abaixo com 'sim' ou 'não' (S ou N):");
		System.out.println("Telefonou para a vítima?");
		String p1 = scan.next().toLowerCase();
		System.out.println("Esteve no local do crime?");
		String p2 = scan.next().toLowerCase();
		System.out.println("Mora perto da vítima?");
		String p3 = scan.next().toLowerCase();
		System.out.println("Devia para a vítima?");
		String p4 = scan.next().toLowerCase();
		System.out.println("Já trabalhou com a vítima?");
		String p5 = scan.next().toLowerCase();
		
		if(p1.equals("s")) {
			contador++;
		} if(p2.equals("s")) {
			contador++;
		} if(p3.equals("s")) {
			contador++;
		} if(p4.equals("s")) {
			contador++;
		} if(p5.equals("s")) {
			contador++;
		}
				
		System.out.println("Você respondeu 'Sim' a " + contador + " pergunta(s).");
		
		if(contador == 2) {
			System.out.println("Classificação: Suspeito");
		} else if(contador > 2 && contador <=4) {
			System.out.println("Classificação: Cúmplice");
		} else if(contador > 4) {
			System.out.println("Classificação: Assassino");
		} else {
			System.out.println("Classificação: Inocente");
		}
		
		scan.close();

	}

}
