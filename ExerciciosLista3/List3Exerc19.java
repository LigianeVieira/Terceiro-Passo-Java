package ExerciciosLista3;

import java.util.Scanner;

public class List3Exerc19 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int idade = 0;

		int maioridade = 0;
		int qnt = 0;

		do {

			System.out.println(" Digite a sua idade: ou numero negativo para finalizar");
			idade = leitor.nextInt();

			System.out.println(" Digite seu sexo: 1=Masculino e 2=Feminino:");
			int sexo = leitor.nextInt();

			System.out.println(" Digite a cor dos olhos: 3= Azuis; 4= Verdes ou 5= Castanhos:");
			int olhos = leitor.nextInt();

			System.out.println(" Digite a cor dos cabelos: 6= Loiros; 7= Castanhos ou 8= Pretos:");
			int cabelos = leitor.nextInt();

			if (idade > maioridade) {
				maioridade = idade;
			}

			if ((sexo == 2) && (idade >= 18 && idade <= 35) && (olhos == 4 && cabelos == 6))
				qnt++;

		} while (idade > 0);

		System.out.println("A maior idade é: " + maioridade);
		System.out.println(
				"a quantidade mulheres com idade entre 18 e 35 anos, de olhos verdes e cabelos loiros: " + qnt);

		leitor.close();
	}
}