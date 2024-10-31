/*
Faça um algoritmo que leia dez números inteiros e positivos.
Imprima o menor entre eles.
*/

import java.util.Scanner;

public class ImprimeMenor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int contador = 1;
        int numero = 0;
        int resultado = Integer.MAX_VALUE;

        while (contador <= 10) {

            System.out.println("Insira o número " + contador + ":");
            numero = input.nextInt();
            contador++;
            
            if (numero < resultado) {
                resultado = numero;
            }
        }

        System.out.println("O menor número digitado foi: " + resultado);

        input.close();

    }

}