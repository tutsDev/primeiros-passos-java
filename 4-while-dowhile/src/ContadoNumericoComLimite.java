/*Crie um contador númerico onde o usuário pode inserir o limite*/

import java.util.Scanner;
public class ContadoNumericoComLimite {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int limite;
        int count = 1;

        System.out.print("Digite um número limite: ");
        limite = input.nextInt();

        while (count <= limite) {
            System.out.print(count + " ");
            count++;
        }

        System.out.println("Acabou!");

        input.close();

    }
}
