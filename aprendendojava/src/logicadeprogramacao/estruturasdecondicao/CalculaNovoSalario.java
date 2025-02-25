package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*Uma empresa precisa reajustar o salário dos seus funcionários, dando um aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%*/

public class CalculaNovoSalario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String nomeFuncoinario;
        int anosEmpresa, opcaoSexo;
        double salarioFuncionario, novoSalario ;

        System.out.printf("Digite o seu nome: ");
        nomeFuncoinario = input.nextLine();
        System.out.printf("Olá, %s. Digite seu sexo(1 - Masculino / 2 - Feminino): ", nomeFuncoinario);
        opcaoSexo = input.nextInt();
        System.out.printf("%s, digite seu salário atual: ", nomeFuncoinario);
        salarioFuncionario = input.nextDouble();
        System.out.printf("Agora, digite a quantos anos você está na empresa: ");
        anosEmpresa = input.nextInt();

        switch (opcaoSexo) {
            case 1:
                if (anosEmpresa < 20 ) {
                    novoSalario = salarioFuncionario + (salarioFuncionario * 0.03);
                } else if (anosEmpresa >= 20 && anosEmpresa < 30) {
                    novoSalario = salarioFuncionario + (salarioFuncionario * 0.13);
                } else {
                    novoSalario = salarioFuncionario + (salarioFuncionario * 0.25);
                }

                System.out.printf("%s, seu novo salário é de R$%.2f\n", nomeFuncoinario, novoSalario);
                break;
            case 2:
                if (anosEmpresa < 15 ) {
                    novoSalario = salarioFuncionario + (salarioFuncionario * 0.05);
                } else if (anosEmpresa >= 15 && anosEmpresa < 20) {
                    novoSalario = salarioFuncionario + (salarioFuncionario * 0.12);
                } else {
                    novoSalario = salarioFuncionario + (salarioFuncionario * 0.23);
                }

                System.out.printf("%s, seu novo salário é de R$%.2f\n", nomeFuncoinario, novoSalario);
                break;

            default:
                System.out.printf("SEXO INVÁLIDO! Impossível calcular aumento.\n");
                break;
        }

        input.close();

    }
}
