/*
Faça um algoritmo que leia o salário de uma pessoa, calcula e 
imprima o desconto do INSS de acordo com a tabela a seguir:
<= R$600 - Isento
> R$600 e <= R$1200 20%
> R1200 e <= R$2000 25%
<= R$2000
*/

import java.util.Scanner;

public class CalculaDescontoInss{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o seu salário:");
        double salarioBruto = input.nextDouble();
        
        if (salarioBruto <= 600) {
            System.out.println("Seu salário é: R$" + salarioBruto + " e você está Isento.");
        } else if (salarioBruto > 600 && salarioBruto <=1200) {
            double desconto1 = (salarioBruto * 0.20);
            System.out.println("Seu salário é: R$" + salarioBruto + " o seu desconto é de 20%, será descontado: R$" + desconto1);
        } else if (salarioBruto > 1200 && salarioBruto <=2000) {
            double desconto2 = (salarioBruto * 0.25);
            System.out.println("Seu salário é: R$" + salarioBruto + " o seu desconto é de 25%, será descontado: R$" + desconto2);
        } else{
            double desconto3 = (salarioBruto * 0.30);
            System.out.println("Seu salário é: R$" + salarioBruto + " o seu desconto é de 30%, será descontado: R$" + desconto3);
        }

        input.close();
    }
}