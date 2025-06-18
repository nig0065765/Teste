package teste1;

import java.util.Scanner;

public class avaliacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teste = new Scanner(System.in);
		
		//Variável de abertura par controlar o aluno com melhor e pior nota.
		double mediaMelhor = 0;
		String nomeMelhor = "";
		
		double mediaPior = 10;
		String nomePior = "";
		
		//Inicio para indicar a quantidade de repetições, em seguida o System para
		//a leitura do nome.
		for (int a = 1; a <= 10; a++) {
			System.out.println("Digite o nome do Aluno: ");
			String nome = teste.nextLine();
			
			//indicação para iniciar a soma e guardar 4 notas
			//pede a indicação de 4 notas
			double soma = 0;
			for(int n = 1; n <= 4; n++) {
				System.out.println("Digite a nota" + n + ":" );
				double nota = teste.nextDouble();
				
				//somas as 4 notas que foram guardadas
				soma += nota;
			}
		
			teste.nextLine();
	
			//Calcula a média usando a soma e divide por 4
			double media = soma / 4;
			System.out.println("Media de" + nome + ":" + media);
			
			// Verifica a situação do aluno para indicar o caminho que vai seguir baseado no 
			//resultado da media obtida.
			if (media >= 7) {
				System.out.println("Aprovado Guerreiro");
			} else if (media >= 5) {
				System.out.println("Recuperação meu jovem");
			} else {
				System.out.println("Reprovado, estude mais meu jovem gafanhoto");			
			}
			
			//Parte para verificação do pior e melhor aluno, ir fazendo a subscrição e guardar para imprimir no final
			if (media > mediaMelhor) {
				mediaMelhor = media;
				nomeMelhor = nome;
			}
			
			if (media < mediaPior) {
				mediaPior = media;
				nomePior = nome;
			}
			
			//apenas para criar um a separação
			System.out.println(".....");
		}
		
		//indica no final de informar os 10 alunos quem foi o aluno com melhor nota e pior nota.
		System.out.println("Aluno com melhor nota: ");
		System.out.println("Nome: " + nomeMelhor + " Media:" + mediaMelhor);
		
		System.out.println("Aluno com pior nota");
		System.out.println("Nome: " + nomePior + " media" + mediaPior);
		
		teste.close();
			}
<<<<<<< HEAD
}

}
}
=======
	}
>>>>>>> a04c0adcf7d910411574ed8ab2f7de0076234692
