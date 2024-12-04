import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			
			System.out.print("Quantos números você vai digitar? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				int vetorA[] = new int[n];
				int vetorB[] = new int[n];
				int vetorC[] = new int[n];
 				
				System.out.println("Digite os valores do vetor A:");
				for(int i = 0; i < n; i++) {
					vetorA[i] = scan.nextInt();
				}
				
				System.out.println("Digite os valores do vetor B:");
				for(int i = 0; i < n; i++) {
					vetorB[i] = scan.nextInt();
				}
				
				for(int i = 0; i < n; i++) {
					vetorC[i] = vetorA[i] + vetorB[i];
				}
				
				System.out.println("VETOR RESULTANTE:");
				for(int i = 0; i < n; i++) {
					System.out.println(vetorC[i]);
				}
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
