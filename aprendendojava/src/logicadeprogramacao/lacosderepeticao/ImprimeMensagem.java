package logicadeprogramacao.lacosderepeticao;

import java.util.Random;
import java.util.Scanner;

public class ImprimeMensagem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        Random random = new Random();

        String textoBase;
        String textoImprimir = "";
        char caracterAleatorio;

        System.out.print("Digite o texto que deseja imprimir: ");
        textoBase = input.nextLine();

        for (int i = 0; i < textoBase.length(); i++){
            System.out.println("Volta 1");
            do {
                caracterAleatorio = (char)random.nextInt(32,127);
                System.out.println(textoImprimir + caracterAleatorio);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } while (textoBase.charAt(i) != caracterAleatorio);

            textoImprimir = textoImprimir + caracterAleatorio;

            if (textoImprimir.equals(textoBase)){
                break;
            }
        }

        System.out.println(textoImprimir);
    }
}
