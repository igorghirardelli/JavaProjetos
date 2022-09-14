/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

/**
 *
 * @author igora
 */
public class MatrizesDimensoes {
    public static void main(String[] args) {
        
        int [][][] matriztridimensional = new int [3][3][3];
        
        for(int i = 0; i<matriztridimensional.length; i++){
            for(int j = 0; j<matriztridimensional[i].length;j++){
                for(int k = 0; k<matriztridimensional[i][j].length;k++){
                    System.out.println("i = " +i+ " - j = " +j+ " - k = " +k);
                    matriztridimensional[i][j][k] = i+j+k;
                }
            }   
        }
        
        
        
        
        
        
        int soma = 0;
        int somapares = 0;
        int somaimpares = 0;
        for(int i = 0; i<matriztridimensional.length; i++){ 
            for(int j=0;j<matriztridimensional[i].length;j++){
                for(int k=0; k<matriztridimensional[i][j].length;k++){
                    soma+= matriztridimensional[i][j][k];
                    
                    if(matriztridimensional[i][j][k] % 2 == 0){
                        somapares += matriztridimensional[i][j][k];
                    } else {
                        somaimpares += matriztridimensional[i][j][k];
                    }
                       
                }
            }  
        }
        
        System.out.println("Soma total = "+soma);
        System.out.println("Soma dos pares = "+somapares);
        System.out.println("Soma dos impares = "+somaimpares);
        
        
        
        
        
        
    }
}
