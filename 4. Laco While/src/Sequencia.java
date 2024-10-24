import java.util.Scanner;

public class Sequencia {
    
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
