/*
Faça uma calculadora de operações básicas.
 - Menos
 + Mais
 * Multiplicação
 / Divisão
*/

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {

        System.out.println("==============Bem-Vindo a Calculadora==============");
        System.out.println("Insira o sinal da operação desejada!");
        System.out.println("Adição - +");
        System.out.println("Subtração - -");
        System.out.println("Multiplicação - *");
        System.out.println("Divisão - /");
        System.out.println("=================Menu de Operações=================");

        Scanner input = new Scanner(System. in);

        String sinalOperacao = input.nextLine();

        System.out.println("Insira o primeiro numero para operação");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo numero para operação");
        int num2 = input.nextInt();

        if (sinalOperacao.equals("+")) {
            System.out.println("O valor da Soma é de: " + (num1 + num2));
        } 
        else if (sinalOperacao.equals("-")){
            System.out.println("O valor da Subtração é de: " + (num1 - num2));
        } 
        else if (sinalOperacao.equals("*")){
            System.out.println("O valor da Multipliação é de: " + (num1 * num2));
        }
        else if (sinalOperacao.equals("/")){
            if (num2 > 0) {
                System.out.println("O valor da Divisão é de: " + (num1 / num2));
            }
            else {
                System.out.println("Inpossível Dividir, Insira outro divisor!");
            }
        }  
        else {
            System.out.println("Operação Inválida!");
        }

        input.close();

    }

}