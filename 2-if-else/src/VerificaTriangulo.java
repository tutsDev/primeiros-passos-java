/*Crie um programa que leia o tamanho de três segmentos de reta. Analise seus comprimentos e diga se é possível formar um triângulo com essas retas. 
Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.
[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes
 */

import java.util.Scanner;
public class VerificaTriangulo {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System. in);

        int reta1, reta2, reta3;

        System.out.print("Digite o tamanho da primeira reta: ");
        reta1 =  input.nextInt();
        System.out.print("Digite o tamanho da segunda reta: ");
        reta2 =  input.nextInt();
        System.out.print("Digite o tamanho da terceira reta: ");
        reta3 =  input.nextInt();

        if (reta1 < (reta2 + reta3) && reta2 < (reta1 + reta3) && reta3 < (reta1 + reta2)) {
            System.out.print("É possível formar o triângulo!");

            if (reta1 == reta2 && reta1 == reta3) {
                System.out.print(" Formará um triângulo EQUILÁTERO.\n");
            } else if (reta1 == reta2 || reta1 == reta3 || reta2 == reta3) {
                System.out.print(" Formará um triângulo ISÓSCELES.\n");
            } else {
                System.out.print(" Formará um triângulo ESCALENO.\n");
            }

        } else {
            System.out.println("Não é possível formar o triângulo!");
        }

        input.close();

    }
}
