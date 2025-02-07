/*
Um funcionário receberá aumento de acrodo com seu plano de trabalho.
Faça um algoritmo que leia: O plano de trabalho;
                            E o salário atual de um funcionário.
Calcule e imprima o seu novo salário.
Considere: Plano A - 10%
           Plano B - 15%
           Plano C - 20%
*/

import java.util.Scanner;

public class CalculaAumentoSalario {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Qual seu plano de trabalho? Escolha uma opção");
        System.out.println("==========Menu de Opções==========");
        System.out.println("Plano A");
        System.out.println("Plano B");
        System.out.println("Plano C");
        System.out.println("==================================");
        String planoTrabalho = input.nextLine();
        
        System.out.println("Insira seu salário atual");
        double salarioAtual = input.nextDouble();
        
        switch (planoTrabalho){
            
            case "A":
                double aumentoDez = (salarioAtual * 0.10) + salarioAtual;
                System.out.println("Seu novo salário é de R$" + aumentoDez);
                break;
            case "B":
                double aumentoQuinze = (salarioAtual * 0.15) + salarioAtual;
                System.out.println("Seu novo salário é de R$" + aumentoQuinze);
                break;
            case "C":
                double aumentoVinte = (salarioAtual * 0.20) + salarioAtual;
                System.out.println("Seu novo salário é de R$" + aumentoVinte);
                break;
            default:
                System.out.println("Insira um plano válido");
                break;
            
        }
        
        input.close();
        
    }

}
