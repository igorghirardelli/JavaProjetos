
package scanner.pkg1;

import java.util.Scanner;


public class Scanner1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.println("digite seu nome e sua idade! ");
        String nome =  teclado.nextLine();
        float nota =  teclado.nextFloat(); 
        System.out.println("seu nome é:" +nome);
        System.out.println("e sua idade é:"+nota);
       
        
        
        
    }
    
}
