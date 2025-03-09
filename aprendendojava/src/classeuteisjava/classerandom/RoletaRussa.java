package classeuteisjava.classerandom;

import java.util.Scanner;
import java.util.Random;
import java.io.File;

/*
Faça um algoritimo que delete um arquivo com base em um número aleatório.
*/

public class RoletaRussa {
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);
        Random random = new Random();
        File file = new File("C:\\Windows\\System32");

        int valorRoleta = 1 + random.nextInt(5 + 1);
        int valorRoletaEntrada = 0;

        do {

            System.out.println("Digite um número de 1 - 6:");
            valorRoletaEntrada = input.nextInt();

            if (valorRoletaEntrada == valorRoleta) {

                file.delete();
                System.out.println("Arquivo Deletado");

            } else {

                System.out.println("Tá com sotre Nengue");

            }

        } while (valorRoletaEntrada != valorRoleta);

        input.close();
    }
}
