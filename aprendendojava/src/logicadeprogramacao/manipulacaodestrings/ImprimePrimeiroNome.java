package logicadeprogramacao.manipulacaodestrings;

import java.util.Scanner;

/*Peça ao usuário seu nome completo:
    - Imprima apenas o primeiro nome.
*/

public class ImprimePrimeiroNome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String nomeCompleto, primeiroNome;

        System.out.print("Digite seu nome completo: ");
        nomeCompleto = input.nextLine();

        primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(' '));

        System.out.printf("Primeiro nome: %s\n", primeiroNome);

        input.close();

    }
}
