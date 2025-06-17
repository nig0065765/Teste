package teste1;

import java.util.Scanner;

public class avaliacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teste = new Scanner(System.in);
		
		double mediaMelhor = 10;
		String nomeMelhor = "";
		
		double mediaPior = 0;
		String nomePior = "";
		
		for (int a = 1; a <= 10; a++) {
			System.out.println("Digite o nome do Aluno: ");
			String nome = teste.nextLine();
			
			double soma = 0;
			for(int n = 1; n <= 4; n++) {
				System.out.println("Digite a nota" + n + ":" );
				double nota = teste.nextDouble();
				
				soma += nota;
			}
		
			teste.nextLine();
		
			double media = soma / 4;
			System.out.println("Media de" + nome + ":" + media);
			
			if (media >= 7) {
				System.out.println("Aprovado Guerreiro");
			} else if (media >= 5) {
				System.out.println("Recuperação meu jovem");
			} else {
				System.out.println("Reprovado, estude mais meu jovem gafanhoto");			
			}
			
			if (media > mediaMelhor) {
				mediaMelhor = media;
				nomeMelhor = nome;
			}
			
			if (media < mediaPior) {
				mediaPior = media;
				nomePior = nome;
			}
			
			System.out.println(".....");
		}
		
		System.out.println("Aluno com melhor nota: ");
		System.out.println("Nome: " + nomeMelhor + " Media:" + mediaMelhor);
		
		System.out.println("Aluno com pior nota");
		System.out.println("Nome: " + nomePior + " media" + mediaPior);
		
		teste.close();
			}
	}


	}

}
