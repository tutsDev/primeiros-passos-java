/*
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os 
funcionários estatuários.
O valor máximo da prestação não poderá ultrapassar 30% do salário 
bruto.
Fazer um algoritmo que leia o salário bruto e o valor da 
prestração, informar se o empréstimo pode ou não ser concedido.
*/

import java.util.Scanner;

public class VerificaEmprestimo{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o seu salário:");
        double salarioBruto = input.nextDouble();
        
        System.out.println("Insira o valor da prestação desejada:");
        double prestacaoDesejada = input.nextDouble();
        
        double porcentagemSalario = salarioBruto * 0.30;
        
        boolean verificaPrestacao = porcentagemSalario >= prestacaoDesejada;
        
        if (verificaPrestacao == true) {
            System.out.println("O emprestimo será concedido");
        } else {
            System.out.println("O emprestimo não será concedido");
        }

        input.close();
    }
}