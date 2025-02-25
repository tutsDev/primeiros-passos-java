package programacaoorientadaaobjetos.vetores.buscaemvetores.sequencial;

import programacaoorientadaaobjetos.vetores.metodosmanipulacaovetores.ManipulandoVetores;

import java.util.Scanner;

public class ExemploBuscaSequencial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valorBusca;

        int[] vetorDeInteiros = ManipulandoVetores.instanciarVetorDeInteiros();

        ManipulandoVetores.preencherVetorDeInteirosAleatorio(vetorDeInteiros);

        System.out.print("Digite o valor que deseja encontrar no vetor: ");
        valorBusca = input.nextInt();

        boolean existeValor = buscaSequencialPelaExistenciaValorInteiro(vetorDeInteiros, valorBusca);

        if(existeValor == true) {
            System.out.printf("O valor %d, existe no vetor.\n", valorBusca);
        } else {
            System.out.printf("O valor %d, não existe no vetor.\n", valorBusca);
        }

        int posicaoEncontrada = buscaSequencialPelaPosicaoValorInteiro(vetorDeInteiros, valorBusca);


        if(posicaoEncontrada >= 0) {
            System.out.printf("O valor %d, foi encontrado na posição %d.\n", valorBusca, posicaoEncontrada);
        } else {
            System.out.printf("O valor %d, não foi encontrado no vetor.\n", valorBusca);
        }
    }

    /**Metodo responsável por realizar uma busca sequencial pela posição de um valor inteiro em um vetor de inteiros.
     * @param vet Vetor que será realizada a busca.
     * @param vlBusca Valor a ser buscado.
     * @return Posicao em que o valor foi encontrado.
     */
    public static int buscaSequencialPelaPosicaoValorInteiro(int[] vet, int vlBusca) {
        int posicao = -1;

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] == vlBusca) {
                posicao = i;
                break;
            }
        }
        return posicao;
    }

    /**Metodo responsável por realizar uma busca sequêncial pela existência de um valor inteiro em um vetor de inteiros.
     * @param vet Vetor que será realizada a busca.
     * @param vlBusca Valor a ser buscado.
     * @return Se o valor foi ou não encontrado.
     */
    public static boolean buscaSequencialPelaExistenciaValorInteiro(int[] vet, int vlBusca) {
        boolean achou = false;

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] == vlBusca) {
                achou = true;
                break;
            }
        }

        return achou;
    }
}
