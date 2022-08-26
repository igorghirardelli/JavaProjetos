
package calculadoraswtichcase;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = teclado.nextInt();
        
        System.out.println("Selecione a operação");
        System.out.println("[1] - Soma ");
        System.out.println("[2] - Subtrair ");
        System.out.println("[3] - Multiplicação ");
        System.out.println("[4] - Divisão ");
        System.out.println(">>>>>>>>>>>>>> Digite sua opção");
        
        
        byte op = teclado.nextByte(); // operação
        double result = 0; //resultado
        
        
        switch (op){
            case 1: result = num1 + num2; break;
            case 2: result = num1 - num2; break;
            case 3: result = num1 * num2; break;
            case 4: result = num1 / num2; break;
            default : System.out.println("Operação invalida"); break; 
                    
        }
        System.out.println("O primeiro numero foi: " +num1);
        System.out.println("O segundo numero foi: " +num2);
        System.out.println("O resultado é: " +result);
      
    }
    
}
