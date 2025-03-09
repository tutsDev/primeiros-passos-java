package logicadeprogramacao.manipulacaodestrings;

import java.util.Scanner;

/*Peça para o usuário digitar uma frase e mostre quantos caracteres ela tem.*/

public class ImprimeQtdDeCaracteres {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        String fraseUsuario;

        System.out.print("Escreva algo: ");
        fraseUsuario = input.nextLine();

        System.out.printf("O texto do usuário possui : %d carcateres", fraseUsuario.length());

        input.close();

    }
}
