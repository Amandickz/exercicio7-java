import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		do {
			
			System.out.print("Quantos números você vai digitar? ");
			n = scan.nextInt();
			
			if(n > 0 && n <= 10) {
				
				int numeros[] = new int[n];
				
				for (int i = 0; i < n; i++) {
					System.out.print("Digite um número: ");
					numeros[i] = scan.nextInt();
				}
				
				System.out.println("\nNÚMEROS NEGATIVOS");
				
				for(int i = 0; i < n; i++) {
					
					if(numeros[i] < 0) {
						System.out.println(numeros[i]);						
					}
					
				}
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
		System.exit(0);
		
	}

}
