import java.util.Scanner;

import classes.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n, cont = 0;
		double altura_media = 0, porcentagem;
		String nome;
		int idade;
		double altura;
		
		do {
			
			System.out.print("Quantos pessoas serão digitadas? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				Pessoa pessoas[] = new Pessoa[n];
				
				for(int i = 0; i < n; i++) {
					
					System.out.printf("\nDados da %dª pessoa\n", (i+1));
					System.out.print("Nome: ");
					scan.nextLine();
					nome = scan.nextLine();
					System.out.print("Idade: ");
					idade = scan.nextInt();
					System.out.print("Altura: ");
					altura = scan.nextDouble();
					
					pessoas[i] = new Pessoa(nome, idade, altura);
				}
				
				for(int i = 0; i < n; i++) {
					altura_media += pessoas[i].getAltura();
					
					if(pessoas[i].getIdade() < 16) {
						cont++;
					}
				}
				
				altura_media /= n;
				porcentagem = (cont * 100)/n;
				
				System.out.printf("\nAltura Média: %.2f", altura_media);
				System.out.printf("\nPessoas com menos de 16 anos: %.1f %%\n", porcentagem);
				
				for(int i = 0; i < n; i++) {
					if(pessoas[i].getIdade() < 16) {
						System.out.println(pessoas[i].getNome());
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
