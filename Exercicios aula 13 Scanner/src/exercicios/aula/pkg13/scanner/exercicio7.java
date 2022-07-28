
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o lado do quadrado: ");
        Double lado = teclado.nextDouble();
 
        // area é = lado*lado
        Double area = Math.pow(lado,2);
        
        System.out.println("A area do quadrado é:" +area);
        System.out.println("O dobro da area do quadrado è: "+(area*2));
        
    }
    
}
