package logicadeprogramacao.entradaesaida;

import java.util.Scanner;

/*Faça um algoritmo que leia três notas de um aluno.
Calcule e mostre a média aritmética do aluno.
*/

public class CalculaMediaAritmetica {

    public static void main(String[] args){

        Scanner input = new Scanner(System. in);

        String nomeAluno;
        double nota1, nota2, nota3, mediaAritmetica;

        System.out.print("Digite seu nome: ");
        nomeAluno = input.nextLine();

        System.out.printf("Olá, %s! Insira suas notas.\n", nomeAluno);
        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = input.nextDouble();

        mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do %s é de: %.2f", nomeAluno, mediaAritmetica);

        input.close();

    }

}
