package programacaoorientadaaobjetos.vetores.ordenandovetrores;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetorInteiro = new int[10000];
        Random random = new Random();
        for(int i = 0; i < vetorInteiro.length; i++) {
            vetorInteiro[i] = random.nextInt(0, 100 + 1);
        }

        long inicioExec, duracaoExec;

        inicioExec = System.currentTimeMillis();
        ordenaVetorDeInteiro1(vetorInteiro);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.println(duracaoExec + " Milisegundos");

        inicioExec = System.currentTimeMillis();
        ordenaVetorDeInteiro2(vetorInteiro);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.println(duracaoExec + " Milisegundos");

        inicioExec = System.currentTimeMillis();
        ordenaVetorDeInteiro3(vetorInteiro);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.println(duracaoExec + " Milisegundos");

        for (int element : vetorInteiro){
            System.out.printf("[%d] ", element);
        }

    }

    /**Metodo responsável por realizar a troca de valores entre duas posições de um vetor.
     * @param vet Vetor que terá os valores trocados.
     * @param orig Posição de origem.
     * @param destn Posição de destino.
     */
    public static void trocaPosicao(int[] vet, int orig, int destn){
        int temp = vet[orig];
        vet[orig] = vet[destn];
        vet[destn] = temp;
    }

    /**Metodo responsável por ordenar um Vetor utilizando BubbleSort.
     * @param vet Vetor a ser ordenado.
     */
    public static void ordenaVetorDeInteiro1(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    trocaPosicao(vet, j, j + 1);
                }
            }
        }
    }

    public static void ordenaVetorDeInteiro2(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    trocaPosicao(vet, j, j + 1);
                }
            }
        }
    }

    public static void ordenaVetorDeInteiro3(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            boolean trocou = false;

            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    trocaPosicao(vet, j, j + 1);
                    trocou = true;
                }
            }

            if (!trocou) break;
        }
    }
}
