
package converteridadeemdias;

import java.util.Scanner;


public class ConverterIdadeEmDias {

    
    public static void main(String[] args) {
       Scanner teclado =  new Scanner(System.in);
        
        int anos, meses, dias;
        int idadeEmDias;
        
        System.out.println("Digite a idade em anos");
        anos = teclado.nextInt();
        System.out.println("Digite a idade em meses");
        meses = teclado.nextInt();
        System.out.println("Digite a idade em dias");
        dias = teclado.nextInt();
        idadeEmDias = anos*365 + meses *30 +dias ;
        
        System.out.println("Idade em dias " +idadeEmDias);
    }
    
}
