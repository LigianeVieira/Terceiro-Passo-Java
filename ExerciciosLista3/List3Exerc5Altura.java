package ExerciciosLista3;

import java.util.Scanner;
public class List3Exerc5Altura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Altura do Chico: ");
        float chicoalt = leitor.nextFloat();
        
        System.out.print("Taxa de crescimento Chico: ");
        float chicocm = leitor.nextFloat();
        
        System.out.print("Altura Z�: ");
        float zealt = leitor.nextFloat();
        
        System.out.print("Taxa de crescimento Z�:  ");
        float zecm = leitor.nextFloat();
        
        leitor.close();
        
        int anos = 0;
        
                
        while (zealt <= chicoalt) {
            
            
            chicoalt += (anos * chicocm);
            zealt += (anos * zecm);
            anos++;
        }
        
        System.out.println("Vai levar " + anos + " anos para que Z� ultrapasse Chico");
    }
}