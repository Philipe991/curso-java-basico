//Exercícios no link: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15

package exerciciosAulas14e15;

import java.util.Scanner;

public class Exercicio_21_GasolinaAlcool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Com qual combustível deseja abastecer?");
		System.out.println("G - Gasolina");
		System.out.println("A - Álcool");
		
		String combustivel = scan.next();
		
		double valorGasolina = 2.5;
		double valorAlcool = 1.9;
		double valorVenda = 0;
		double valorDesconto = 0;
		double valorTotal = 0;
		
		if(combustivel.equalsIgnoreCase("G") ||  combustivel.equalsIgnoreCase("A")) {
			
			System.out.println("Quantos litros deseja abastecer?");
			double qtde = scan.nextDouble();
				
			if(combustivel.equalsIgnoreCase("G")) {
				
				valorVenda = valorGasolina * qtde;
				
				System.out.println("Valor da gasolina.................: R$" + valorGasolina);
				System.out.println("Quantidade abastecida.............: R$" + qtde);
				System.out.println("Valor da venda....................: R$" + valorVenda);
				
				if(qtde <= 20) {
					
					valorDesconto = valorVenda * 0.04;
					valorTotal = valorVenda - valorDesconto;
					
					System.out.println("(-) Desconto 4%...................: R$" + valorDesconto);
					System.out.println("(=) Valor total...................: R$" + valorTotal);
					
				} else {
					
					valorDesconto = valorVenda * 0.06;
					valorTotal = valorVenda - valorDesconto;
					
					System.out.println("(-) Desconto 6%...................: R$" + valorDesconto);
					System.out.println("(=) Valor total...................: R$" + valorTotal);
									
				}
										
			} else if(combustivel.equalsIgnoreCase("A")){
				
				valorVenda = valorAlcool * qtde;
				
				System.out.println("Valor do álcool....................: R$" + valorAlcool);
				System.out.println("Quantidade abastecida..............: R$" + qtde);
				System.out.println("Valor da venda.....................: R$" + valorVenda);
				
				if(qtde <= 20) {
					
					valorDesconto = valorVenda * 0.03;
					valorTotal = valorVenda - valorDesconto;
				
					System.out.println("(-) Desconto 3%...................: R$" + valorDesconto);
					System.out.println("(=) Valor total...................: R$" + valorTotal);
					
				} else {
					
					valorDesconto = valorVenda * 0.05;
					valorTotal = valorVenda - valorDesconto;
					
					System.out.println("(-) Desconto 5%...................: R$" + valorDesconto);
					System.out.println("(=) Valor total...................: R$" + valorTotal);
								
				}
				
			} 
			
		} else {
			
			System.out.println("Informe um tipo de combustível válido!");
					
		}
		
		scan.close();

	}

}
