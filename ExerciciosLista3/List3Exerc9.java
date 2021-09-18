package ExerciciosLista3;
import java.util.Scanner;
public class List3Exerc9 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
		
 System.out.println(" Digite um valor: ");
 float Numero = leitor.nextFloat();
 
 float e=1;
 float fatorial =1;
 
 for (float i = 1; i <=Numero;i++) {
	 fatorial=1;
	 
	 for(float j =i; j>=1;j--) {
		 fatorial*=j;
		 	 }
	 e+= 1/fatorial;
 }
 leitor.close();
 System.out.println(" O valor de E é: " + e);
	}

}
