package ExerciciosLista3;
import java.util.Scanner;

public class List3Exerc15MediaP {

	public static void main(String args[]) {


		System.out.print("Digite seu código de aluno : ");
		Scanner leitor = new Scanner(System.in);
		int cod = leitor.nextInt();
		
		while (cod > 0 || cod==0) {

			
			System.out.print("Digite sua primeira nota: ");
			float nota1 = leitor.nextFloat();

			System.out.print("Digite sua segunda nota: ");
			float nota2 = leitor.nextFloat();

			System.out.print("Digite sua terceira nota: ");
			float nota3 = leitor.nextFloat();

			float media1 = (nota1 * 4 + nota2 * 3 + nota3 * 3) / 10;
			float media2 = (nota2 * 4 + nota1 * 3 + nota3 * 3) / 10;
			float media3 = (nota3 * 4 + nota1 * 3 + nota2 * 3) / 10;

			if (media1 >= 5 || media2 >= 5 || media3 > 5) {
				System.out.println("Código aluno: " + cod);
				System.out.println("notas: " + nota1 + ", " + nota2 + " e " + nota3);
				System.out.println("Aprovado");
			}

			else {
				System.out.println("Código aluno: " + cod);
				System.out.println("notas: " + nota1 + ", " + nota2 + " e " + nota3);
				System.out.println(("Reprovado"));
			}
			System.out.print("Digite o próximo código de aluno ou digite um número negativo para finalizar: ");
			cod = leitor.nextInt();
		}
leitor.close();
	}
}
