package programacaoorientadaaobjetos.vetores.buscaemvetores.sequencial;

import java.util.Random;
import java.util.Scanner;

/*Crie um programa com um metodo que realize a busca sequencial
de um valor em um array de char e retorne o índice da última
ocorrência deste valor no array.
*/

public class BuscaSequencialUltimaOcorrencia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int qtdElementos;
        char valorBusca;

        System.out.print("Digite quantos elementos quer adicionar no vetor: ");
        qtdElementos = input.nextInt();

        char[] vetorDeCaracteres = new char[qtdElementos];

        preencheVetorDeCaracteres(vetorDeCaracteres);

        System.out.print("Qual valor deseja encontrar no vetor? ");
        valorBusca = input.next().charAt(0);

        int ultimaPosicao = buscaNoVetorRetonaUltimaOcorrencia(vetorDeCaracteres, valorBusca);
        if (ultimaPosicao > 0){
            System.out.printf("O valor %c, apareceu pela ultima vez na pisição %d.\n", valorBusca, ultimaPosicao);
        } else {
            System.out.printf("O valor %c, não apareceu no vetor.\n", valorBusca);
        }

        input.close();
    }

    /**Preenche o Vetor com caracteres aleatórios de acordo com a Tabela Ascii.
     *@param vet Vetor a ser preenchido.
     */
    public static void preencheVetorDeCaracteres(char[] vet){
        Random random = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (char)random.nextInt(32, 127);
        }
    }

    /**Metodo responsavel por buscar um valor específico no Vetor e retornar a ultima posição em que o caracter aparece.
     * @param vet Vetor para busca
     * @param vlBusca Valor a ser buscado no Vetor
     * @return ultimaOcorrencia Ultma posiçao em que o caracter aparece.
     */
    public static int buscaNoVetorRetonaUltimaOcorrencia(char[] vet, char vlBusca){
        int ultimaOcorrencia = -1;
        for (int i = vet.length - 1; i >= 0; i--) {
            if (vet[i] == vlBusca){
                ultimaOcorrencia = i;
                break;
            }
        }
        return ultimaOcorrencia;
    }
}
