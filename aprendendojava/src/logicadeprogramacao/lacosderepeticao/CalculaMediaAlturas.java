package logicadeprogramacao.lacosderepeticao;

import java.util.Scanner;

/*Faça um algoritmo que receba a idade e a altura de 10 pessoas:
Calcule e mostre a média das alturas daquelas com mais de 50 anos.
*/

public class CalculaMediaAlturas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int i;

        int idade = 0;
        double altura = 0;

        int qtdPessoas = 0;
        double acumulaAltura = 0;


        for (i = 1; i <= 10; i++){

            System.out.println("Insira a idade da pessoa " + i + ":");
            idade = input.nextInt();

            System.out.println("Insira a altura da pessoa " + i + ":(ex: 1,70)");
            altura = input.nextDouble();

            if (idade > 50){

                acumulaAltura = acumulaAltura + altura;
                qtdPessoas++;

            }

        }

        double mediaAltura = acumulaAltura / qtdPessoas;
        System.out.println("A média da altura das pessoas com mais de 50 anos é: " + mediaAltura);

        input.close();
    }
}
