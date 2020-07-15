package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_03_ValidarDados {

	public static void main(String[] args) {
		/*
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Fa�a um programa que leia e valide as seguintes informa��es:
		 * 1 - Nome: maior que tr�s caracteres;
		 * 2 - Idade: entre 0 e 150;
		 * 3 - Sal�rio: maior que zero;
		 * 4 - Sexo: 'f' ou 'm';
		 * 5 - Estado civil: 's', 'c', 'v' ou 'd'.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean validaNome, validaIdade, validaSalario, validaSexo, validaEstadoCivil = false;
		
		do {
			System.out.print("Digite seu nome: ");
			nome = scan.next();
			
			if(nome.length()<=3) {
				validaNome = false;
				System.out.println("Seu nome deve conter mais do que tr�s caracteres. Digite novamente o seu nome.");
			} else {
				validaNome = true;
				System.out.println("Nome v�lido!");
			}
		} while (!validaNome);
		
		do {
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
			
			if(idade < 0 || idade >150) {
				validaIdade = false;
				System.out.println("Voc� deve ter entre 0 e 150 anos. Digite novamente a sua idade.");
			} else {
				validaIdade = true;
				System.out.println("Idade v�lida!");
			}
		} while (!validaIdade);
		
		do {
			System.out.print("Digite o seu sal�rio: ");
			salario = scan.nextDouble();
			
			if(salario < 0) {
				validaSalario = false;
				System.out.println("Voc� deve ter um sal�rio maior que zero. Digite novamente o seu sal�rio.");
			} else {
				validaSalario = true;
				System.out.println("Sal�rio v�lido!");
			}
		} while (!validaSalario);
		
		do {
			System.out.print("Digite o seu sexo ('m' ou 'f'): ");
			sexo = scan.next();
			
			if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				validaSexo = true;
				System.out.println("Sexo v�lido!");
			} else {
				validaSexo = false;
				System.out.println("O sexo deve ser 'm' ou 'f'. Digite novamente o seu sexo.");
			}
		} while (!validaSexo);
		
		do {
			System.out.println("Digite o seu estado civil (\n's' - solteiro(a) \n'c' - casado(a) \n'v' - vi�vo(a) \n'd' - divorciado(a)");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") || 
					estadoCivil.equalsIgnoreCase("v") || 
					estadoCivil.equalsIgnoreCase("d")) {
				validaEstadoCivil = true;
				System.out.println("Estado civil v�lido!");
			} else {
				validaEstadoCivil = false;
				System.out.println("O estado civil � inv�lido. Digite novamente o seu estado civil.\n");
			}
		} while (!validaEstadoCivil);
		
		System.out.println("Dados informados:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado c�vil: " + estadoCivil);

	}

}
