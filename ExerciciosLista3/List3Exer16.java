package ExerciciosLista3;

import java.util.Scanner;
public class List3Exer16 {
	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
	
	System.out.println(" Informe a quantidade de termos:");
	int n = leitor.nextInt();
	
	System.out.println("Informe o primeiro  termo:");
	int a1 = leitor.nextInt();
	int soma=a1;	
	System.out.println("Informe a raz�o da progress�o:");
	int r = leitor.nextInt();
	
	System.out.println("Os termos da progress�o aritmetica s�o:");
	System.out.println(a1);
	
	for(int i=0; i<n-1;i++) {
		a1+=r;
		soma+=a1;
		
		System.out.println(a1);
	}
	
	System.out.println("n/Asoma dos termosda progress�o aritmetica foi: "+ soma);
	leitor.close();
}
}


