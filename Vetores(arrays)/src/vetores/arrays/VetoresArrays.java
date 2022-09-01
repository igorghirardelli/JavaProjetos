/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores.arrays;

/**
 *
 * @author igora
 */
public class VetoresArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double tempdia001 = 31.3;
        double tempdia002 = 32;
        double tempdia003 = 33.7;
        double tempdia004 = 34;
        double tempdia005 = 35;
        
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 35;       
                
        System.out.println("O valor da temperatura do dia 1 é: "+temperaturas[2]);
        
        System.out.println("O tamanho do array é: "+temperaturas.length);
        
        
        
        for(int i = 0; i<temperaturas.length;i++){
            
            System.out.println("O valor da temperatura do dia "+(i+1)+" é : "+temperaturas[i]);
            
        }
        
        for (double temp: temperaturas){
            System.out.println(temp);
        }
        
        
        
        
        
    }
    
}
