package logicadeprogramacao.lacosderepeticao;

import java.util.Scanner;

/*Faça um algoritmo que leia a altura e o peso de 10 pessoas.
Calcule o IMC da pessoa e verifique quantas estão com o IMC entre 18,5 e 24,9
que é considerado sem obesidade.
*/

public class CalculaImcVerificaObesidade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        System.out.println("Vamos calcular seu IMC!");

        int contador = 1;
        double peso, altura, imc;
        int semObesidade = 0;

        while (contador <= 10) {

            System.out.println("Seja bem-vindo pessoa " + contador);

            System.out.println("Qual seu peso?");
            peso = input.nextDouble();

            System.out.println("Qual sua altura?");
            altura = input.nextDouble();

            imc = peso / (altura * altura) ;

            System.out.println("O Imc da pessoa " + contador + " é: " + imc);

            if (imc >= 18.5 && imc <= 24.90){
                semObesidade++;
            }

            contador++;

        }

        System.out.println("A quantidade de pessoas sem obesidade é de: " + semObesidade);

        input.close();

    }

}
