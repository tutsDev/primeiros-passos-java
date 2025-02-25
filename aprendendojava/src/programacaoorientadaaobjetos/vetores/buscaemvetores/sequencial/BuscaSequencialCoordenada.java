package programacaoorientadaaobjetos.vetores.buscaemvetores.sequencial;

import java.util.Random;
import java.util.Scanner;

/*Crie um programa com um metodo que realize a busca sequencial
de um valor em um array bidimensional de inteiros e retorne as
coordenadas (linha e coluna) da posição do valor encontrado.
*/

public class BuscaSequencialCoordenada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int qtdVetores, tamanhoVetores, valorBusca;

        System.out.print("Digite a quantidade de Vetores: ");
        qtdVetores = input.nextInt();

        System.out.print("Agora, digite o tamanho dos Vetores: ");
        tamanhoVetores = input.nextInt();

        int[][] vetorBidimensionalDeInteiros = new int[qtdVetores][tamanhoVetores];

        preencheVetorBidimensional(vetorBidimensionalDeInteiros);

        System.out.print("Qual valor deseja encontrar no Vetor? ");
        valorBusca = input.nextInt();

        int[] coordenadaEncontrada = buscaNoVetorRetornaCordenada(vetorBidimensionalDeInteiros, valorBusca);

        if (coordenadaEncontrada != null){
            System.out.printf("O valor %d, foi encontrado na Linha %d, Coluna %d\n", valorBusca, coordenadaEncontrada[0], coordenadaEncontrada[1]);
        } else {
            System.out.printf("O valor %d, não foi encontrado\n", valorBusca);
        }

        input.close();

    }

    /**Preenche o Vetor Bidimensional com números inteiros aleatórios.
     *@param vetBi Vetor Bidimensional a ser preenchido.
     */
    public static void preencheVetorBidimensional(int[][] vetBi){
        Random random = new Random();
        for (int i = 0; i < vetBi.length; i++) {
            for (int j = 0; j < vetBi[i].length; j++) {
                vetBi[i][j] = random.nextInt(0, 100);
            }
        }
    }

    /**Metodo responsavel por buscar um valor específico no Vetor Bidimensional e retornar a primeira coordenada em que ele aparece.
     * @param vetBi Vetor Bidimensional para busca
     * @param vlBusca Valor a ser buscado no Vetor Bidimensional
     */
    public static int[] buscaNoVetorRetornaCordenada(int[][] vetBi, int vlBusca){
        for (int i = 0; i < vetBi.length; i++) {
            for (int j = 0; j < vetBi[i].length; j++) {
                if (vetBi[i][j] == vlBusca){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
