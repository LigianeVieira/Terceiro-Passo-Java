package ExerciciosLista3;
public class List3Exerc8 {

	public static void main(String[] args) {	
		
		boolean primo;
		int produtorio=1;

		for (int i = 92; i <= 1478; i++) {
			primo=true;
			
			for (int j = 2; j < i; j++) {
				
				if (i % j==0 ) {
					
					primo=false;
              			}

				if(primo)
				
				produtorio*=i;
				
			System.out.println("O produtorio dos numeros ímpares é: " + produtorio);
		}
	}
}
}