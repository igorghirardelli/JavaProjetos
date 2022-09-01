/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularfatorial;

/**
 *
 * @author igora
 */
public class CalcularFatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 12;
        long fatorial = 1;
        
        for(int i = 1; i <= numero; i++){
            fatorial*= i;
        }
        System.out.println("O fatorial de " +numero+" é "+fatorial);
    }
    
}
