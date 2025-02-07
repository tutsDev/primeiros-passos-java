/*Faça com que um array de inteiros receba valores aleatórios e ordene de forma crescente os valores desse array*/

import java.util.Random;

public class OrdenandoArrayDeInteiros {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayDeInteiros = new int[20];

        for (int i = 0; i < arrayDeInteiros.length; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);
            arrayDeInteiros[i] = random.nextInt(100);
            System.out.printf("Posição %d -> %d\n", i, arrayDeInteiros[i]);
        }

        for (int i = 0; i < arrayDeInteiros.length - 1; i++) {

            for (int j = 0; j < arrayDeInteiros.length - 1 - i; j++) {

                if (arrayDeInteiros[j] > arrayDeInteiros[j + 1]) {
                    int valarTemp = arrayDeInteiros[j];
                    arrayDeInteiros[j] = arrayDeInteiros[j + 1];
                    arrayDeInteiros[j + 1] = valarTemp;
                }

            } 

        }

        for (int i = 0; i < arrayDeInteiros.length; i++) {
            System.out.printf("Posição %d -> %d\n", i, arrayDeInteiros[i]);
        }

    }
}
