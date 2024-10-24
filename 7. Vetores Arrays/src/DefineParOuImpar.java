import java.util.Scanner;
public class DefineParOuImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        
        int[] numerosEntrada = new int[10];
        int[] numerosPares = new int[10];
        int[] numerosImpares = new int[10];

        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < numerosEntrada.length; i++) {
            
            System.out.println("Digite o " + (i + 1) + "° Número:");
            numerosEntrada[i] = input.nextInt();

            if (numerosEntrada[i] % 2 == 0) {

                numerosPares[countPares] = numerosEntrada[i];
                countPares++;  

            } else {

                numerosImpares[countImpares] = numerosEntrada[i];
                countImpares++;

            }

        }

        for (int i = 0; i < numerosPares.length; i++) {

            if (numerosPares[i] == 0) {
                break;
            }
            System.out.println((i + 1) + "° Número Par: " + numerosPares[i]);

        }

        for (int i = 0; i < numerosImpares.length; i++) {

            if (numerosImpares[i] == 0) {
                break;
            }
            System.out.println((i + 1) + "° Número Impar: " + numerosImpares[i]);
            
        }

        input.close();

    }
    
}
