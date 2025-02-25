package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Faça um algoritmo que:
Leia o código do produto e a quantidade;
Calcule e imprima o valor a ser pago pelo cliente;
Imprima o nome do produto.
*/

public class CalculaPedidoLanchonete {

    public static void main(String[] args){

        System.out.println("=====================CARDÁPIO=====================");
        System.out.println("===========CÓDIGO=====PRODUTO=====PREÇO===========");
        System.out.println("          100 - Cachorro Quente - R$1,20");
        System.out.println("           101 - Bauru Simples - R$1,30");
        System.out.println("           102 - Bauru com Ovo - R$1,50");
        System.out.println("             103 - Hambúrguer - R$1,20");
        System.out.println("            104 - Chessburguer - R$1,30");
        System.out.println("            105 - Refrigerante - R$1,00");
        System.out.println("==================================================");

        Scanner input = new Scanner(System. in);

        System.out.println("Insira o código do produto desejado:");
        int codProduto = input.nextInt();

        System.out.println("Insira a quantidade do produto desejado:");
        int qtdProduto = input.nextInt();

        switch (codProduto){

            case 100:
                double valorTotal0 = 1.20 * qtdProduto;
                System.out.println("O valor total do seu Cachorro Quente é de: R$" + valorTotal0);
                break;

            case 101:
                double valorTotal1 = 1.30 * qtdProduto;
                System.out.println("O valor total do seu Bauru Simples é de: R$" + valorTotal1);
                break;

            case 102:
                double valorTotal2 = 1.50 * qtdProduto;
                System.out.println("O valor total do seu Bauru com Ovo é de: R$" + valorTotal2);
                break;

            case 103:
                double valorTotal3 = 1.20 * qtdProduto;
                System.out.println("O valor total do seu Hambúrguer é de: R$" + valorTotal3);
                break;

            case 104:
                double valorTotal4 = 1.30 * qtdProduto;
                System.out.println("O valor total do seu Chessburguer é de: R$" + valorTotal4);
                break;

            case 105:
                double valorTotal5 = 1.00 * qtdProduto;
                System.out.println("O valor total do seu Refrigerante é de: R$" + valorTotal5);
                break;

            default:
                System.out.println("Insira um código de produto válido");

        }

        input.close();

    }

}
