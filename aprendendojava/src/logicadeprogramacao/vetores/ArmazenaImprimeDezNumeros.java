package logicadeprogramacao.vetores;

import java.util.Scanner;

/*Leia 10 números inteiros do usuário.
Armazena-as em um vetor e imprima os números lidos.
*/

public class ArmazenaImprimeDezNumeros{

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int[] numerosEntrada = new int[10];

        for (int i = 0; i < numerosEntrada.length; i++) {

            System.out.println("Digite o " + (i + 1) + "° Número:");
            numerosEntrada[i] = input.nextInt();

        }

        for (int i = 0; i < numerosEntrada.length; i++) {

            System.out.println((i + 1) + "° Número " + numerosEntrada[i]);

        }

        input.close();

    }

}
