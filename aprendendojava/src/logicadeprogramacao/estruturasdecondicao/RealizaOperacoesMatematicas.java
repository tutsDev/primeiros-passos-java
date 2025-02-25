package logicadeprogramacao.estruturasdecondicao;

/*
Faça um algoritmo que receba dois números:
De acordo com a opção do usuário, execute as operações listadas a seguir:
M - Média entre dois números;
S - Diferença entre os dois números;
P - Produto dos dois números;
D - Divisão dos primeiro pelo segundo número.
*/

import java.util.Scanner;

public class RealizaOperacoesMatematicas {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        System.out.println("Qual operação deseja realizar? Escolha uma opção");
        System.out.println("==========Menu de Opções==========");
        System.out.println("M - Média entre dois números");
        System.out.println("S - Diferença entre os dois números");
        System.out.println("P - Produto dos dois números");
        System.out.println("D - Divisão dos primeiro pelo segundo número");
        System.out.println("==================================");
        String opcaoOperacao = input.nextLine();

        System.out.println("Insira o primeiro número para operação");
        double num1 = input.nextDouble();
        System.out.println("Insira o segundo número para operação");
        double num2 = input.nextDouble();

        switch (opcaoOperacao){

            case "M":
                double calculaMedia = (num1 + num2) / 2;
                System.out.println("A média dos números é: " + calculaMedia);
                break;
            case "S":
                double calculaDiferenca = num1 - num2;
                System.out.println("A diferença dos números é de: " + calculaDiferenca);
                break;
            case "P":
                double calculaProduto = num1 * num2;
                System.out.println("O calculaProduto dos números é: " + calculaProduto);
                break;
            case "D":
                double calculaDivisao = num1 / num2;
                System.out.println("A divisão do primeiro pelo segndo é: " + calculaDivisao);
                break;
            default:
                System.out.println("Insira uma operação válida");
                break;

        }

        input.close();

    }

}
