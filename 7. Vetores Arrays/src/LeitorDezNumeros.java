import java.util.Scanner;
public class LeitorDezNumeros{

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int[] numerosEntrada = new int[10];

        for (int i = 0; i < numerosEntrada.length; i++) {
            
            System.out.println("Digite o " + (i + 1) + "° Número:");
            numerosEntrada[i] = input.nextInt();

        }

        for (int i = 0; i < numerosEntrada.length; i++) {
            
            System.out.println((i + 1) + "° Número " + numerosEntrada[i]);

        }

        input.close();
        
    }

}