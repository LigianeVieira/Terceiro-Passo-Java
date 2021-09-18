package ExerciciosLista3;
import java.util.Scanner;
public class List3Exerc11 {
	

		public static void main(String[] args) {

			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite um número:");
			int numero = leitor.nextInt();

			int qntidadePerfeitos = 0;
			int soma = 0;
	       
			
			while (qntidadePerfeitos < 1) {
				soma = 0;

				for (int i = 1; i < numero; i++) {
					if (numero % i == 0) {
						soma += i;
					}

				}
				
				if (soma == numero) {
					
					qntidadePerfeitos++	;			
				}
				
				
				numero++;

			}
			System.out.println("O numero perfeito é: " +( numero -1));
			leitor.close();
		}

	}

