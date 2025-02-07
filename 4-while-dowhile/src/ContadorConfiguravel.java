/*Crie um contador númerico configuravél*/

import java.util.Scanner;
public class ContadorConfiguravel {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int inicio, fim, incremento;

        System.out.print("Digite o valor inícial do contador: ");
        inicio = input.nextInt();
        System.out.print("Digite o valor final do contador: ");
        fim = input.nextInt();
        System.out.print("Digite o incremento do contador: ");
        incremento = input.nextInt();

        if (inicio < fim) {
            while (inicio <= fim) {
                System.out.print(inicio + " ");
                inicio += incremento;
            }
            System.out.println("Acabou!");
        } else if (inicio > fim) {
            while (inicio >= fim) {
                System.out.print(inicio + " ");
                inicio -= incremento;
            }
        } else {
            System.out.printf("Os valores são iguais, %d Acabou!\n", inicio);
        }

        input.close();

    }
}
