
package exercicios.aula.pkg13.scanner;

import java.util.Scanner;


public class exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Entre com o valor/hora ");
        Double valorhora = teclado.nextDouble();
        
        System.out.println("Entre com o valor de horas trabalhadas no mês: ");
        Double horatrab = teclado.nextDouble();
        
        Double salariobruto =  valorhora * horatrab;
        
        Double inss = (salariobruto/100)*8;
        Double sindicato = (salariobruto/100)*5;
        Double imposto =  (salariobruto/100)*11;
        Double toltaldescontos = inss + sindicato + imposto;
        Double salarioliq = salariobruto - toltaldescontos;
        
        
        
        System.out.println("O seu salario bruto desse mês é: "+salariobruto);
        System.out.println("Inss: " +inss);
        System.out.println("Sindicato: " +sindicato);
        System.out.println("Imposto: " +imposto);
        System.out.println("Totaldescontos: "+toltaldescontos);
        System.out.println("salarioliq: "+salarioliq);
        
        
        
        
        
        
        
        
        
    }
}
