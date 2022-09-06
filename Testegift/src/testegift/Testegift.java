
package testegift;

import java.util.Scanner;


public class Testegift {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    String answer = "";
    do {
        double n1, n2;
        System.out.println("Digite o valor da nota 1 e da nota 2: ");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();

        double nf = (n1 + n2) / 2;
        System.out.printf("Nota final = %.2f \n", nf);

        if (nf < 6) {
            System.out.println("Reprovado.");

        } else {
            System.out.println("Aprovado.");
        }
        System.out.println();
        System.out.println("Deseja continuar (sim/nao)?");
        answer = ler.next();
        System.out.println();

    } while (answer.equalsIgnoreCase("sim"));
        
    }

    
}
