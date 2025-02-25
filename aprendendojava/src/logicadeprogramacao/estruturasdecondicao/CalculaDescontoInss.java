package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;


/*Faça um algoritmo que leia o salário de uma pessoa, calcula e
imprima o desconto do INSS de acordo com a tabela a seguir:
    <= R$600 - Isento
    > R$600 e <= R$1200 20%
    > R1200 e <= R$2000 25%
    <= R$2000
*/

public class CalculaDescontoInss{
    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        double salarioBruto, desconto20, desconto25, desconto30;

        System.out.println("Insira o seu salário:");
        salarioBruto = input.nextDouble();

        if (salarioBruto <= 600) {
            System.out.println("Seu salário é: R$%.2f e você está Isento.");
        } else if (salarioBruto > 600 && salarioBruto <=1200) {
            desconto20 = (salarioBruto * 0.20);
            System.out.printf("Seu salário é: R$%.2f o seu desconto é de 20%, será descontado: R$%.2f", salarioBruto, desconto20);
        } else if (salarioBruto > 1200 && salarioBruto <=2000) {
            desconto25 = (salarioBruto * 0.25);
            System.out.printf("Seu salário é: R$%.2f o seu desconto é de 25%, será descontado: R$%.2f", salarioBruto, desconto25);
        } else{
            desconto30 = (salarioBruto * 0.30);
            System.out.printf("Seu salário é: R$%.2f o seu desconto é de 30%, será descontado: R$%.2f", salarioBruto, desconto30);
        }

        input.close();
    }
}
