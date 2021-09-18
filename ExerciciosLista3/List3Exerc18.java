package ExerciciosLista3;

import java.util.Scanner;

public class List3Exerc18 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int m = leitor.nextInt();

		int qnt = 0;
		int fatorial = 1;
		int soma = 0;

		if (m % 2 == 0) {
			
			for (int i = 1; i <= m; i++) {
				qnt++;
			}

		System.out.println("Quantidade de divisores é: " + qnt);}

	if (m % 2 != 0) {

		if (m < 10) {
			for (int i = 1; i <= m; i++)
				fatorial = fatorial * i;

			System.out.println("Numero impar  valor fatorial é: " + fatorial);
		} else {
			if (m >= 10) {

				for (int i = 1; i <= m; i++)
					soma += i;
			}
			System.out.println("soma dos inteiros é " + soma);
		}
	}
		
		

		leitor.close();
	}
}