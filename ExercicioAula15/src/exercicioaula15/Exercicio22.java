
package exercicioaula15;

import java.util.Scanner;


public class Exercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade(kg) de morangos: ");
        double qtdmorango = teclado.nextDouble();
        
        System.out.println("Entre com a quantidade(kg) de maça: ");
        double qtdmaca = teclado.nextDouble();
        
        double precokgmorango = 0;
        if(qtdmorango <= 5){
            precokgmorango = 2.5;
        }else {
            precokgmorango = 2.2;
        }
        
        double precokgmaca = 0;
        
        if(qtdmaca <= 5){
            precokgmaca = 1.8;
        } else {
            precokgmaca = 1.5;
        }
        
        double precototalmorango = qtdmorango * precokgmorango;
        double precototalmaca = qtdmaca * precokgmaca;
         
        double precoparcial = precokgmorango + precokgmaca; 
        double precototal = precoparcial;
        
        if((qtdmaca + qtdmorango > 8) || precoparcial > 25){
            precototal = precoparcial - ((precoparcial/100)*10);
        }
        System.out.println("Preco total: "+precototal);
        
    }
}
