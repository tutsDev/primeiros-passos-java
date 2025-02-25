package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres.
Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto */

public class CalculaDescontoDiaDasMulheres {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String nomeCliente, sexoCliente;
        double valorCompra, valorComDesconto;

        System.out.print("Digite seu nome: ");
        nomeCliente = input.nextLine();
        System.out.printf("Olá, %s. Digite seu sexo (Masculino / Feminino): ", nomeCliente);
        sexoCliente = input.nextLine();
        System.out.print("Digite o valor da compra: ");
        valorCompra = input.nextDouble();

        if (sexoCliente.toUpperCase().equals("MASCULINO")) {
            valorComDesconto = valorCompra - (valorCompra * 0.05);
            System.out.printf("Olá, %s. Hoje os homens também ganham desconto! Seu desconto é de 5%%. Sua compra de %.2f, ficará %.2f.\n", nomeCliente, valorCompra, valorComDesconto);
        } else if (sexoCliente.toUpperCase().equals("FEMININO")) {
            valorComDesconto = valorCompra - (valorCompra * 0.13);
            System.out.printf("Olá, %s. Parabéns pelo Dia das Mulheres! Seu desconto é de 13%%. Sua compra de %.2f, ficará %.2f.\n", nomeCliente, valorCompra, valorComDesconto);
        } else {
            System.out.println("Sexo DESCONHECIDO, tente novamente!");
        }

        input.close();

    }
}
