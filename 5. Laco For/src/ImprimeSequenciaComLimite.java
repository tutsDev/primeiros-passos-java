/*
Faça um algoritmo que leia um número inteiro e imprima a sequência de 1 a um número 
limite.
*/

import java.util.Scanner;
public class ImprimeSequenciaComLimite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o limite da sequência:");
        int numEntrada = input.nextInt();
        int i;

        System.out.print("Sequeência: ");
        
        for (i = 1; i <= numEntrada; i++){
            
            System.out.print(i + " ");
        }

        input.close();

    }
}
