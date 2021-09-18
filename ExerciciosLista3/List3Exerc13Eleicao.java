package ExerciciosLista3;
import java.util.Scanner;
public class List3Exerc13Eleicao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Eleições as opções disponíveis são: 1= CandidatoA; 2= CandidatoB, 3= candidatoC; 4= CandidatoD; 5= Nulo e 6= Branco ou 0 para finalizar");
	
		int total1=0;
		int total2=0;
		int total3=0;
		int total4=0;
		int total5=0;
		int total6=0;
		int voto=0;
		
		do{
			
					
		System.out.print("Informe a opção desejada: ");
		voto = leitor.nextInt();
		
		switch (voto) {
		
		case 1: 
			total1++;
		break;
		case 2: 
			total2++;
		break;
		case 3:
			total3++;
			break;
		case 4:
			total4++;
			break;
		case 5:
			total5++;
			break;
		case 6:
			total6++;
			break;
			default:
				
		}
		}
		while (voto!=0);
		
		
			
		System.out.println("A quantidade de votos no candidatoA:" + total1);
		System.out.println("A quantidade de votos no candidatoB:" + total2);
		System.out.println("A quantidade de votos no candidatoC:" + total3);
		System.out.println("A quantidade de votos no candidatoD:" + total4);
		System.out.println("A quantidade de votos nulos:" + total5);
		System.out.println("A quantidade de votos brancos:" + total6);
		
		leitor.close();
		}
	}

	


