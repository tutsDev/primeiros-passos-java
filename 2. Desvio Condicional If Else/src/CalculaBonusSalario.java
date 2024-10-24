/*
A empresa XSoftware concedeu um bônus de 20% do valor do salário a 
todos os funcionários com tempo de trabalho na empresa igual ou 
superior a 5 anos e de 10% aos demais funcionários.
Faça um algoritmo que leia o salário e a quantidade de anos de cada
funcionário, calcule e imprima o valor do bônis.
*/

import java.util.Scanner;

public class CalculaBonusSalario{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira seu salário:");
        double salarioBruto = input.nextDouble();
        
        System.out.println("A quantos anos está na empres?");
        int anosEmpresa = input.nextInt();
        
        if (anosEmpresa >= 5){
            double bonusVinte = (salarioBruto * 0.20);
            System.out.println("O seu bônus séra de 20%, você irá receber R$" + bonusVinte + " de bônus");
        } else {
            double bonusDez = (salarioBruto * 0.10) + salarioBruto;
            System.out.println("O seu bônus séra de 10%, você irá receber R$" + bonusDez + " de bônus"); 
        }
    
        input.close();
        
    }
}