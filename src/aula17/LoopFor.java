package aula17;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: "+i);
		}
		
		for(int i = 0, j = 10 ; i < j ; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		int count = 0;
		for( ; count < 5 ; ) {
			System.out.println("Valor de count: " + count);
			count+= 2;
		}
		
		/* loop infinito
		 * for(;;);
		 */
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++);
			System.out.println("Valor da soma: " + soma);
			
		int soma2 = 0;
		for(int i = 1; i < 5; soma2 += i++) {
			System.out.println("Valor da soma2: " + soma2);
		}

	}

}