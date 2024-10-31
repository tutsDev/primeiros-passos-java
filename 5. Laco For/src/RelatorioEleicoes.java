/*
Em uma eleição presidencial, existem quatro candidatos.
Os votos são informados através de um código:
¨ 1, 2, 3 ou 4 - Voto para o respectivo candidato
¨ 5 - Voto nulo
¨ 6 - Voto em branco
Faça um algoritmo que leia o voto de 10 eleitores.
Calcule e mostre:
¨ a) O total de votos para cada candidato;
¨ b) O total de votos nulos;
¨ c) O total de votos em branco;
¨ d) O percentual dos votos brancos e nulos.
*/

import java.util.Scanner;
public class RelatorioEleicoes {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        System.out.println("========CANDIDATOS========");
        System.out.println("1 - Pablo Marçal");
        System.out.println("2 - Ricardo Nunes");
        System.out.println("3 - Guilherme Boulos");
        System.out.println("4 - Tabata Amaral");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("==========================");
    
        int votoEleitor = 0;

        int votosCdto1 = 0;
        int votosCdto2 = 0;
        int votosCdto3 = 0;
        int votosCdto4 = 0;
        int votosNulo = 0;
        int votosBranco = 0;

        int i = 0;

        for (i = 1; i <= 10; i++){

            do{

                System.out.println("Olá eleitor " + i + ", qual seu voto?");
                votoEleitor = input.nextInt();

            } while (votoEleitor < 1 || votoEleitor > 6);
            

            switch (votoEleitor) {
                case 1:
                    votosCdto1++;
                    break;
                case 2:
                    votosCdto2++;
                    break;
                case 3:
                    votosCdto3++;
                    break;
                case 4:
                    votosCdto4++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
            }
        }

        double porcentagemNulos = (votosNulo * 100) / 10;
        double porcentagemBrancos = (votosBranco * 100) / 10;

        System.out.println("O Candidato 1 teve " + votosCdto1 + " votos.");
        System.out.println("O Candidato 2 teve " + votosCdto2 + " votos.");
        System.out.println("O Candidato 3 teve " + votosCdto3 + " votos.");
        System.out.println("O Candidato 4 teve " + votosCdto4 + " votos.");
        System.out.println("A quantidade de Votos Nulos foi " + votosNulo + " votos.");
        System.out.println("A quantidade de Votos em Branco foi " + votosBranco + " votos.");
        System.out.println("A porcentagem de Votos Nulos foi de " + porcentagemNulos + "%");
        System.out.println("A porcentagem de Votos em Branco foi de " + porcentagemBrancos + "%");

        input.close();
    }
}