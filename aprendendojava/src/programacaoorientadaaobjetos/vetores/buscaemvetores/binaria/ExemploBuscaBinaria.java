package programacaoorientadaaobjetos.vetores.buscaemvetores.binaria;

import programacaoorientadaaobjetos.vetores.metodosmanipulacaovetores.ManipulandoVetores;

import java.util.Scanner;

public class ExemploBuscaBinaria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int valorBusca;

        int[] vetorDeInteiros = ManipulandoVetores.instanciarVetorDeInteiros();

        System.out.print("Digite o valor que deseja encontrar: ");
        valorBusca = input.nextInt();

        boolean existeValor = buscaBinariaPelaExistenciaValorInteiro(vetorDeInteiros, valorBusca);

        if(existeValor == true) {
            System.out.printf("O valor %d, existe no vetor.\n", valorBusca);
        } else {
            System.out.printf("O valor %d, não existe no vetor.\n", valorBusca);
        }

        int posicaoEncontrada = buscaBinariaPelaPosicaoDaOcorrencia(vetorDeInteiros, valorBusca);

        if(posicaoEncontrada >= 0){
            System.out.printf("O valor %d, foi encontrado na posição %d!", valorBusca, posicaoEncontrada);
        } else {
            System.out.printf("O valor %d, não foi encontrado", valorBusca);
        }

        input.close();

    }

    /**Metodo responsavel por realizar uma busca binária pela existência de um valor inteiro.
     * @param vet Veteor que será percorrido.
     * @param vlBusca Valor a ser encontrado.
     * @return Se existe ou não o valor.
     */
    public static boolean buscaBinariaPelaExistenciaValorInteiro(int[] vet, int vlBusca){

        int inicioVet = 0, fimVet = vet.length - 1, meioVet;
        while (inicioVet <= fimVet) {
            meioVet = (inicioVet + fimVet) / 2;
            if(vet[meioVet] > vlBusca){
                fimVet = meioVet;
            } else if(vet[meioVet] < vlBusca) {
                inicioVet = meioVet;
            } else {
                return true;
            }
        }

        return false;
    }

    /**Metodo responsavel por realizar uma busca binária pela posição de um valor inteiro.
     * @param vet Veteor que será percorrido.
     * @param vlBusca Valor a ser encontrado.
     * @return Posição do valor.
     */
    public static int buscaBinariaPelaPosicaoDaOcorrencia(int[] vet, int vlBusca){

        int inicioVet = 0, fimVet = vet.length - 1, meioVet;
        while (inicioVet <= fimVet) {
            meioVet = (inicioVet + fimVet) / 2;
            if(vlBusca > vet[meioVet]){
                inicioVet = meioVet;
            } else if(vlBusca < vet[meioVet]) {
                fimVet = meioVet;
            } else {
                return meioVet;
            }
        }

        return -1;
    }
}

