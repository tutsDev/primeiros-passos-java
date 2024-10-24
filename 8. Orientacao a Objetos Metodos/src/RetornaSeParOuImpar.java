import java.util.Scanner;

public class RetornaSeParOuImpar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        System.out.println("Digite um número:");
        int numEntrada = input.nextInt();
        isPar(numEntrada);

        input.close();

    }

    public static void isPar(int n1){

        if (n1 % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

    }

}
