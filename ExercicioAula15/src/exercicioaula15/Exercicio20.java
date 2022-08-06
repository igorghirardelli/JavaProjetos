
package exercicioaula15;

import java.util.Scanner;


public class Exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Telefonou para a vitima?");
        String resp1 = teclado.next();
        
        System.out.println("Esteve no local do crime?");
        String resp2 = teclado.next();
        
        System.out.println("Mora perto da vitima?");
        String resp3 = teclado.next();
        
        System.out.println("Devia para a vitima?");
        String resp4 =  teclado.next();
        
        System.out.println("Já trabalhou com a vitima? ");
        String resp5 =  teclado.next();
        
        int cont = 0;
        
        if(resp1.equalsIgnoreCase("S")){
            cont++;
        }
        if(resp2.equalsIgnoreCase("S")){
            cont++;
        }
        if(resp3.equalsIgnoreCase("S")){
            cont++;
        }
        if(resp4.equalsIgnoreCase("S")){
            cont++;
        }
        if(resp5.equalsIgnoreCase("S")){
            cont++;
        }
        if(cont == 2){
            System.out.println("Suspeito");
        } else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        } else if (cont == 5){
            System.out.println("Assasino");
        } else if (cont == 0){
            System.out.println("Inocente");
        }
        
        
        
        
        
        
    }
    
}
