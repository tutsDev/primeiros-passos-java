import java.util.Scanner;

public class QtdParesImpares {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int contador = 1;
        int qtdPares = 0;
        int qtdImpares = 0;
        int numeros = 0;

        while (contador <= 10) {
            System.out.println("Insira o número " + contador + ":" );
            numeros = input.nextInt();

            if (numeros % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }

            contador++;
        }

        System.out.println("A quantidade de pares é de: " + qtdPares + " e a quantidade de impares é de: " + qtdImpares);

        input.close();

    }

}