
package testegift;

import java.util.Scanner;


public class Testegift {

    
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);    
       int temp, cont=0;

  int[] vetor_prova = {9,8,7,6,5,4,3,2,1,0};

  while (cont < 10)

  {

            temp = vetor_prova[cont];

            vetor_prova[cont] = vetor_prova[9-cont];

            vetor_prova[9-cont] = temp;

            cont = cont + 1;

  }

  for (cont = 0; cont <=9; cont++)

  {

            System.out.println ("posição "+cont+ " é igual a  "+vetor_prova[cont]);

  }

  

}

        
    }


