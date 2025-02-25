package logicadeprogramacao.entradaesaida;

import java.util.Scanner;

/*Faça um algoritmo que leia o ano de nascimento de uma pessoa.
Calcule e mostre:
    -A idade atual dessa pessoa;
    -Quantos anos essa pessoa terá em 2030.
*/

public class CalculaIdadeEm2030 {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        int anoAtual, anoNascimento, idadeAtual, idadeFutura;

        anoAtual = 2024;

        System.out.print("Insira o ano em que você nasceu: ");
        anoNascimento = input.nextInt();

        idadeAtual = anoAtual - anoNascimento;
        idadeFutura = 2030 - anoNascimento;

        System.out.printf("Hoje você tem %d anos e em 2030, você terá %d anos.", idadeAtual, idadeFutura);

        input.close();
    }

}
