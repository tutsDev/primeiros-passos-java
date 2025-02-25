package logicadeprogramacao.vetores;

import java.util.Scanner;

/* Crie uma função que imprima os valores da Sequência de Fibonacci */

public class GeraSequenciaDeFibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int tamanhoFibonacci;

        System.out.print("Quantos números da sequência de Fibonacci deseja gerar? ");
        tamanhoFibonacci = input.nextInt();

        int [] sequenciaDeFibonacci = new int[tamanhoFibonacci];

        for (int i = 0; i < sequenciaDeFibonacci.length; i++) {

            if (i <= 1) {
                sequenciaDeFibonacci[i] = 1;

            } else {
                sequenciaDeFibonacci[i] = sequenciaDeFibonacci[i - 2] + sequenciaDeFibonacci[i - 1];
            }

            System.out.printf("%d - ", sequenciaDeFibonacci[i]);

        }

        System.out.println();

        input.close();

    }
}
