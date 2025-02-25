package logicadeprogramacao.lacosderepeticao;

import java.util.Scanner;

/*Faça um algoritmo para mutiplicar dois números sem usar o operador de mutiplicação.
 */

public class MultiplicaDoisNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        double numMultiplicando, numMultiplicador;
        double numProduto = 0;

        System.out.println("Insira o valor a ser multiplicado:");
        numMultiplicando = input.nextDouble();

        System.out.println("Insira por quanto deseja multiplicar:");
        numMultiplicador = input.nextDouble();

        while (numMultiplicador > 0) {
            numProduto = numProduto + numMultiplicando;
            numMultiplicador--;
        }

        System.out.println("O resultado da multiplicação é de: " + numProduto);

        input.close();

    }

}
