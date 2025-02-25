package logicadeprogramacao.vetores;

import java.util.Scanner;

/*Leia dois vetores: A e B.
Construa um terceiro vetor que seja a junção de A e B
colocar os elementos de A, e em sequência, colocar os elementos de B
*/

public class ConcatenaDoisVetores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int qtdElementos1, qtdElementos2;
        System.out.print("Digite quantos elementos quer no primeiro vetor: ");
        qtdElementos1 = input.nextInt();

        System.out.print("Digite quantos elementos quer no segundo vetor: ");
        qtdElementos2 = input.nextInt();

        int[] primeiroVetor = new int[qtdElementos1];
        int[] segundoVetor = new int[qtdElementos2];
        int[] juncaoVetores = new int[qtdElementos1 + qtdElementos2];

        for (int i = 0; i < primeiroVetor.length; i++) {

            System.out.print("Digite o " + (i + 1) + "° Número da Lista 1: ");
            primeiroVetor[i] = input.nextInt();

        }

        for (int i = 0; i < segundoVetor.length; i++) {

            System.out.print("Digite o " + (i + 1) + "° Número da Lista 2: ");
            segundoVetor[i] = input.nextInt();

        }

        for (int i = 0; i < juncaoVetores.length; i++) {

            if (i < primeiroVetor.length) {
                juncaoVetores[i] = primeiroVetor[i];
            } else {
                break;
            }

        }

        for (int i = primeiroVetor.length; i < juncaoVetores.length; i++) {

            juncaoVetores[i] = segundoVetor[i - primeiroVetor.length];

        }

        for (int i = 0; i < juncaoVetores.length; i++) {

            System.out.println((i + 1) + "° Número: " + juncaoVetores[i]);

        }

        input.close();

    }

}