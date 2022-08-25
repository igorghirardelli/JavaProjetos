
package loopwhiiile;


public class Loopwhiiile {

    
    public static void main(String[] args) {
        int cont = 1;// cont ou i para contador
        int max = 10;// valor maximo
        
        System.out.println("Contando até: "+max);
        while(cont <= max){
            System.out.println("O valor de cont: "+cont);
            cont++;// cont = cont +
        }
        System.out.println(cont); // valor 11
        
        do {
            cont++;
            System.out.println("O valor de cont: "+cont);
            
           } while(cont < 13);
           
            System.out.println(cont);
        
    }
    
}
