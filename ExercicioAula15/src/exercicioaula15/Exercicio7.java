
package exercicioaula15;

import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);    
        
        System.out.println("Insira o primeiro numero:");
        Double num1 = scan.nextDouble();
        System.out.println("Insira o segundo numero:");
        Double num2 = scan.nextDouble();
        System.out.println("Insira o terceiro numero:");
        Double num3 = scan.nextDouble();
        
        if(num1 >= num2 && num1 >= num3){
            System.out.println("Num 1 maior " +num1);
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println("Num 2 maior " +num2);
        } 
        else if(num3 >= num1 && num3 >= num2){
            System.out.println("Num 3 maior " +num3);
        }
        
        
        if(num1 <= num2 && num1 <= num3){
            System.out.println("Num 1 menor " +num1);
        }
        else if(num2 <= num1 && num2 <= num3){
            System.out.println("Num 2 menor " +num2);
        } 
        else if(num3 <= num1 && num3 <= num2){
            System.out.println("Num 3 menor " +num3);
        }
        
        
        
        
        
        
    }
}
