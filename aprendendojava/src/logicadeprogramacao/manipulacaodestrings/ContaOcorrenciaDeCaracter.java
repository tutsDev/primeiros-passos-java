package logicadeprogramacao.manipulacaodestrings;

import java.util.Scanner;

/*Peça ao usuário um texto e um carácter.
    - Verifique quanatas vezes o carácter aparece
*/

public class ContaOcorrenciaDeCaracter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String texto;
        char caracterBusca;
        int qtdOcorrencia = 0;

        System.out.print("Digite um texto: ");
        texto = input.nextLine();
        System.out.print("Digite o caracter que deseja encontrar: ");
        caracterBusca = input.next().charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracterBusca)
                qtdOcorrencia++;
        }

        System.out.printf("O caracter %c apareceu %d vezes no texto\n", caracterBusca, qtdOcorrencia);

        input.close();

    }
}
