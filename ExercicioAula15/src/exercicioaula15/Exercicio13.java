
package exercicioaula15;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("Entre com um dia da semana (1-7)");
         int dia = teclado.nextInt();
         
         
         switch(dia){
             case 1: System.out.println("Domingo"); break;
             case 2: System.out.println("Segunda"); break;
             case 3: System.out.println("Terça"); break;
             case 4: System.out.println("Quarta"); break;
             case 5: System.out.println("Quinta"); break;
             case 6: System.out.println("Sexta"); break;
             case 7: System.out.println("Sabado"); break;  
             default:System.out.println("Numero invalido");break;
             
             
             
             
         }
         
         
         
         
         
         
         
         
         
         
    }
    
}
