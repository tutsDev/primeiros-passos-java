package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Faça um algoritmo que receba a idade de uma pessoa.
Se for maior de idade imprima: "Maior de Idade"
Senão imprima: "Menor de Idade"
*/

public class VerificaSeMaiorIdade {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        int idade;

        System.out.println("Insira sua idade:");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        input.close();
    }
}
