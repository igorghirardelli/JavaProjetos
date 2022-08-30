/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosaula17;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o numero para gerar a tabuada ");
        int num = teclado.nextInt();
        
        boolean invalido = true;
        int numfinal;
        int numinicio;
        do {
            System.out.println("Entre com o inicio da tabuada");
        numinicio = teclado.nextInt();
        
        System.out.println("Entre com o final da tabuada ");
         numfinal = teclado.nextInt();
        
        if(numfinal > numinicio){
            invalido = false;
        }
        }while(invalido);
        
        
        
        System.out.println("Tabuada de:" + num + ":");
        System.out.println("Campo por:" + numinicio);
        System.out.println("Termina por:" + numfinal);
        System.out.println();
        
        for(int i = numinicio; i <=numfinal; i++){
            System.out.println(num+ "x" + i + "=" +(num*i));
        }
        
    }
}
