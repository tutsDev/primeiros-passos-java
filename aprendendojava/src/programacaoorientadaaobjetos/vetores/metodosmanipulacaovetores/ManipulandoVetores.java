package programacaoorientadaaobjetos.vetores.metodosmanipulacaovetores;

import java.util.Random;
import java.util.Scanner;

public class ManipulandoVetores {

    /**Metodo responsável por instanciar um vetor de inteiros.
     * @return Vetor de Inteiros*/
    public static int[] instanciarVetorDeInteiros(){
        Scanner input = new Scanner(System. in);

        System.out.print("Digite a quantidade de elementos desejada no vetor: ");
        int qtdElementos = input.nextInt();

        int[] vetorDeInteiros = new int[qtdElementos];

        return vetorDeInteiros;
    }

    /**Metodo responsável por preencher um vetor de inteiros com valores aleatórios.
     * @param vet Vetor que será realizada a busca.
     */
    public static void preencherVetorDeInteirosAleatorio(int[] vet) {
        Random random = new Random();

        for(int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(0, 1000000);
        }
    }

    /**Metodo que preenche um vetor de inteiro em ordem crescente a partir do indice.
     * @param vet Vetor a ser preenchido.
     */
    public static void preencherVetorDeInteirosSequencial(int[] vet){

        for(int i = 0; i < vet.length; i++) {
            vet[i] = i;
        }

    }

    /**Metodo que ordena um vetor de inteiro em ordem crescente.
     * @param vet Vetor a ser ordenado.
     */
    public static void ordenaVetorDeInteiros(int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {

            for (int j = 0; j < vet.length - 1 - i; j++) {

                if (vet[j] > vet[j + 1]) {
                    int valorTemp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = valorTemp;
                }

            }

        }
    }
}

