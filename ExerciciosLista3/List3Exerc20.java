package ExerciciosLista3;
import java.util.Scanner;

public class List3Exerc20 {

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			 System.out.println(" Digite um valor: ");
			 float n = leitor.nextFloat();
			 
			 float s =0;
			 
			 for (int i = 1; i<=n;i++) {
				 s=s+1f/i;}
			 
			System.out.println(s);
		
	leitor.close();
	}
	}

