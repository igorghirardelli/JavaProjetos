
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercico12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com a sua altura:");
        Double altura = teclado.nextDouble();
        
        //IMC
        Double peso = (72.7 * altura)-58;
        
        System.out.println("O peso ideial é:"+peso);
        
                
    
    }
    
}
