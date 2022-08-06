
package exercicioaula15;

import java.util.Scanner;


public class Exercicio12 {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o valor hora");
        double valorhora = teclado.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas");
        double valortrab = teclado.nextDouble();
        
        double salariobruto = valorhora*valortrab;
        
        int percentualir = 0;
                
        if(salariobruto <= 900 ){
            percentualir = 0;
        } else if (salariobruto > 900 && salariobruto <= 1500){
            percentualir = 5;
        } else if (salariobruto > 1500 && salariobruto <= 2500){
            percentualir = 10;
        } else if (salariobruto > 2500){
            percentualir = 20;
        }
         double fgts = (salariobruto/100)*11;
         double inss  = (salariobruto/100)*10;
         double ir = (salariobruto/100)*percentualir;
        double totaldesc = ir + inss; 
        double salarioliq = salariobruto - totaldesc;
        
        System.out.println("Salario bruto: " +salariobruto);
        System.out.println("IR: "+ir);
        System.out.println("INSS: "+inss);
        System.out.println("FGTS: "+fgts);
        System.out.println("Total desconto: "+totaldesc);
        System.out.println("Salario liquido: "+salarioliq);
        
        
        
        
        
        
        
        
        
        
        
    }
}
