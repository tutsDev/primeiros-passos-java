package programacaoorientadaaobjetos.vetores.buscaemvetores.sequencial;

import java.util.Scanner;

/*Crie um programa com um metodo que realize a busca sequencial de um valor em
um array de Strings e retorne a posição do valor encontrado.
*/

public class BuscaSequencialVetorTexto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String valorBusca;

        String[] vetorNomes = {"Arthur", "Maria", "Claudia", "Wilsos", "Lucas", "Duda", "Martins", "Célia"};

        System.out.print("Digite o texto que desja encontrar: ");
        valorBusca = input.nextLine();

        int posicaoEncontrada = buscaPosicaoTexto(vetorNomes, valorBusca);
        if(posicaoEncontrada >= 0) {
            System.out.printf("O valor %s, foi encontrado na posição %d.", valorBusca, posicaoEncontrada);
        } else {
            System.out.println("O valor %s, não foi encontrado!");
        }
    }

    /**Metodo responsável por realizar a busca a posição de um texto em um vetor de Strings.
     * @param vet Vetor que será realizada a busca.
     * @param vlBusca Valor a ser buscado.
     * @return Posicao em que o valor foi encontrado.
     */
    public static int buscaPosicaoTexto(String[] vet, String vlBusca) {
        int posicao = -1;

        for(int i = 0; i < vet.length; i++) {
            if(vet[i].equals(vlBusca)) {
                posicao = i;
                break;
            }
        }

        return posicao;
    }

}
