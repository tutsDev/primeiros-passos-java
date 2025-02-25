package logicadeprogramacao.entradaesaida;

import java.util.Scanner;

/*Faça um algoritmo que leia quatri números inteiros.
Calcule e imprima a soma desses números.
*/

public class SomaQuatroNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4, reultSoma;

        System.out.println("Insira o primeiro número:");
        num1 = input.nextInt();

        System.out.println("Insira o segundo número:");
        num2 = input.nextInt();

        System.out.println("Insira o terceiro número:");
        num3 = input.nextInt();

        System.out.println("Insira o quarto número:");
        num4 = input.nextInt();

        reultSoma = num1 + num2 + num3 + num4;

        System.out.println("A soma dos números é: " + reultSoma);

        input.close();
    }
}
