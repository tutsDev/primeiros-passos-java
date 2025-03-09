package logicadeprogramacao.manipulacaodestrings;

import java.util.Scanner;

/*Peça ao usuário um email:
    - Verifique se o email é um Gmail.
*/

public class VerificaSeGmail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String email;

        System.out.print("Entre com sua conta Google: ");
        email = input.nextLine();

        if (email.endsWith("@gmail.com")){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Não foi possível entrar, verifique se realmente está usando uma conta Google.");
        }

        input.close();

    }
}
