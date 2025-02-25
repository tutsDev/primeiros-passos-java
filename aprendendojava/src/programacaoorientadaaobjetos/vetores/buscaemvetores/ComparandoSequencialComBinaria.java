package programacaoorientadaaobjetos.vetores.buscaemvetores;

import programacaoorientadaaobjetos.vetores.buscaemvetores.binaria.ExemploBuscaBinaria;
import programacaoorientadaaobjetos.vetores.buscaemvetores.sequencial.ExemploBuscaSequencial;
import programacaoorientadaaobjetos.vetores.metodosmanipulacaovetores.ManipulandoVetores;


public class ComparandoSequencialComBinaria {
    public static void main(String[] args) {

        System.out.println("Vetor BB Ordenado");
        int[] vetorBuscaBinariaO = ManipulandoVetores.instanciarVetorDeInteiros();
        System.out.println("Vetor BS Ordenado");
        int[] vetorBuscaSequencialO = ManipulandoVetores.instanciarVetorDeInteiros();
        System.out.println("Vetor BB Aleatório");
        int[] vetorBuscaBinariaA = ManipulandoVetores.instanciarVetorDeInteiros();
        System.out.println("Vetor BS Aleatório");
        int[] vetorBuscaSequencialA = ManipulandoVetores.instanciarVetorDeInteiros();
        long inicioExec, duracaoExec;

        ManipulandoVetores.preencherVetorDeInteirosSequencial(vetorBuscaBinariaO);
        ManipulandoVetores.preencherVetorDeInteirosSequencial(vetorBuscaSequencialO);
        ManipulandoVetores.preencherVetorDeInteirosAleatorio(vetorBuscaBinariaA);
        ManipulandoVetores.preencherVetorDeInteirosAleatorio(vetorBuscaSequencialA);

        System.out.println("Vetores Ordenados e Aleatórios Instanciados e Preenchidos");

        System.out.println("Inicio Buscas com vetores ORDENADOS");

        System.out.println("    Início Busca Binária - Vetor Ordenado");
        inicioExec = System.currentTimeMillis();
        ExemploBuscaBinaria.buscaBinariaPelaExistenciaValorInteiro(vetorBuscaBinariaO, 890400);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.printf("     Fim Busca Binária - Duração de %d milisegundos.\n", duracaoExec);

        System.out.println();

        System.out.println("    Início Busca Sequencial - Vetor Ordenado");
        inicioExec = System.currentTimeMillis();
        ExemploBuscaSequencial.buscaSequencialPelaExistenciaValorInteiro(vetorBuscaSequencialO, 890400);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.printf("     Fim Busca Sequencial - Duração de %d milisegundos.\n", duracaoExec);

        System.out.println();

        System.out.println("Inicio Buscas com vetores ALEATÓRIOS");

        System.out.println("    Início Busca Binária - Vetor Ordenado");
        inicioExec = System.currentTimeMillis();
        System.out.println("    Ordenando Vetor!");
        ManipulandoVetores.ordenaVetorDeInteiros(vetorBuscaBinariaA);
        System.out.println("    Vetor Ordenado!");
        ExemploBuscaBinaria.buscaBinariaPelaExistenciaValorInteiro(vetorBuscaBinariaA, 890400);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.printf("     Fim Busca Binária - Duração de %d milisegundos.\n", duracaoExec);

        System.out.println();


        System.out.println("    Início Busca Sequencial - Vetor Aleatório");
        inicioExec = System.currentTimeMillis();
        ExemploBuscaSequencial.buscaSequencialPelaExistenciaValorInteiro(vetorBuscaSequencialA, 890400);
        duracaoExec = System.currentTimeMillis() - inicioExec;
        System.out.printf("     Fim Busca Sequencial - Duração de %d milisegundos.\n", duracaoExec);

    }
}
