import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n, posicao = 0;
		double maior = 0;
		
		do {
			
			System.out.print("Quantos números você vai digitar? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				double numeros[] = new double[n];
				
				for(int i = 0; i < n; i++) {
					System.out.print("Digite um número: ");
					numeros[i] = scan.nextDouble();
				}
				
				for(int i = 0; i < n; i++) {
					if(maior < numeros[i]) {
						maior = numeros[i];
						posicao = i;
					}
				}
				
				System.out.println("\nMAIOR VALOR = " + maior);
				System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
