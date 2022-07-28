
package operadores2;


public class Operadores2 {

    
    public static void main(String[] args) {
        
        int numero = 10;
        int valor = 4 + numero++;
        System.out.println(valor);// o valor é 14 pq ele vai pós incrementar dps de somar e imprimir o valor
        System.out.println(numero);
       
        
        int numero1  = 10;
        int valor1  = 4 + ++numero1;
        System.out.println(valor1);// o valor vai ser 15 pq ele vai acrescentar +1 e dps somar
        System.out.println(numero1);
        
        
        int x = 4;
        x+= 2;// x = x+2
        System.out.println(x);
        
       int  n = 4;
        System.out.println("o valor é " +n++ ); // n++ pós incremento
        System.out.println(n);// o valor final dela
    }
    
}
