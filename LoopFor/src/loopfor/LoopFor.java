
package loopfor;


public class LoopFor {

    
    public static void main(String[] args) {
        for (int i= 0; i < 5 ; i++){
            System.out.println("i tem valor: "+i);// 0 1 2 3 4
        }
         for (int i= 5; i > 0 ; i--){
            System.out.println("i tem valor: "+i); // 5 4 3 2 1 
        }
        
        for (int i=0, j=10 ; i < j ; i++, j--) {
        System.out.println("i= " +i + "; j = " + j);
    }
         
     int count  = 0;
     
     for (; count < 10 ; ){
         System.out.println("O valor de count: "+count);
         count += 2;// conta de 2 em 2 
     }
        
      int soma = 0;
      for (int i = 1 ; i < 5 ; soma += i++){
          System.out.println("O valor da soma é: "+ soma );
      }
        
    }
    
}
