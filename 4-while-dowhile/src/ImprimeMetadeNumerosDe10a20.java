/*
Faça um algoritmo que imprima a metade de cada número de 10 a 20.
*/

public class ImprimeMetadeNumerosDe10a20 {
    
    public static void main(String[] args) {
        
        double contador = 10;
        double metade = 0;

        while(contador <= 20){

            metade = contador / 2;
            System.out.println("A metade de " + contador + " é " + metade);
            contador++;

        }

    }

}