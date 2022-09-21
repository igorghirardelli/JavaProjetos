/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula20;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][][] compromissos = new String [12][31][8];// 12 meses 31 dias e 8 horas
        
        int opcao;
        boolean sair = false;
        
        while(!sair){
           
            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            
            opcao = teclado.nextInt();
            
            if(opcao == 1){ // adicionar compromisso
                
                boolean mesvalido = false;
                int mes = 0;
                while(!mesvalido){
                    System.out.println("Entre com o mês");
                    mes = teclado.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesvalido = true;
                    } else {
                        System.out.println("mes invalido, digite novamente ");
                    }
                }
              
                boolean diavalido = false;
                int dia = 0;
                while(!diavalido){
                    System.out.println("Entre com o dia do mês");
                    dia = teclado.nextInt();
                    if(dia >= 0 && dia <= 31){
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
                    if(hora >= 0 && hora <= 8){
                        horavalido = true;
                    } else {
                        System.out.println("Hora invalido, digite novamente ");
                    }
                }
                mes--;// ele vai de 0 a 11 ai tem q usar -
                dia --;
                System.out.println("Digite o compromisso");
                compromissos [mes][dia][hora] = teclado.next();
                
                
                
            } else if(opcao == 2){ // verificar compromisso
            
               boolean mesvalido = false;
                int mes = 0;
                while(!mesvalido){
                    System.out.println("Entre com o mês");
                    mes = teclado.nextInt();
                    if(mes > 0 && mes <= 12){
                        mesvalido = true;
                    } else {
                        System.out.println("mes invalido, digite novamente ");
                    }
                } 
                
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
                mes --;
                dia --;   
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[mes][dia][hora]);
                
                
                
                
            } else if(opcao == 0){
                sair = true;
            }else{
                System.out.println("Opcao invalida, digite novamente");
            }
        
    }
    }
}