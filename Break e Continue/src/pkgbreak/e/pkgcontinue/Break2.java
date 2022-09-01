/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgbreak.e.pkgcontinue;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Break2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com um numero");
        int num = teclado.nextInt();
        System.out.println("Entre com um limite");
        int max = teclado.nextInt();
        
        for(int i = num; i<=max; i++){
            System.out.println(i);
            if(i % 7 == 0){
                continue; // ele é um pouco raro para ser utilizado
                
            }
            System.out.println("O valor de i é: "+i);
        }
        
        
        
        
        
        
        
    }
}
