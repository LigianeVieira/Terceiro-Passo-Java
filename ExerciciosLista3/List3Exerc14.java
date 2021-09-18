package ExerciciosLista3;

import java.util.Scanner;

public class List3Exerc14 {

public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		int maioridade = 0;
		int menoridade =0;
		float totalsalario = 0;
		int pessoas = 0;
		int qntFem = 0;
		int idade;
		

		do {
			
			System.out.println(" Digite sua idade:");
			idade = leitor.nextInt();
			
			if(idade!=0) {
			
			System.out.println(" Digite seu sexo 1- M ou 2- F:");
			int sexo = leitor.nextInt();
			
			System.out.println(" Digite o valor do sálario: ");
			float salario = leitor.nextFloat();
			
	
			
			totalsalario += salario;
			pessoas++;

			if (idade > maioridade)
				maioridade = idade;

			if (idade < menoridade)
				menoridade = idade;

			if (sexo == 2 && salario <= 100)
				qntFem++;
			}
				
		} while (idade!=0);
		
		
		System.out.println("media de salario da população: " + totalsalario / (float)pessoas);
		System.out.println("maior idade: " + maioridade + " e menor idade:" + menoridade);
		System.out.println("qntidade de mulheres com salario ate 100: " + qntFem);
		
		leitor.close();
	}
}