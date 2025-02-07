/*
Faça um algoritmo que leia a altura e o sexo de uma pessoa:
Calcule e mostre seu peso ideal.
Considere as seguintes forulas
    - Masculino: (72.7 * altura) - 58;
    - Feminino: (62.1 * altura) - 44.7;
*/

import java.util.Scanner;

public class CalculaPesoIdeal{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        System.out.println("Qual o seu sexo? Masculino ou Feminino?");
        String sexo = input.nextLine();

        System.out.println("Insira sua altura (Ex = 1,70)");
        double altura = input.nextDouble();

        if (sexo.equals("Masculino")) {

            double pesoIdealMasc = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é: " + pesoIdealMasc + "Kg");

        } else if (sexo.equals("Feminino")){

            double pesoIdealMasc = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é: " + pesoIdealMasc + "Kg");

        } else {

            System.out.println("Por favor, insira um sexo válido!");

        }

        input.close();

    }

}