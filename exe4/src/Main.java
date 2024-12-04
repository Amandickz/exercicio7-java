import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n, cont = 0;
		
		do {
			
			System.out.print("Quantos números você vai digitar? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				int numeros[] = new int[n];
				
				for(int i = 0; i < n; i++) {
					System.out.print("Digite um número: ");
					numeros[i] = scan.nextInt();
				}
				
				System.out.println("\nNUMEROS PARES:");
				
				for (int i = 0; i < n; i++) {
					if(numeros[i] % 2 == 0) {
						System.out.print(numeros[i] + "  ");
						cont++;
					}
				}
				
				System.out.println("\n\nQUANTIDADE DE PARES = " + cont);
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
