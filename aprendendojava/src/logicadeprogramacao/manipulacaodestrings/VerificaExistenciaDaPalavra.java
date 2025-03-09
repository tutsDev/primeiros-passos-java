package logicadeprogramacao.manipulacaodestrings;

import java.util.Scanner;

/*Peça para o usuário digitar um texto e uma palavra. Verifique se a palavra está no texto.*/

public class VerificaExistenciaDaPalavra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String texto, palavra;

        System.out.print("Digite um texto: ");
        texto = input.nextLine();
        System.out.print("Digite uma palavra para verificação: ");
        palavra = input.nextLine();

        if (texto.contains(palavra)){
            System.out.println("O texto contém a palavra");
        } else {
            System.out.println("O texto contém a palavra");
        }

        input.close();

    }
}
