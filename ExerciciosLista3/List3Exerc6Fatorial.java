package ExerciciosLista3;
import java.util.Scanner;
public class List3Exerc6Fatorial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe um número positivo ");
		int numero = leitor.nextInt();
		
		int fatorial=1;  
		for (int i = 1; i <= numero; i++) {
		  
			  fatorial=fatorial*i;
		  
		  }
	
		System.out.println("O vaor fatorial é: " +fatorial);
		leitor.close();
}
}