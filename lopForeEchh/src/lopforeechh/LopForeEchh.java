/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lopforeechh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author igora
 */
public class LopForeEchh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas = new int[10];
        
        Random random = new Random(); // gerar numeros aleatorios
        for(int i =0 ; i<notas.length;i++){
            notas[i] = random.nextInt(10);
        }
        
        for(int i = 0; i<notas.length;i++){
            int nota = notas[i];
            System.out.println(nota);
        }
        
        System.out.println("Usando o for each");
        
        for(int nota: notas){
            System.out.println(nota);
        }
               
    }
    
}
