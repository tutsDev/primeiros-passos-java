package logicadeprogramacao.estruturasdecondicao;

/*Um funcionário receberá aumento de acrodo com o seu plano de trabalho.
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

        String planoTrabalho;
        double salarioAtual, aumentoDez, aumentoQuinze, aumentoVinte;

        System.out.println("Qual seu plano de trabalho? Escolha uma opção");
        System.out.println("==========Menu de Opções==========");
        System.out.println("Plano A");
        System.out.println("Plano B");
        System.out.println("Plano C");
        System.out.println("==================================");
        planoTrabalho = input.nextLine();

        System.out.println("Insira seu salário atual");
        salarioAtual = input.nextDouble();

        switch (planoTrabalho){

            case "A":
                aumentoDez = (salarioAtual * 0.10) + salarioAtual;
                System.out.printf("Seu novo salário é de R$%.2f\n", aumentoDez);
                break;
            case "B":
                aumentoQuinze = (salarioAtual * 0.15) + salarioAtual;
                System.out.printf("Seu novo salário é de R$%.2f\n", aumentoQuinze);
                break;
            case "C":
                aumentoVinte = (salarioAtual * 0.20) + salarioAtual;
                System.out.printf("Seu novo salário é de R$%.2f\n", aumentoVinte);
                break;
            default:
                System.out.println("Insira um plano válido");
                break;

        }

        input.close();

    }

}
