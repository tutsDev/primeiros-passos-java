/*
Faça um algoritmo que leia o código de um produto e a quantidade que o cliente 
deseja comprar.
O cliente pode comprar mais de um produto, pergunte se ele deseja continuar.
Calcule o valor total a ser pago por cada produto e o valor total da compra.
*/

import java.util.Scanner;

public class Lanchonete{

    public static void main(String[] args) {

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
        
        int controle = 1;
        int codItem, qtdItem;
        double totalPedido = 0;

        while (controle == 1) {

            System.out.println("O que deseja comprar?");
            codItem = input.nextInt();

            System.out.println("Quantos você quer?");
            qtdItem = input.nextInt();

            switch (codItem){
            
                case 100:
                    double valorTotal0 = 1.20 * qtdItem;
                    System.out.println("O valor total do seu Cachorro Quente é de: R$" + valorTotal0);

                    totalPedido = totalPedido + valorTotal0;
                    break;
                    
                case 101:
                    double valorTotal1 = 1.30 * qtdItem;
                    System.out.println("O valor total do seu Bauru Simples é de: R$" + valorTotal1);

                    totalPedido = totalPedido + valorTotal1;
                    break;
                    
                case 102:
                    double valorTotal2 = 1.50 * qtdItem;
                    System.out.println("O valor total do seu Bauru com Ovo é de: R$" + valorTotal2);

                    totalPedido = totalPedido + valorTotal2;
                    break;
                    
                case 103:
                    double valorTotal3 = 1.20 * qtdItem;
                    System.out.println("O valor total do seu Hambúrguer é de: R$" + valorTotal3);

                    totalPedido = totalPedido + valorTotal3;
                    break;
                    
                case 104:
                    double valorTotal4 = 1.30 * qtdItem;
                    System.out.println("O valor total do seu Chessburguer é de: R$" + valorTotal4);

                    totalPedido = totalPedido + valorTotal4;
                    break;
                    
                case 105:
                    double valorTotal5 = 1.00 * qtdItem;
                    System.out.println("O valor total do seu Refrigerante é de: R$" + valorTotal5);

                    totalPedido = totalPedido + valorTotal5;
                    break;
                    
                default:
                    System.out.println("Insira um código de produto válido");
                
            }

            System.out.println("Deseja continuar comprando? (1 - Sim / 0 - Não)");
            controle = input.nextInt();

        }

        System.out.println("Compra finalizada o valor do seu pedido é de: R$" + totalPedido);
        
        input.close();

    }

}