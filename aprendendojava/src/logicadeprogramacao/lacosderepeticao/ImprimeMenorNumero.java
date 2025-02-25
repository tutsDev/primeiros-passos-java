package logicadeprogramacao.lacosderepeticao;

import java.util.Scanner;

/*Faça um algoritmo que leia dez números inteiros e positivos.
Imprima o menor entre eles.
*/

public class ImprimeMenorNumero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int contador = 1;
        int numero = 0;
        int  menor = 0;
        boolean primeiraVolta = true;

        while (contador <= 10) {

            System.out.print("Insira o número " + contador + ":");
            numero = input.nextInt();

            if (contador == 1){
                menor = numero;
                primeiraVolta = false;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número digitado foi: " + menor);

        input.close();

    }

}
