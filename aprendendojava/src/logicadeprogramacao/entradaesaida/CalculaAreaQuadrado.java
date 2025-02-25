package logicadeprogramacao.entradaesaida;

import java.util.Scanner;

/*Faça um algoritmo que calcule e imprima a área de um quadrado.
 */

public class CalculaAreaQuadrado {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        double ladoQuadrado, areaQuadrado;

        System.out.print("Insira o valor do lado do quadrado: ");
        ladoQuadrado = input.nextDouble();

        areaQuadrado = (ladoQuadrado * ladoQuadrado);

        System.out.printf("A área do quadrado é de: %.2f", areaQuadrado);

        input.close();
    }

}