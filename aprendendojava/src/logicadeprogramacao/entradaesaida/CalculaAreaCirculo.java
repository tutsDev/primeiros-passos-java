package logicadeprogramacao.entradaesaida;

import java.util.Scanner;

/*Faça um algoritmo que calcule e imprima a área de um circulo.
Considere Pi = 3,14159.
*/

public class CalculaAreaCirculo {
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        double raioCirculo, areaCirculo;
        double pi = 3.14159;

        System.out.print("Insira o raio do circulo: ");
        raioCirculo = input.nextDouble();

        areaCirculo = (pi * (raioCirculo * raioCirculo));

        System.out.printf("A area do circulo é de: %.2f", areaCirculo);

        input.close();
    }
}
