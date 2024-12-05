import java.util.Scanner;

import classes.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n;
		String nome;
		double nota1, nota2, media;
		
		do {
			
			System.out.print("Quantos alunos seão digitados? ");
			n = scan.nextInt();
			
			if(n > 0) {
				
				Aluno alunos[] = new Aluno[n];
				
				for(int i = 0; i < n; i++) {
					System.out.println("Digite nome, primeira e segunda nota do "+ (i+1) +"º aluno:");
					scan.nextLine();
					nome = scan.nextLine();
					nota1 = scan.nextDouble();
					nota2 = scan.nextDouble();
					
					alunos[i] = new Aluno(nome, nota1, nota2);
				}
				
				System.out.println("\n\nALUNOS APROVADOS:");
				
				for(int i = 0; i < n; i++) {
					media = (alunos[i].getNota1() + alunos[i].getNota2()) / 2;
					
					if(media >= 6.0) {
						System.out.println(alunos[i].toString());
					}
				}
				
				break;
			} else {
				System.out.println("\nQuantidade inválida! Digite novamente!");
			}
			
		}while(true);
		
	}

}
