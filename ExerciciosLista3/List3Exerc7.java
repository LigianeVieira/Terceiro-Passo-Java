package ExerciciosLista3;
import java.util.Scanner;
public class List3Exerc7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe um n�mero positivo ");
		int A = leitor.nextInt();
		
		System.out.print("Informe outro n�mero positivo ");
		int B = leitor.nextInt();
		
		
		int fatorial=1;  
		for (int i = 1; i <= A; i++) {
		  
			  fatorial=fatorial*i;}
			 
			  if (B==fatorial) 
			  
			System.out.println( "O segundo � fatorial do primeiro");
			  else {
				  System.out.println("n�o � fatorial");
			  }
			  leitor.close();
}

	}
