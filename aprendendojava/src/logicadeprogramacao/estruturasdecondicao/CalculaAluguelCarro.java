package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Uma empresa de aluguel de carros precisa cobrar pelos seus serviços.
O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo.
Além disso, o cliente paga por Km percorrido.
Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos.
No final mostre o preço a ser pago de acordo com a tabela a seguir:
    - Carros populares (aluguel de R$90 por dia)
        - Até 100Km percorridos: R$0,20 por Km
        - Acima de 100Km percorridos: R$0,10 por Km
    - Carros de luxo (aluguel de R$150 por dia)
        - Até 200Km percorridos: R$0,30 por Km
        - Acima de 200Km percorridos: R$0,25 por Km */

public class CalculaAluguelCarro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int diasAlugado, opcaoCarro;
        double kmPercorrido, valorAluguel;

        System.out.println("---- A L U G U E L - D E - C A R R O ----");
        System.out.println("  Que tipo de carro gostária de alugar?");
        System.out.println("          1 - CARRO POPULAR");
        System.out.println("          2 - CARRO DE LUXO");
        System.out.println("-----------------------------------------");
        System.out.print("Digite a opção desejada: ");
        opcaoCarro = input.nextInt();

        switch (opcaoCarro) {
            case 1:
                System.out.print("Você escolheu Carro Popular. Boa-Viagem!\n");
                break;
            case 2:
                System.out.print("Você escolheu Carro de Luxo. Boa-Viagem!\n");
                break;

            default:
                System.out.println("Opção INVALIDA!");
                break;
        }

        System.out.print("Digite quantos dias o carro ficou alugado: ");
        diasAlugado = input.nextInt();
        System.out.print("Digite a quilometragem percorrida em (Km): ");
        kmPercorrido = input.nextDouble();

        if (opcaoCarro == 1) {
            if (kmPercorrido <= 100) {
                valorAluguel = (90 * diasAlugado) + (0.20 * kmPercorrido);
            } else {
                valorAluguel = (90 * diasAlugado) + (0.10 * kmPercorrido);
            }
        } else {
            if (kmPercorrido <= 200) {
                valorAluguel = (150 * diasAlugado) + (0.30 * kmPercorrido);
            } else {
                valorAluguel = (150 * diasAlugado) + (0.25 * kmPercorrido);
            }
        }

        System.out.println("O valor a ser pago pelo aluguel é de: R$" + valorAluguel);

        input.close();

    }

}
