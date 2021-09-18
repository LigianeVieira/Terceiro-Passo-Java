package ExerciciosLista3;


// NÃO CUMPRIDA A FINALIZAÇÃO COM SALARIO NEGATIVO! FECHADO COM 0!!

import java.util.Scanner;

public class List3Exerc12 {
	
	
		public static void main(String[] args) {

			Scanner leitor = new Scanner(System.in);

			System.out.println(" Digite o valor do sálario:");
			float salario = leitor.nextFloat();

			System.out.println(" Digite o numero de filhos:");
			int filhos = leitor.nextInt();

			float maiorsalario=salario;
			float somatorioSalario = salario;
			int somatorioFilhos = filhos;
			int habitantes = 0;
			int quantidade100 = 0;

								
			
			while (salario!=0) {
				
				System.out.println(" Digite o valor do sálario ou 0 para finalizar:");
				salario = leitor.nextFloat();

				System.out.println(" Digite o numero de filhos:");
				filhos = leitor.nextInt();

									
				if (salario > maiorsalario) {
					maiorsalario = salario;}
								
				somatorioSalario += salario;
				somatorioFilhos += filhos;
				habitantes++;
				
				if (salario <= 100) {
					quantidade100++;}
				
			}
			
				System.out.println("Maior salario: " + maiorsalario);
				System.out.println("Media salario: " + somatorioSalario /(float) habitantes);
				System.out.println("Percentual de pessoas com salario até 100: " + (quantidade100* 100) /(float) habitantes+ " %");
				System.out.println("media filhos: " + somatorioFilhos /habitantes);

			
			leitor.close();
		}

	}	

