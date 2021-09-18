package ExerciciosLista3;
import java.util.Scanner;

public class List3Exerc4 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite numero inteiro positivo: ");
		int numero = leitor.nextInt();

		int maior = numero;
		int menor = numero;
		int soma = numero;

		for (int i = 1; i < 10; i++) {

			System.out.println("Digite numero inteiro positivo: ");
			numero = leitor.nextInt();

			soma += numero;

			if (numero > maior) {
				maior = numero;
			}

			if (numero < menor) {
				menor = numero;
			}

		}

		System.out.println("o maior numero foi: " + maior);
		System.out.println("o menor numero foi: " + menor);
		System.out.println("A média foi: " + soma / 10f);
		
		leitor.close();

	}
}



