package ExerciciosLista3;

	import java.util.Scanner;
	public class List3exc12 {
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        System.out.print(" Digite o sal�rio: ");
	        float salario = leitor.nextFloat();
	        
	        System.out.print(" Digite o n�mero de filhos: ");
	        int filhos = leitor.nextInt();
	        
	                
	        int contadorFilhos = 0;
	        float somaSalario = 0;
	        int quant = 1;
	        int salario100 = 0;
	        float percentual = 0;
	        float maiorSalario = salario;
	        
	        do {
	            
	            if(salario>=maiorSalario) {
	                maiorSalario=salario;
	            }
	            
	            System.out.print(" Digite o sal�rio: ");
	            salario = leitor.nextFloat();
	            
	            System.out.print(" Digite o n�mero de filhos: ");
	            filhos = leitor.nextInt();
	        }
	        while(salario<=0); {
	            contadorFilhos += filhos;
	            somaSalario += salario;
	            quant ++;
	            
	            if (salario <= 100) {
	                salario100 ++;
	                percentual = (salario100/(float)quant)*100;
	            }
	            System.out.print(" Digite o sal�rio: ");
	            salario = leitor.nextInt();
	            
	            System.out.print(" Digite o n�mero de filhos: ");
	            filhos = leitor.nextInt();
	            
	            
	            
	            
	        }
	        
	        leitor.close();
	        System.out.println(" M�dia sal�rio: "+ somaSalario/(float)quant);
	        System.out.println(" M�dia n� filhos: "+ contadorFilhos/(float)quant);
	        System.out.println(" % Salario R$100,00: "+ percentual + " % ");
	        System.out.println(" O maior sal�rio �: "+ maiorSalario);
	    }
	}

