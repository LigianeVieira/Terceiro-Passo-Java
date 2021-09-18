package ExerciciosLista3;

public class List3Exerc10Perfeitos {

	public static void main(String[] args) {

		int qntidadePerfeitos = 0;
		int numero = 1;
		int soma = 0;

		while (qntidadePerfeitos < 5) {
			soma = 0;

			for (int i = 1; i < numero; i++) {
				if (numero % i == 0) {
					soma += i;
				}
			}
			if (soma == numero) {
				System.out.println(numero);
				qntidadePerfeitos++;
			}
			numero++;
		}

	}

}
