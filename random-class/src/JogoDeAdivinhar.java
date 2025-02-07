/* Crie um jogo de advinhar com limite de chances */

import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinhar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        Random randon = new Random();

        int numEntrada;
        int sorteadorDeNumeros = 1 + randon.nextInt(5);
        boolean acertou = false;

        int count = 4;

        while (count > 0) {

            System.out.print("Digite um número de 1 a 5: ");
            numEntrada = input.nextInt();
            
            if (numEntrada == sorteadorDeNumeros) {
                System.out.print("VOCÊ ACERTOU!");
                acertou = true;
                break;

            } else {
                System.out.printf("VOCÊ ERROU :( Tente novamente! - RESTAM %d TENTATIVAS\n", count - 1);
            }

            count--;
        }

        if (acertou == true) {
            System.out.println(" PARÁBENS!");

        } else {
            System.out.println("QUE PENA, NÃO RESTA MEIS TENTATIVAS");
        }

        input.close();

    }
}

