package exerciciosAulas16e17;

import java.util.Scanner;

public class Exercicio_02_Login {

	public static void main(String[] args) {
		/* 
		 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		 * Fa�a um programa que leia um nome de usu�iro e senha e n�o aceite a senha igual ao
		 * nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.
		 */
		
		Scanner scan = new Scanner(System.in);
		String login, senha;
		boolean validarLogin = false;
	
		do {
			System.out.print("Entre com o login: ");
			login = scan.next();
			System.out.print("Entre com a senha: ");
			senha = scan.next();
			if(login.equalsIgnoreCase(senha)) {
				validarLogin = false;
				System.out.println("Login e senha iguais! Entre novamente com os dados.");
			} else {
				validarLogin = true;
				System.out.println("Login realizado com sucesso!");
			}
		} while(!validarLogin);
						
	}
}