/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosaula17;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double salario = 1000; //1995
        
        double percentual = 1.5;
        
        salario += (salario/100)*percentual; //1996
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for(int i = 1997; i<=2015; i++){
            
            percentual *= 2;
            
            salario += (salario/100)*percentual;
            
            System.out.println(i+ "=" + format.format(salario) + "-" + percentual +"%");
            
        }
        
        
        
        
        
    }
}
