
package operadores.aritimeticos;


public class OperadoresAritimeticos {

   
    public static void main(String[] args) {
        
        int resultado = 1+2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado*2;
        System.out.println(resultado);
        
        resultado  = resultado/2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado %7;
        System.out.println(resultado);
        
        String primeironome = "Esta é ";
        String segundonome= "Uma String concatenada";
        
       String terceironome = primeironome+segundonome;
       System.out.println(terceironome);
                
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        
        System.out.println(resultado++);
        //mesma coisa que
       //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado+=1;
        
        System.out.println(++resultado);
        //mesma coisa que
        //resultado+=1;
        //System.out.println(resultado);
        
        resultado --;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
