
package exerciciosaula17;

import java.util.Scanner;




public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        boolean infovalida = false;
        String nome;
        int idade;
        double sal;
        String sexo;
        String estadocivil;
        
        
        do {
            System.out.println("Entre com um nome");
            nome = teclado.next();
            
            if(nome.length() >= 3){
                infovalida = true;
            } else{
                infovalida = false;
                System.out.println("Nome precisa de no minimo 3 caracteres.");
            }
                
        } while(!infovalida);
        
        infovalida = false;
        do {
            System.out.println("Informe sua idade: ");
            idade = teclado.nextInt();  
            
            if(idade >= 0 && idade <= 150){
                infovalida = true;
            } else{
                infovalida = false;
                System.out.println("A idade não pode passar de 150 anos");
            }
            
        } while (!infovalida);
        
        infovalida = false;
        do{
            System.out.println("Informe o seu salario: ");
            sal = teclado.nextDouble();
            
            if(sal >= 0 ){
                infovalida = true;
            } else {
                infovalida = false;
                System.out.println("O salario não pode ser negativo");
            }
   
        } while(!infovalida);
       
       infovalida = false;
       do {
           
           System.out.println("Informe o sexo (F- feminino ou M- masculino)");
           sexo = teclado.next();
           
           if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
               
               infovalida = true;
           } else {
               infovalida = false;
               System.out.println("Sexo precisa ser 'f' ou 'm' ");
                   } 
       } while(!infovalida);
        
       infovalida = false;
       do {
           
           System.out.println("Entre com o estado civil");
           estadocivil = teclado.next();
           
           if(estadocivil.equalsIgnoreCase("s") || estadocivil.equalsIgnoreCase("c") || estadocivil.equalsIgnoreCase("v") || estadocivil.equalsIgnoreCase("d") ) {
               
               infovalida = true;
           } else {
               infovalida = false;
               System.out.println("estado civil  precisa ser 's', 'c', 'v', 'd' ");
                   } 
       } while(!infovalida);
       
        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salario: "+sal);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado civil: "+estadocivil);
    }
}
