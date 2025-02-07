/*
Faça um algoritmo que apresente na tela os quadrados dos números inteiros de 15 a 100.
*/

public class ImprimeQuadradosDe15a100 {
    public static void main(String[] args) {

        int i;
        double quadrado;

        for (i = 15; i <= 100; i++){
            quadrado = i * i;
            System.out.println("O quadrado de " + i + " é " + quadrado);
        }

    }
}
