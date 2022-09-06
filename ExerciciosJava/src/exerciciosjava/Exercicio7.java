/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double sal;
        double nsal = 0;//salariofinal
        int dep;
        String resp = "";
        do{
        System.out.println("Nome do funcionaro: ");
        nome = teclado.next();
        
        System.out.println("Salario do funcionario: ");
        sal = teclado.nextDouble();
        
        System.out.println("Qunatidade de depedencias: ");
        dep = teclado.nextInt();
        
        switch (dep){
        
            case 1,2,3 : nsal = sal +(sal*10/100);break; 
            case 4,5,6 : nsal = sal +(sal*18/100);break;
            default: System.out.println("Operação invalida"); break;
            
        }
         System.out.println("O novo salario de "+nome+ "sera de R$" +nsal);
            System.out.println("");
            System.out.println("Deseja fazer uma nova consulta? (sim/nao)");
            resp = teclado.next();
        }while(resp.contains("sim"));
    }
}
