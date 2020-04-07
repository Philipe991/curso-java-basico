package aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		// O comando While avalia uma expressão e enquanto a expressão for verdadeira o comando é executado.
		
		int i = 0;
		
		while(i<=10) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		/*
		 * 'do while'
		 * Esse comando executa o bloco dentro do comando 'do' e depois avalia a expressão. O bloco deixa de ser executado após
		expressão ficar falsa.
		*/
		
		System.out.println(i);
		
		do {
			i++;
			System.out.println("Valor de i: " +i);
		} while (i<13);
		
		System.out.println(i);

	}

}
