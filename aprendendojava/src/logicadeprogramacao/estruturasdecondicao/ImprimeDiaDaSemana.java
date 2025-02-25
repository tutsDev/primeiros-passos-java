package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Faça um algoritmo que leia um número de 1 a 7.
Imprima o dia da semana correspondente, considere que 1 é Domingo.
*/

public class ImprimeDiaDaSemana {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        System.out.println("Insira um número de 1 à 7 para receber o dia da semana correspondente.");
        int diaSemana = input.nextInt();

        switch (diaSemana){

            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Insira um número válido");
                break;
        }

        input.close();

    }

}
