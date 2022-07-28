
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite suas quatros notas: ");
        float nota1 = teclado.nextFloat();
        float nota2 = teclado.nextFloat();
        float nota3 = teclado.nextFloat();
        float nota4 = teclado.nextFloat();
        
        float media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Sua média é:" +media);
        
        
        
        
        
        
    }
    
}
