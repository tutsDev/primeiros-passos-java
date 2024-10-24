import java.util.Scanner;
public class ImprimeNomesUltimoParaPrimeiro {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        String[] nomesEntrada = new String[5];
        System.out.println(nomesEntrada.length);

        for (int i = 0; i < nomesEntrada.length; i++) {

            System.out.println("Digite o " + (i + 1) + "° Nome:");
            nomesEntrada[i] = input.nextLine();

        }

        for (int i = nomesEntrada.length - 1; i >= 0; i--) {

            System.out.println((i + 1) + "° Nome: " + nomesEntrada[i]);

        }

        System.out.println("Primeiro Nome: " + nomesEntrada[0]);
        System.out.println("Ultimo Nome: " + nomesEntrada[4]);

        input.close();

    }

}