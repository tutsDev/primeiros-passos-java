/*
Construir uma algoritmo que leia um número inteiro e imprime a sequência:
1, 2, 4, 8, 16, 32, 64, 128...
Enquanto o valor da sequência for menor ou igual ao número lido.
*/

import java.util.Scanner;

public class ImprimeSequenciaVezes2 {
    
    public static void main(String[] args) {
        
        int contador = 1;
        int sequencia = 1;
        int numEntrada = 0;

        Scanner input = new Scanner(System. in);

        System.out.println("Insira um número limite:");
        numEntrada = input.nextInt();

        while (contador <= numEntrada) {
            System.out.println(sequencia);
            sequencia = sequencia * 2;
            contador = contador * 2;
        }

        input.close();

    }

}
