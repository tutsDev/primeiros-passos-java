import java.util.Scanner;

public class Menor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int contador = 1;
        int numero = 0;
        int resultado = 999999999;

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