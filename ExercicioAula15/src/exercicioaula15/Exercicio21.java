
package exercicioaula15;

import java.util.Scanner;


public class Exercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de litros vendidos ");
        double litros = teclado.nextDouble();
        
        System.out.println("Entre com o tipo de combustivel ");
        String tipo = teclado.next();
        
        
        double precogas = 2.5;
        double precoalco = 1.90;
        int desc = 0;
        double total = 0;
        double totaldesc = 0;
        
        if(tipo.equalsIgnoreCase("a")){
            if(litros <= 20){
                desc = 3;
            } else {
                desc = 5;
            }
            total = litros * precoalco;
            
        } else if(tipo.equalsIgnoreCase("g")){
            if(litros <= 20){
                desc = 4;
            } else {
                desc = 6 ;
            }
            total = litros * precogas;
        }
        System.out.println("O total sem o desconto foi: "+total);
        totaldesc = (total/100)*desc;
        double precoapagar = total - totaldesc;
        System.out.println("O total de desconto foi: "+totaldesc);
        System.out.println("O valor a ser pago é: " +precoapagar);
        
     
    }
}
