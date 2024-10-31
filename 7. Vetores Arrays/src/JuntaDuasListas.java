/*
Leia dois vetores: A (de tamanho 4) e B (de tamanho 7).
Construa um terceiro vetor que seja a junção de A e B
colocar os elementos de A, e em sequência, colocar os elementos de B
*/

import java.util.Scanner;
public class JuntaDuasListas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        
        int[] primeiraLista = new int[4];
        int[] segundaLista = new int[7];
        int[] juncaoLista = new int[11];

        for (int i = 0; i < primeiraLista.length; i++) {

            System.out.println("Digite o " + (i + 1) + "° Número da Lista 1: ");
            primeiraLista[i] = input.nextInt();
            
        }

        for (int i = 0; i < segundaLista.length; i++) {
            
            System.out.println("Digite o " + (i + 1) + "° Número da Lista 2: ");
            segundaLista[i] = input.nextInt();

        }

        input.close();

        for (int i = 0; i < juncaoLista.length; i++) {
            
            if (i < primeiraLista.length) {
                juncaoLista[i] = primeiraLista[i];
            } else {
                break;
            }

        }

        for (int i = primeiraLista.length; i < juncaoLista.length; i++) {
            
            juncaoLista[i] = segundaLista[i - primeiraLista.length];

        }

        for (int i = 0; i < juncaoLista.length; i++) {
            
            System.out.println((i + 1) + "° Número: " + juncaoLista[i]);

        }

    }
    
}
