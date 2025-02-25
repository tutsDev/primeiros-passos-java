package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Faça um algoritmo que leia o período em que um aluno estuda:
    M - Matutino;
    V - Vespertino;
    N - Noturno.
Imprima: M - Bom dia;
         V - Boa tarde;
         N - Boa noite.
*/

public class ImprimeTurno {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        System.out.println("Qual periodo você estuda? Escolha uma opção.");
        System.out.println("==========Menu de Opções==========");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.println("==================================");
        String periodoOpcao = input.nextLine();

        switch (periodoOpcao){

            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Insira um periodo válido");
                break;

        }

        input.close();

    }

}
