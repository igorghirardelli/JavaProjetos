
package exerciciosaula17;

import java.util.Scanner;


public class ExerciciosAula17 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       boolean notavalida = false;
       
       do {
           
        System.out.println("Informe uma nota entre (0- 10)");
        int nota = teclado.nextInt();
       
       if(nota >= 0 && nota <=10)
       {
           notavalida = true;
           System.out.println("Sua nota é: "+nota);
       } else {
           notavalida = false;
           System.out.println("Nota invalida, digite novamente. ");
        } 
       
       } while(notavalida == false );
       
       
    }
    
}
