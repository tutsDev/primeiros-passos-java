package programacaoorientadaaobjetos.vetores.buscaemvetores.sequencial;

import programacaoorientadaaobjetos.vetores.metodosmanipulacaovetores.ManipulandoVetores;

import java.util.Scanner;

/*Crie um programa com um metodo que realize a busca sequencial de um valor
em um array de inteiros e retorne o número de vezes que o elemento foi encontrado.
*/

public class BuscaSequencialQtdOcorrencias {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoVetor, valorBusca;

        System.out.print("Digite o tamanho do vetor: ");
        tamanhoVetor = input.nextInt();

        int[] vetorDeInteiros = new int[tamanhoVetor];

        ManipulandoVetores.preencherVetorDeInteirosAleatorio(vetorDeInteiros);

        System.out.print("Digite o valor procurado: ");
        valorBusca = input.nextInt();
        System.out.printf("O valor foi encontrado %d vezes", buscaQtdOcorrencias(vetorDeInteiros, valorBusca));
    }

    /**Metodo responsável por buscar quantas occorrencias temos a partir de um valor inteiro.
     * @param vet Vetor a ser buscado as ocorrencias.
     * @param vlBusca  Valor a ser buscado.
     * @return Quantidade de Ocorrencias.
     */
    public static int buscaQtdOcorrencias(int[] vet, int vlBusca) {
        int qtdOcorrencia = 0;
        for (int n : vet) {
            if (n == vlBusca) {
                qtdOcorrencia++;
            }
        }
        return qtdOcorrencia;
    }
}
