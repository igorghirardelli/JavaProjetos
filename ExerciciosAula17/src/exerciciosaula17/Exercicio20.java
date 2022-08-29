
package exerciciosaula17;

import java.util.Scanner;


public class Exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de idades");
        int idades = teclado.nextInt();
        int idade;
        int soma = 0;
        
        for(int i = 0; i < idades; i++){
            System.out.println("Entre com a idade da pessoa" +(i+1));
            idade = teclado.nextInt();
            
            soma+= idade;
            
        }
        
        double media = soma / idades;
        
        System.out.println("A media é: "+media);
        
        if(media >=0  && media <=25){
            System.out.println("jovem");
        } else if (media >= 26 && media <= 60){
            System.out.println("Adulta");
        } else if(media > 60){
            System.out.println("Idosa");
        }
        
        
        
        
    }
}
