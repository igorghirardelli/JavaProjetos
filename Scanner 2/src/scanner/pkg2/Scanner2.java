
package scanner.pkg2;

import java.util.Scanner;


public class Scanner2 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        /*System.out.println("Digite seu primeiro nome:");
        String primeironome = teclado.next();
        System.out.println("Seu primeiro nome é: "+primeironome);*/
        
        
      
        System.out.println("Digite seu nome completo:");
        String nomec = teclado.nextLine() ;
        
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();
        
        System.out.println("Digite sua altura");
        Double alt = teclado.nextDouble();
        
        System.out.println("Seu nome é: "+nomec);
        System.out.println("Sua idade é: " +idade);
        System.out.println("Sua altura é:"+alt);
        
        
        
        
    }
      
}    
        
    
    
    
