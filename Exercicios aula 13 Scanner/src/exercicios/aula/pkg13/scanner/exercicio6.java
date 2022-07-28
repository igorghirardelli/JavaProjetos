
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercicio6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o raio do circulo ");
        Double raio = teclado.nextDouble();
        
        Double area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A area do circulo é: "+area);
        
        
        
        
        
    }
}
