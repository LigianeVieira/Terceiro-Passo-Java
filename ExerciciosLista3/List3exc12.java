package ExerciciosLista3;

	import java.util.Scanner;
	public class List3exc12 {
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        System.out.print(" Digite o salário: ");
	        float salario = leitor.nextFloat();
	        
	        System.out.print(" Digite o número de filhos: ");
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
	            
	            System.out.print(" Digite o salário: ");
	            salario = leitor.nextFloat();
	            
	            System.out.print(" Digite o número de filhos: ");
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
	            System.out.print(" Digite o salário: ");
	            salario = leitor.nextInt();
	            
	            System.out.print(" Digite o número de filhos: ");
	            filhos = leitor.nextInt();
	            
	            
	            
	            
	        }
	        
	        leitor.close();
	        System.out.println(" Média salário: "+ somaSalario/(float)quant);
	        System.out.println(" Média nº filhos: "+ contadorFilhos/(float)quant);
	        System.out.println(" % Salario R$100,00: "+ percentual + " % ");
	        System.out.println(" O maior salário é: "+ maiorSalario);
	    }
	}

