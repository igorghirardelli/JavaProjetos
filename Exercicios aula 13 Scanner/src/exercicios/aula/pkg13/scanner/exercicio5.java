
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de metros: ");
        double metros = teclado.nextDouble();
        
        double cm = metros * 100;
        
        System.out.println(metros+"m e igual a "+cm +"cm");
        
    }
}
