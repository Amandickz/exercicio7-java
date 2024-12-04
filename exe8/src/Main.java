import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n, cont = 0;
		double media = 0;
		
		do {
			
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = scan.nextInt();
			
			int numeros[] = new int[n];
			
			if(n > 0) {
				
				for(int i = 0; i < n; i++) {
					System.out.print("Digite um número: ");
					numeros[i] = scan.nextInt();
				}
				
				for(int i = 0; i < n; i++) {
					if(numeros[i] % 2 == 0) {
						media += numeros[i];
						cont++;
					}
				}
				
				if(cont == 0) {
					System.out.println("NENHUM NÚMERO PAR");
				} else {
					media /= cont;
					System.out.println("MÉDIA DOS PARES = " + media);
				}
				
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
