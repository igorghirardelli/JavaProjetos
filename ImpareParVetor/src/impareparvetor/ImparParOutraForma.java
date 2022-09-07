/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impareparvetor;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class ImparParOutraForma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor;
                
           System.out.println("Informe um numero ");
           valor = teclado.nextInt();
        
        
            if(valor % 2 == 0){
                System.out.print("O "+valor+" é par ");
            }else{
                System.out.println("O "+valor+" é impar");
            }
            
        }
        
    }

