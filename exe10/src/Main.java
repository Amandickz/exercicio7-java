import java.util.Scanner;

import classes.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n;
		String nome;
		double nota1, nota2;
		
		do {
			
			System.out.print("Quantos alunos seão digitados? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				Aluno alunos[] = new Aluno[n];
				
				for(int i = 0; i < n; i++) {
					System.out.println("Digite nome, primeira e segunda nota do 1o aluno:");
					nome = scan.nextLine();
				}
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
