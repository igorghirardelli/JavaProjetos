
package calculadoraimc;

import java.util.Scanner;


public class CalculadoraIMC {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe seu nome");
        String nome = teclado.nextLine();
        System.out.println("Informe sua altura ");
        double alt = teclado.nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = teclado.nextDouble();
            
        double media = peso / (alt*alt);
        
        
        
        String clas = ""; // classificação do peso
        
        if(media < 18){
            
            clas = "A"; // abaixo do peso
            
        } else if(media >= 19 && media < 25){
                      
            clas = "B"; // normal
            
        } else if(media >=25 && media <=29 ){
            
            clas = "C"; // sobrepeso
            
        } else if(media >= 30 && media <= 39) {
            
            clas = "D"; // obesidade
            
        } else if(media >= 40){
            
            clas = "E"; // obesidade grave
            
        }
        
        System.out.println("Ola " +nome);
        System.out.println("Sua altura é: " +alt);
        System.out.println("Seu peso é: " +peso);
        System.out.println("Seu imc é: " +media);
        System.out.println(""+clas);
        
        switch(clas){
            case "A": System.out.println("Magreza  "); break;
            case "B": System.out.println("Normal "); break;
            case "C": System.out.println("Sobrepeso "); break;
            case "D": System.out.println("Obesidade "); break;
            case "E": System.out.println("Obesidade Grave "); break;
        }
        
        
    }
    
}
