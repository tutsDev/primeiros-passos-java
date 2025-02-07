/*Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/

import java.util.Scanner;
public class JogoJoKenPo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        String P1, P2;

        System.out.println("-----------------------");
        System.out.println("  J O - K E N - P O");
        System.out.println("-----------------------");
        System.out.println("É a vez do Player 1");
        System.out.print("Digite sua jogada (Pedra / Papel / Tesoura): ");
        P1 = input.nextLine();

        System.out.println();

        System.out.println("-----------------------");
        System.out.println("  J O - K E N - P O");
        System.out.println("-----------------------");
        System.out.println("É a vez do Player 2");
        System.out.print("Digite sua jogada (Pedra / Papel / Tesoura): ");
        P2 = input.nextLine();

        if(P1.equals("Pedra") && P2.equals("Tesoura") || P1.equals("Tesoura") && P2.equals("Papel") || P1.equals("Papel") && P2.equals("Pedra")){
            System.out.println("Player 1 VENCEU!");
        } else if (P2.equals("Pedra") && P1.equals("Tesoura") || P2.equals("Tesoura") && P1.equals("Papel") || P2.equals("Papel") && P1.equals("Pedra")) {
            System.out.println("Player 2 VENCEU!");
        } else {
            System.out.println("EMPATOU!");
        }

        input.close();

    }

}
