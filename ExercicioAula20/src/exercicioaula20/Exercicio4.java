
package exercicioaula20;

import java.util.Scanner;

/**
faça um programa para armazenar em uma matriz os comprimissos de uma agenda pessoal.
Cada dia do mes deve conter 24 horas, onde para cada uma destas 24 horas podemos associar
uma tarefa específica(compromisso agendado).O programa deve ter um menu onde o usuario indica o dia do mes que 
deseja alterar e a hora, entrando em seguida com o compromisso ou entao o usuario pode tambem consultar a agenda,
fornecendo o dia e a hora para obter compromisso armazenado .  
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String [][] compromissos = new String [31][24];
        
        int opcao;
        boolean sair = false;
        
        while(!sair){
           
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            
            opcao = teclado.nextInt();
            
            if(opcao == 1){ // adicionar compromisso
                
                boolean diavalido = false;
                int dia = 0;
                while(!diavalido){
                    System.out.println("Entre com o dia do mês");
                    dia = teclado.nextInt();
                    if(dia > 0 && dia <= 31){
                        diavalido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente ");
                    }
                }
                
                boolean horavalido = false;
                int hora = 0;
                while(!horavalido){
                    System.out.println("Entre com a hora do compromisso ");
                    hora = teclado.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horavalido = true;
                    } else {
                        System.out.println("Hora invalido, digite novamente ");
                    }
                }
                
                dia --;
                System.out.println("Digite o compromisso");
                compromissos [dia][hora] = teclado.next();
                
                
                
            } else if(opcao == 2){ // verificar compromisso
               
            boolean diavalido = false;
                int dia = 0;
                while(!diavalido){
                    System.out.println("Entre com o dia do mês");
                    dia = teclado.nextInt();
                    if(dia > 0 && dia <= 31){
                        diavalido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente ");
                    }
                }
                
                boolean horavalido = false;
                int hora = 0;
                while(!horavalido){
                    System.out.println("Entre com a hora do compromisso ");
                    hora = teclado.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horavalido = true;
                    } else {
                        System.out.println("Hora invalido, digite novamente ");
                    }
                }
                
                dia --;   
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[dia][hora]);
                
                
                
                
            } else if(opcao == 0){
                sair = true;
            }else{
                System.out.println("Opcao invalida, digite novamente");
            }
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
