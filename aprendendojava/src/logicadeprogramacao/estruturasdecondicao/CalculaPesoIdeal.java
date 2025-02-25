package logicadeprogramacao.estruturasdecondicao;

import java.util.Scanner;

/*
Faça um algoritmo que leia a altura e o sexo de uma pessoa:
Calcule e mostre seu peso ideal.
Considere as seguintes forulas:
    - Masculino: (72.7 * altura) - 58;
    - Feminino: (62.1 * altura) - 44.7;
*/

public class CalculaPesoIdeal{

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        String sexo;
        double altura, pesoIdealMasc, pesoIdealFem;

        System.out.println("Qual o seu sexo? Masculino ou Feminino?");
        sexo = input.nextLine();

        System.out.println("Insira sua altura (Ex = 1,70)");
        altura = input.nextDouble();

        if (sexo.equals("Masculino")) {
            pesoIdealMasc = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é: " + pesoIdealMasc + "Kg");

        } else if (sexo.equals("Feminino")){
            pesoIdealFem = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é: " + pesoIdealFem + "Kg");

        } else {
            System.out.println("Por favor, insira um sexo válido!");
        }

        input.close();

    }

}
