import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n;
		
		do {
			
			System.out.print("Quantas pessoas serão digitadas? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				double altura[] = new double[n];
				char sexo[] = new char[n];
				
				for(int i=0; i < n; i++) {
					System.out.print("Altura da " + (i+1) + "º pessoa: ");
					altura[i] = scan.nextDouble();
					System.out.print("Gênero da " + (i+1) + "º pessoa: ");
					sexo[i] = scan.next().charAt(0);
				}
				
				double maior = altura[0], menor = altura[0], media = 0;
				int contm = 0, contf = 0;
				
				for(int i = 0; i < n; i++) {
					
					if(maior < altura[i]) {
						maior = altura[i];
					}
					
					if(menor > altura[i]) {
						menor = altura[i];
					}
					
					if(sexo[i] == 'F' || sexo[i] == 'f') {
						media += altura[i];
						contf++;
					}
					
					if(sexo[i] == 'M' || sexo[i] == 'm') {
						contm++;
					}
					
				}
				
				System.out.println("\nMenor altura = " + menor);
				System.out.println("Maior altura = " + maior);
				
				if(media != 0) {
					media /= contf;
					System.out.printf("Média das alturas das mulheres = %.2f", media);
				} else {
					System.out.println("\nNenhuma mulher inserida");
				}
				
				if(contm != 0) {
					System.out.println("\nNúmero de homens = " + contm);
				} else {
					System.out.println("\nNenhum homem inserido");
				}
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
