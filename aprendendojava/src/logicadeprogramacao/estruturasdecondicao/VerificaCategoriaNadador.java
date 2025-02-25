package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Faça um algoritmo que receba a idade de um nadador e imprima a sua
categoria seguindo as regas:
    Infantil A - 5 a 7 Anos
    Infantil B - 8 a 10 Anos
    Juvenil A - 11 a 13 Anos
    Juvenil B - 14 a 17 Anos
    Sênior - 18 Anos ou mais
*/

public class VerificaCategoriaNadador{

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        int idade;

        System.out.println("Quatos anos você tem?");
        idade = input.nextInt();

        if (idade >= 18){
            System.out.println("Sua categoria é Sênior");
        } else if (idade >= 14 && idade < 18){
            System.out.println("Sua categoria é Juvenil B");
        } else if (idade >= 11 && idade < 14){
            System.out.println("Sua categoria é Juvenil A");
        } else if (idade >= 8 && idade < 11){
            System.out.println("Sua categoria é Infantil B");
        } else if (idade >= 5 && idade < 8){
            System.out.println("Sua categoria é Infantil A");
        } else {
            System.out.println("Você não está em nenhuma categoria :(");
        }

        input.close();

    }
}
