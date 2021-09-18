package ExerciciosLista3;
import java.util.Scanner;

public class List3Exerc3CalculoProdutorio {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int numero = 1;
		int produto = 1;

		System.out.println("Digite um valor inteiro positivo ou digite 0 para finalizar a entrada: ");
		numero = leitor.nextInt();

		while (numero != 0) {

			if (numero % 2 == 0 && numero != 0) {

				produto *= numero;

			}
			System.out.println("Digite um valor inteiro positivo ou digite 0 para finalizar a entrada: ");
			numero = leitor.nextInt();
		}
		System.out.println("O valor do produtório é: " +  produto);
		leitor.close();
	}
}

