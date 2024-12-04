import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n, posicao = 0, idade = 0;
		
		do {
			
			System.out.print("Quantas pessoas você vai digitar? ");
			n = scan.nextInt();
			
			String nomes[] = new String[n];
			int idades[] = new int[n];
			
			if(n > 0) {
				
				for(int i = 0; i < n; i++) {
					System.out.println("Dados da " + (i+1) + "ª pessoa:");
					System.out.print("Digite o nome: ");
					scan.nextLine();
					nomes[i] = scan.nextLine();
					System.out.print("Idade: ");
					idades[i] = scan.nextInt();
				}
				
				for(int i = 0; i < n; i++) {
					if(idade < idades[i]) {
						idade = idades[i];
						posicao = i;
					}
				}
				
				System.out.println("\nPESSOA MAIS VELHA: " + nomes[posicao]);
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
