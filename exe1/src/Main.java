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
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
		System.exit(0);
		
	}

}
