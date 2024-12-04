import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n;
		double media = 0;
		
		do {
			
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				double numeros[] = new double[n];
 				
				for(int i = 0; i < n; i++) {
					System.out.print("Digite um número: ");
					numeros[i] = scan.nextDouble();
				}
				
				for(int i = 0; i < n; i++) {
					media += numeros[i];
				}
				
				media /= n;
				
				System.out.println("\nMÉDIA DO VETOR = " + media);
				System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
				
				for(int i = 0; i < n; i++) {
					if(numeros[i] < media) {
						System.out.println(numeros[i]);
					}
				}
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
