package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*A prefeitura do Rio de Janeiro abriu uma linha de crédito para os
funcionários estatuários.
O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto.
Fazer um algoritmo que leia o salário bruto e o valor da
prestração, informar se o empréstimo pode ou não ser concedido.
*/

public class VerificaPossibilidadeEmprestimo {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        double salarioBruto, prestacaoDesejada, porcentagemSalario;
        boolean verificaPrestacao;

        System.out.println("Insira o seu salário:");
        salarioBruto = input.nextDouble();

        System.out.println("Insira o valor da prestação desejada:");
        prestacaoDesejada = input.nextDouble();

        porcentagemSalario = salarioBruto * 0.30;

        verificaPrestacao = porcentagemSalario >= prestacaoDesejada;

        if (verificaPrestacao == true) {
            System.out.println("O emprestimo será concedido");
        } else {
            System.out.println("O emprestimo não será concedido");
        }

        input.close();
    }

}
