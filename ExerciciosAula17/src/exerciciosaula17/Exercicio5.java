
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double popA;
        double popB;
        double taxaA;
        double taxaB;
        
        boolean valido = false;
        do {
            System.out.println("Entre com a população A:");
            popA = teclado.nextDouble();
            
            
            if(popA > 0 ){
                valido = true; 
            } else {
                valido = false;
                System.out.println("População A precisa ser maior que 0");
            }
              
        } while(!valido);
        
        valido = false;
        do {
            System.out.println("Entre com a população B:");
            popB = teclado.nextDouble();
            
            
            if(popB > 0 ){
                valido = true; 
            } else {
                valido = false;
                System.out.println("População B precisa ser maior que 0");
            }
              
        } while(!valido);
        
        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = teclado.nextDouble();
            
            
            if(taxaA > 0 ){
                valido = true; 
            } else {
                valido = false;
                System.out.println("a taxa de crescimento A precisa ser maior que 0");
            }
              
        } while(!valido);
        
        valido = false;
        do {
            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaB = teclado.nextDouble();
            
            
            if(taxaB > 0 ){
                valido = true; 
            } else {
                valido = false;
                System.out.println("a taxa de crescimento B precisa ser maior que 0");
            }
              
        } while(!valido);
        
     
        
        int cont = 0;
        
        while(popA < popB){
            popA += (popA/100) *taxaA;
            popB +=(popB/100) *taxaB;
            cont++;
        }
        
        System.out.println("PopulaçãoA: "+popA);
        System.out.println("PopulaçãoB: "+popB);
        System.out.println("Quantidade de anos: "+cont);  
        
        
    }
}
