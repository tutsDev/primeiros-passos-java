package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/* A empresa XSoftware concedeu um bônus de 20% do valor do salário a
todos os funcionários com tempo de trabalho na empresa igual ou
superior a 5 anos e de 10% aos demais funcionários.
Faça um algoritmo que leia o salário e a quantidade de anos de cada
funcionário, calcule e imprima o valor do bônus.
*/

public class CalculaBonusSalario{

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        double salarioBruto, bonusVinte, bonusDez;
        int anosEmpresa;

        System.out.print("Insira seu salário:");
        salarioBruto = input.nextDouble();

        System.out.print("A quantos anos está na empres?");
        anosEmpresa = input.nextInt();

        if (anosEmpresa >= 5){
            bonusVinte = (salarioBruto * 0.20);
            System.out.printf("O seu bônus séra de 20%, você irá receber R$%.2f de bônus", bonusVinte);
        } else {
            bonusDez = (salarioBruto * 0.10) + salarioBruto;
            System.out.printf("O seu bônus séra de 10%, você irá receber R$%.2f de bônus", bonusDez);
        }

        input.close();

    }
}
