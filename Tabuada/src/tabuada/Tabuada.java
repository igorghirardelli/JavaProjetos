/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tabuada;
        String resp =  "";
        
        do{
        System.out.println("Digite o numero para fazer a tabuada ");
        tabuada = teclado.nextInt();
        
        for(int i = 1; i<=10;i++){
            //System.out.println("Tabuada do = "+tabuada);
            System.out.print(i+ " x " +tabuada+ " = ");
            System.out.println(i * tabuada);
            
        }
        
        
            System.out.println("Deseja fazer uma nova consulta? (sim/nao)");
            resp = teclado.next();
        
        
        }while(resp.contains("sim"));
        
    }
    
}
