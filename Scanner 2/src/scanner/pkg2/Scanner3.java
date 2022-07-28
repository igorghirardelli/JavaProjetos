
package scanner.pkg2;

import java.util.Scanner;


public class Scanner3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ola bem vindo a pesquisa do instituto stark!");   
    System.out.println("Digite seu nome, idade, altura, quantidade de filhos e se tem animal de estimação");
    String nome = teclado.nextLine();
    Integer idade = teclado.nextInt();
    float altura =  teclado.nextFloat();
    byte qtdf = teclado.nextByte();
    boolean animal = teclado.nextBoolean();
    
        System.out.println("Voce digitou os seguintes dados:");
        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
        System.out.println("Altura:"+altura);
        System.out.println("Quantidade de filhos:"+qtdf);
        System.out.println("Se tem animal de estimação?"+animal);
        System.out.println("Obrigado por disponibilizar o seu tempo, seus dados serão usados em uma pesquisa ");
        System.out.println("tenha uma bom dia !");
        
    }
    
}
