/*
Faça um algoritmo para mutiplicar dois números sem usar o operador de mutiplicação.
*/

import java.util.Scanner;

public class CalculaMultiplicacao{

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