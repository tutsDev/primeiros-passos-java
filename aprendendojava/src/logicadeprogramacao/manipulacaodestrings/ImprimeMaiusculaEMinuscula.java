package logicadeprogramacao.manipulacaodestrings;

import java.util.Scanner;

/*Peça um nome e mostre ele em maiúsculas e minúsculas.*/

public class ImprimeMaiusculaEMinuscula {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        String nome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.printf("Nome maiúsculo: %s\n", nome.toUpperCase());
        System.out.printf("Nome minúsculo: %s\n", nome.toLowerCase());

        input.close();

    }
}
