import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		double soma = 0, media;
		
		do {
			
			System.out.print("Quantos números você vai digitar? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				double numeros[] = new double[n];
				
				for (int i = 0; i < n; i++) {
					System.out.print("Digite um número: ");
					numeros[i] = scan.nextDouble();
				}
				
				System.out.print("\nVALORES:");
				
				for(int i = 0; i < n; i++) {
					System.out.print(" " + numeros[i]);
					soma += numeros[i];
				}
				
				System.out.printf("\nSOMA: %.2f", soma);
				
				media = soma/n;
				
				System.out.printf("\nMEDIA: %.2f", media);
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
		System.exit(0);

	}

}
