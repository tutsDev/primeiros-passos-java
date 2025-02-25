package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/* Faça um algoritmo para encontrar o maior número entre 3 números inteiros.
    Se todos iguais, imprimir: "Os números são iguais";
    Se não, imprimir o maior dos 3 números.
*/

public class VerificaMaiorDe3Numeros {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        int num1, num2, num3;

        System.out.println("Insira o primeiro número:");
        num1 = input.nextInt();

        System.out.println("Insira o segudo número:");
        num2 = input.nextInt();

        System.out.println("Insira o terceiro número:");
        num3 = input.nextInt();

        if (num1 == num2 && num1 == num3){
            System.out.println("Os números são iguais.");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }

        input.close();
    }
}
