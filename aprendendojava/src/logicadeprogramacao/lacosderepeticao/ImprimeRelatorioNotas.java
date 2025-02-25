package logicadeprogramacao.lacosderepeticao;

import java.util.Scanner;

/*Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
a) A média aritmética das duas notas de cada aluno;
b) Forneça a seguinte mensagem de acordo com a nota:
    ¨ REPROVADO se média é menor ou igual a 3.
    ¨ EXAME se média é acima de 3 e menor que 7.
    ¨ APROVADO maior ou igual a 7
c) O total de alunos aprovados.
d) O total de alunos de exame.
e) O total de alunos reprovados.
f) A média da classe.
*/

public class ImprimeRelatorioNotas {
    public static void main(String[] args) {

        int i = 0;

        double nota1 = 0;
        double nota2 = 0;

        double mediaNotas = 0;

        int acumulaAprovados = 0;
        int acumulaExame = 0;
        int acumulaReprovados = 0;

        double acumulaMedia = 0;

        Scanner input =  new Scanner(System. in);

        for (i = 1; i <= 6; i++){

            do{

                System.out.println("Insira a primeira nota do aluno " + i + ":");
                nota1 = input.nextDouble();

            } while (nota1 < 0 || nota1 > 10);


            do {

                System.out.println("Insira a segunda nota do aluno " + i + ":");
                nota2 = input.nextDouble();

            } while (nota2 < 0 || nota2 > 10);


            mediaNotas = (nota1 + nota2) / 2;
            acumulaMedia = acumulaMedia + mediaNotas;

            if (mediaNotas >= 7){

                System.out.println("O aluno " + i + " foi aprovado.");
                acumulaAprovados++;

            } else if (mediaNotas > 3 && mediaNotas < 7 ){

                System.out.println("O aluno " + i + " irá para o exame.");
                acumulaExame++;

            } else {

                System.out.println("O aluno " + i + " foi reprovado.");
                acumulaReprovados++;

            }

        }

        System.out.println("A quantidade de alunos aprovados foi: " + acumulaAprovados);
        System.out.println("A quantidade de alunos para exame foi: " + acumulaExame);
        System.out.println("A quantidade de alunos reprovados foi: " + acumulaReprovados);

        double mediaClasse = acumulaMedia / 6;
        System.out.println("A média da classe foi: " + mediaClasse);

        System.out.println(i);

        input.close();
    }

}
