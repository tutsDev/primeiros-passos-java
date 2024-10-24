import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
    public static void main(String[] args) {
        
        Random randomGenerate = new Random();
        Scanner input = new Scanner(System. in);

        int numGenerate = 1 + randomGenerate.nextInt(9 + 1);

        int numInput = 0;

        while (numInput != numGenerate) {
            
            System.out.println("Tente adivinhar o número de 1 a 10");
            numInput = input.nextInt();

        }

        System.out.println("Parabens, você acertou!");

        input.close();

        

    }
}