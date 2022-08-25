
package sistemacolegio;

import java.util.Scanner;


public class SistemaColegio {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("------------------------------------");
        System.out.println("Bem vindos ao colégio Santo Antonio");
        System.out.println("-------------------------------------");
        
        System.out.println("Digite seu nome");
        String nome = teclado.nextLine();
        
        System.out.println("Digite sua primeira nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        String ap = "";
        if(media >= 9 && media <= 10){
            
            ap = "A";
        } else if(media >= 6){
                      
            ap = "B";
        } else if(media <6 ){
            
            ap = "C";
        }
        System.out.println("Ola: "+nome);
        System.out.println("Sua primeira nota foi: " +nota1);
        System.out.println("Sua segunda nota foi: " +nota2);
        System.out.println("Aproveitamento: " +ap);
        System.out.println("A sua média final foi : " +media);
       
        
        switch(ap){
        case "A": System.out.println("Parabéns por conquistar as notas mais altas e por passar de ano"); break;
        case "B": System.out.println("Parabéns por garantir a sua aprovação"); break;
        case "C": System.out.println("Você reprovou de ano, sinto muito"); break;
    }
        
    }
    
}
