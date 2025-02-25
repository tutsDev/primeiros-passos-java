package logicadeprogramacao.lacosderepeticao;

import java.util.Scanner;

/*Faça um algoritmo para dividir dois números sem usar o operador de divisão.
*/

public class DivideDoisNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        double dividendo, divisor;
        double quociente = 0;

        System.out.print("Insira o número que deseja dividir: ");
        dividendo = input.nextDouble();

        System.out.println("Por quanto quer dividir?");
        divisor = input.nextDouble();

        while (dividendo > 0) {
            dividendo = dividendo - divisor;
            quociente++;
        }

        System.out.println("O resultado da divisão é de: " + quociente);

        input.close();

    }

}
