
package exercicioaula15;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma letra:");
        String letra = scan.next();
        
        switch(letra){
            case "a":           
            case "e":           
            case "i":           
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "U":System.out.println("vogal"); break;
            default: System.out.println("consoante");  
        }
        
        
        
        
        
        
        
        
        
    }
    
}
